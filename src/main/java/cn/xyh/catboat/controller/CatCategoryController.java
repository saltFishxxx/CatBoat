package cn.xyh.catboat.controller;

import cn.xyh.catboat.model.CatCategory;
import cn.xyh.catboat.service.ICatCategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
@RequestMapping(value = "/category")
public class CatCategoryController {

    @Autowired
    private ICatCategoryService iCatCategoryService;

    @RequestMapping("/toIndexPage")
    public String toIndexPage(@RequestParam(required = true, name = "page", defaultValue = "1") int page,
                              @RequestParam(required = true, name = "size", defaultValue = "5") int size, Model model) {
        PageHelper.startPage(page, size);
        List<CatCategory> all = iCatCategoryService.findAll();
        PageInfo<CatCategory> catCategoryPageInfo = new PageInfo<>(all);
        model.addAttribute("pageInfo", catCategoryPageInfo);
        return "behind/category/catCategory";
    }

    @RequestMapping("/toUpdatePage")
    public String toEditPage(Integer id, Model model, int page, int size) {
        CatCategory one = iCatCategoryService.findOne(id);
        model.addAttribute("category", one);
        model.addAttribute("page", page);
        model.addAttribute("size", size);
        return "behind/category/categoryEdit";
    }

    @RequestMapping("/toAddPage")
    public String toAddPage(int page, int size, Model model) {
        model.addAttribute("page", page);
        model.addAttribute("size", size);
        return "behind/category/categoryAdd";
    }

    @RequestMapping("/toDetailPage")
    public String toDetailPage(Integer id, Model model, int page, int size) {
        CatCategory one = iCatCategoryService.findOne(id);
        model.addAttribute("category", one);
        model.addAttribute("page", page);
        model.addAttribute("size", size);
        return "behind/category/categoryDetail";
    }

    @RequestMapping("/add")
    public String add(int page, int size, CatCategory catCategory) {
        iCatCategoryService.add(catCategory);
        return "redirect:/category/toIndexPage.do?page="+page+"&size="+size;
    }

    @RequestMapping("/delete")
    public String delete(Integer id, int page, int size) {
        iCatCategoryService.delete(id);
        return "redirect:/category/toIndexPage.do?page="+page+"&size="+size;
    }

    @RequestMapping("/update")
    public String update(int page, int size, CatCategory catCategory) {
        System.out.println(111111);
        iCatCategoryService.update(catCategory);
        return "redirect:/category/toIndexPage.do?page="+page+"&size="+size;
    }
}

