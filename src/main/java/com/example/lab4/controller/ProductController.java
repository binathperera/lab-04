package com.example.lab4.controller;

import com.example.lab4.model.ProductDTO;
import com.example.lab4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    ProductService service;


}
