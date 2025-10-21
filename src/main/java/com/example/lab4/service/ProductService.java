package com.example.lab4.service;

import com.example.lab4.model.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<ProductDTO> getServicesByYear(int year);
    public Optional<ProductDTO> getTypeById(long id);

    public void deleteServicesByYear(int year);
}
