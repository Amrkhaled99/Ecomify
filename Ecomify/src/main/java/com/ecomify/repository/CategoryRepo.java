package com.ecomify.repository;

import com.ecomify.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository< Category,Long> {
}
