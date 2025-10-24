package com.example.lab4.service.impl;

import com.example.lab4.entity.ProductEntity;
import com.example.lab4.model.ProductDTO;
import com.example.lab4.repository.ProductRepository;
import com.example.lab4.service.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository repository;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    public ProductDTO addProduct(ProductDTO product) {
        ProductEntity entity = objectMapper.convertValue(product, ProductEntity.class);
        ProductDTO save = objectMapper.convertValue(repository.save(entity), ProductDTO.class);
        return save; // Return 1 to indicate success
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        List<ProductEntity> entities = repository.findAll();
        return objectMapper.convertValue(entities,
                objectMapper.getTypeFactory().constructCollectionType(List.class, ProductDTO.class));
    }

    @Override
    public List<ProductDTO> searchProducts(String productCategory) {
        List<ProductEntity> entities = repository.findByCategoryIgnoreCase(productCategory);
        return objectMapper.convertValue(entities,
                objectMapper.getTypeFactory().constructCollectionType(List.class, ProductDTO.class));
    }

    @Override
    public int deleteProductByName(String productName) {
        return repository.deleteByNameIgnoreCase(productName);
    }
}
