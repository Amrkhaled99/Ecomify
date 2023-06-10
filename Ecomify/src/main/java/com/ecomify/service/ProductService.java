package com.ecomify.service;

import com.ecomify.exception.ResourceNotFoundException;
import com.ecomify.model.Product;
import com.ecomify.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepository;

    public ProductService(ProductRepo productRepository) {
        this.productRepository = productRepository;
    }


    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProduct(Long id) {
//        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
        return productRepository.findById(id).orElse(null);

    }


    public Product updateProduct(Long id, Product product) {
        Product existingProduct = getProduct(id);

        return productRepository.save(existingProduct);
    }

    public void deleteProduct(Long id) {
        Product existingProduct = getProduct(id);
        productRepository.delete(existingProduct);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();

}


}
