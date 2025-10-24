package com.example.lab4.repository;

import com.example.lab4.entity.ProductEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

    public List<ProductEntity> findByCategoryIgnoreCase(String category);

    public List<ProductEntity> findByNameIgnoreCase(String productName);

    @Transactional
    @Modifying
    @Query("DELETE FROM ProductEntity p WHERE LOWER(p.name) = LOWER(:productName)")
    public int deleteByNameIgnoreCase(String productName);
}
