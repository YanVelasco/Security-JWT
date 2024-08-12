package com.yanvelasco.authapi.domain.product.repository;


import com.yanvelasco.authapi.domain.product.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}