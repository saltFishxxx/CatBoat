package cn.xyh.catboat.controller;

import cn.xyh.catboat.mapper.AdminRoleMapper;
import cn.xyh.catboat.model.AdminPerssion;
import cn.xyh.catboat.model.AdminRole;
import cn.xyh.catboat.service.IAdminResourcesService;
import cn.xyh.catboat.service.IAdminRoleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/userManager")
@Controller
public class UserManagerController {

    @Autowired
    private IAdminResourcesService iAdminResourcesService;

    @Autowired
    private IAdminRoleService iAdminRoleService;

    @RequestMapping("/toAdminUserPage")
    public String toAdminUserPage(Model model) {
        return "behind/admin/adminUser";
    }

    @RequestMapping("/toAdminRolePage")
    public String toAdminRolePage(Model model, @RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "size", defaultValue = "5") int size) {
        PageInfo<AdminRole> adminRolePageInfo = new PageInfo<>(iAdminRoleService.findAll(page, size));
        model.addAttribute("pageInfo", adminRolePageInfo);
        return "behind/admin/adminRole";
    }

    @RequestMapping("/toAdminResourcesPage")
    public String toAdminResourcesPage(Model model, @RequestParam(value = "page",defaultValue = "1") int page,@RequestParam(value = "size", defaultValue = "5") int size) {
        PageInfo<AdminPerssion> adminPerssionPageInfo = new PageInfo<>(iAdminResourcesService.findAll(page, size));
        model.addAttribute("pageInfo", adminPerssionPageInfo);
        return "behind/admin/adminResources";
    }

    @RequestMapping("/toRoleAddPage")
    public String toRoleAddPage() {
        return "behind/admin/roleAdd";
    }

    @RequestMapping("/toResourcesAddPage")
    public String toResourcesAddPage() {
        return "behind/admin/resourcesAdd";
    }

    @RequestMapping("/toRoleDetailPage")
    public String toRoleDetailPage(Model model, Integer roleId) {
        AdminRole allRoleAndResource = iAdminRoleService.findAllRoleAndResource(roleId);
        model.addAttribute("roleResources", allRoleAndResource);
        return "behind/admin/roleDetail";
    }

    @RequestMapping("/toRoleAddResourcePage")
    public String toRoleAddResourcePage(Integer roleId, Model model) {
        System.out.println(roleId);
        List<AdminPerssion> otherRersources = iAdminRoleService.findOtherRersources(roleId);
        System.out.println(otherRersources);
        model.addAttribute("resources", otherRersources);
        model.addAttribute("roleId", roleId);
        return "behind/admin/RoleAddResource";
    }

    @RequestMapping("/roleAdd")
    public String roleAdd(AdminRole adminRole) {
        iAdminRoleService.addRole(adminRole);
        return "redirect:/userManager/toAdminRolePage.do";
    }

    @RequestMapping("/resourceAdd")
    public String resourcesAdd(AdminPerssion adminPerssion) {
        iAdminResourcesService.addResource(adminPerssion);
        return "redirect:/userManager/toAdminResourcesPage.do";
    }

    @RequestMapping("/roleDelete")
    public String roleDelete(Integer id) {
        iAdminRoleService.deleteRole(id);
        return "redirect:/userManager/toAdminRolePage.do";
    }

    @RequestMapping("/resourcesDelete")
    public String resourcesDelete(Integer id) {
        iAdminResourcesService.deleteResource(id);
        return "redirect:/userManager/toAdminResourcesPage.do";
    }

    @RequestMapping("/addRoleResource")
    public String addRoleResource(Integer roleId, Integer resourceId, Model model) {
        iAdminRoleService.addRoleResource(roleId, resourceId);
        model.addAttribute("roleId", roleId);
        return "forward:/userManager/toRoleAddResourcePage.do";
    }
}
