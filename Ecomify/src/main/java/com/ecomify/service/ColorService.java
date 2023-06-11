package com.ecomify.service;

import com.ecomify.exception.ResourceNotFoundException;
import com.ecomify.model.Color;
import com.ecomify.model.Size;
import com.ecomify.repository.ColorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ColorService {

    @Autowired
    private ColorRepo colorRepository;

    public Color getColor(Long id) {
        return colorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Color", "id", id));
    }

    public List<Color> getAllColors() {
        return colorRepository.findAll();
    }

    public Color createColor(Color color) {
        return colorRepository.save(color);
    }

    public Color updateColor(Long id, Color color) {
        Color existingcolor = colorRepository.findById(id).orElse(null);
        if (existingcolor != null) {
            return colorRepository.save(existingcolor);
        }
        return null;
    }
    public void deleteColor(Long id) {
        if (!colorRepository.existsById(id)) {
            throw new ResourceNotFoundException("Color", "id", id);
        }
        colorRepository.deleteById(id);
    }
}