package cn.xyh.catboat.controller;


import cn.xyh.catboat.model.AdminNews;
import cn.xyh.catboat.service.ICatNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private ICatNewsService iCatNewsService;

    @RequestMapping("/toNewsPage")
    public String toNewsPage() {
        return "behind/news/uploadNews";
    }

    @RequestMapping("/saveNews")
    @ResponseBody
    public int saveNews(AdminNews adminNews) {
        adminNews.setNewsTime(new Date());
        iCatNewsService.saveNews(adminNews);
        return 200;
    }
}
