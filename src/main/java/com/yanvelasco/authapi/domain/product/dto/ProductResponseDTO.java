package com.yanvelasco.authapi.domain.product.dto;


import com.yanvelasco.authapi.domain.product.entity.ProductEntity;

public record ProductResponseDTO(String id, String name, Integer price) {
    public ProductResponseDTO(ProductEntity productEntity){
        this(productEntity.getId(), productEntity.getName(), productEntity.getPrice());
    }
}
