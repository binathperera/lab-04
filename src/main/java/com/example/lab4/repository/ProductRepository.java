package com.example.lab4.repository;

import com.example.lab4.model.ProductDTO;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductDTO,Long> {
    List<ProductDTO> findByYear(int year);

    @Transactional
    void deleteByYear(int year);
}
