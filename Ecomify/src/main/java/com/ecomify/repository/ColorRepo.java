package com.ecomify.repository;

import com.ecomify.model.Color;
import com.ecomify.model.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepo extends JpaRepository<Color,Long> {
}
