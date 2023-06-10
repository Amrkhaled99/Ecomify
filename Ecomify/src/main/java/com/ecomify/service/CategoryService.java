package com.ecomify.service;

import com.ecomify.model.Category;
import com.ecomify.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;


    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }


    public Category getCategory(Long id) {

        return categoryRepo.findById(id).orElse(null);
    }

    public Category updateCategory(Long id, Category category) {
        Category existingCategory = categoryRepo.findById(id).orElse(null);
        if (existingCategory != null) {
            return categoryRepo.save(category);
        }
        return null;
    }

    public void deleteCategory(Long id) {
        categoryRepo.deleteById(id);
    }

    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }
}
