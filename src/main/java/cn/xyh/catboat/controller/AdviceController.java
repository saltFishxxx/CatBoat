package cn.xyh.catboat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/advice")
@Controller
public class AdviceController {

    @RequestMapping("/findAll")
    public String findAll() {
        return "behind/advice/advice";
    }
}
