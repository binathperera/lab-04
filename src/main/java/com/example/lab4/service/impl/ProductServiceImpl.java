package com.example.lab4.service.impl;

import com.example.lab4.model.ProductDTO;
import com.example.lab4.repository.ProductRepository;
import com.example.lab4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository repository;

}
