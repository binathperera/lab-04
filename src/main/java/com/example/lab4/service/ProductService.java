package com.example.lab4.service;

import com.example.lab4.model.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public ProductDTO addProduct(ProductDTO product);
    public List<ProductDTO> getAllProducts();
    public List<ProductDTO> searchProducts(String productCategory);
    public int deleteProductByName(String productName);
}
