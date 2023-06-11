package com.ecomify.service;

import com.ecomify.exception.ResourceNotFoundException;
import com.ecomify.model.Category;
import com.ecomify.model.Size;
import com.ecomify.repository.SizeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SizeService {


    @Autowired
    private SizeRepo sizeRepository;

    public List<Size> getAllSizes() {
        return sizeRepository.findAll();
    }

    public Size createSize(Size size) {
        return sizeRepository.save(size);
    }

    public Size updateSize(Long id, Size size) {
        Size existingsize = sizeRepository.findById(id).orElse(null);
        if (existingsize != null) {
            return sizeRepository.save(existingsize);
        }
        return null;
    }
    public void deleteSize(Long id) {
        Size existingSize = getSize(id);
        sizeRepository.delete(existingSize);
    }

    public Size getSize(Long id) {
        return sizeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Size", "id", id));
    }
}
