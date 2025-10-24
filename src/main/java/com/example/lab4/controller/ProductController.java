package com.example.lab4.controller;

import com.example.lab4.model.ProductDTO;
import com.example.lab4.service.ProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping
    public ResponseEntity<ProductDTO> addProduct(@RequestBody @Validated ProductDTO product){
        product = service.addProduct(product);
        if(product != null){
            return new ResponseEntity<>(product, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts(){
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/category/{productCategory}")
    public ResponseEntity<List<ProductDTO>> searchProducts(@PathVariable String productCategory){
        return new ResponseEntity<>(service.searchProducts(productCategory), HttpStatus.OK);
    }

    @DeleteMapping("/{productName}")
    public ResponseEntity<Integer> deleteProductByName(@PathVariable String productName){
        return new ResponseEntity<>(service.deleteProductByName(productName), HttpStatus.OK);
    }

}
