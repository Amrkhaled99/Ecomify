package com.ecomify.controller;


import com.ecomify.model.Category;
import com.ecomify.model.Product;
import com.ecomify.model.Size;
import com.ecomify.service.CategoryService;
import com.ecomify.service.ProductService;
import com.ecomify.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ProductService productService;
    @Autowired
    private SizeService sizeService;


    // CRUD operations for Category entity
    @PostMapping("/categories")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @GetMapping("/categories/{id}")
    public Category getCategory(@PathVariable Long id) {
        return categoryService.getCategory(id);
    }

    @PutMapping("/categories/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }


    // CRUD operations for Product entity

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }



    // CRUD operations for Size entity

    @PostMapping("/sizes")
    public Size createSize(@RequestBody Size size) {
        return sizeService.createSize(size);
    }

    @GetMapping("/sizes/{id}")
    public Size getSize(@PathVariable Long id) {
        return sizeService.getSize(id);
    }

    @PutMapping("/sizes/{id}")
    public Size updateSize(@PathVariable Long id, @RequestBody Size size) {
        return sizeService.updateSize(id, size);
    }

    @DeleteMapping("/sizes/{id}")
    public void deleteSize(@PathVariable Long id) {
        sizeService.deleteSize(id);
    }

    @GetMapping("/sizes")
    public List<Size> getAllSizes() {
        return sizeService.getAllSizes();
    }



}
