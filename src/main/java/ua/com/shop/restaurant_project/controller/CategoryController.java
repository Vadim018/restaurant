package ua.com.shop.restaurant_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.shop.restaurant_project.entity.Category;
import ua.com.shop.restaurant_project.service.CategoryService;
import java.util.List;

@Controller
public class CategoryController
{
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public String getPageCategory(Model model)
    {
        List<Category> categoryList = categoryService.getAllCategory();
        model.addAttribute("categories", categoryList);
        return "category"; // category.ftl
    }
    @GetMapping("/search")
    public String searchCategories(@RequestParam String q, Model model) {
        List<Category> categoryList = categoryService.searchCategoriesByName(q);
        model.addAttribute("categories", categoryList);
        return "category";
    }
}