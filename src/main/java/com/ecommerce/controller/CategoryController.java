package com.ecommerce.controller;

import com.ecommerce.model.Category;
import com.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/create")
    public String createCategory(@RequestBody Category category)
    {
        categoryService.createCategory(category);
        System.out.println("Success!");
        return "success";
    }
    @GetMapping("/list")
    public List<Category> listAllCategory()
    {
        return categoryService.listAllCategory();
    }
}
