package cn.xyh.catboat.controller;


import cn.xyh.catboat.model.SysLog;
import cn.xyh.catboat.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/log")
@Controller
public class LogController {

    @Autowired
    private ISysLogService iSysLogService;

    @RequestMapping("/findAllLogs")
    public String findAllLogs(Model model) {
        List<SysLog> all = iSysLogService.findAll();
        model.addAttribute("logs", all);
        return "behind/log/log";
    }
}
