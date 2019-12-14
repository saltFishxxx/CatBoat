package cn.xyh.catboat.controller;

import cn.xyh.catboat.exception.UserException;
import cn.xyh.catboat.model.Admin;
import cn.xyh.catboat.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService iAdminService;

    /**
     * 前往登录页面
     * @param request
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(HttpServletRequest request) {
        if (request.getServletContext().getAttribute("userName") != null) {
            return "behind/index";
        }else {
            return "behind/login";
        }
    }

    /**
     * 返回首页
     * @return
     */
    @RequestMapping("/toIndex")
    public String toIndex() {
        return "behind/index";
    }

    /**
     * 登录
     * @param admin
     * @param flag
     * @param model
     * @param httpSession
     * @return
     */
    @RequestMapping("/login")
    public String login(Admin admin, String flag, Model model, HttpSession httpSession) {
        System.out.println(flag);
        if (iAdminService.login(admin)) {
            if (flag != null) {
                httpSession.getServletContext().setAttribute("userName", admin.getAdminName());
            }
            httpSession.setAttribute("userName", admin.getAdminName());
            return "redirect:/admin/toIndex.do";
        }else {
            model.addAttribute("error", "用户名或密码错误");
            return "behind/login";
        }
    }

    /**
     * 退出登录
     * @param httpSession
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpSession httpSession) {
        httpSession.removeAttribute("userName");
        httpSession.getServletContext().removeAttribute("userName");
        return "redirect:/admin/toLogin.do";
    }

    /**
     * 前往添加管理员页面
     */
    @RequestMapping("/toAddPage")
    public String toAddPage() {
       return "behind/admin/adminAdd";
    }

    @RequestMapping("/add")
    public String addAdmin(Admin admin, Model model) {
        try {
            iAdminService.saveAdmin(admin);
            model.addAttribute("message", 1);
        } catch (UserException e) {
            model.addAttribute("message", 0);
        }
        return "behind/admin/adminAdd";
    }

    @RequestMapping("/toUpdatePasswordPage")
    public String toUpdatePassword() {
        return "behind/admin/updatePassword";
    }

    @RequestMapping("/updatePassword")
    public String updatePassword(Admin admin,Model model,HttpServletRequest httpServletRequest) {
        admin.setAdminName((String) httpServletRequest.getSession().getAttribute("userName"));
        iAdminService.updatePassword(admin);
        model.addAttribute("message", "修改成功");
        return "behind/admin/updatePassword";
    }
}
