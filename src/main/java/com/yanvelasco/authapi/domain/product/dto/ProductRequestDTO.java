package com.yanvelasco.authapi.domain.product.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record ProductRequestDTO(
        @NotBlank
        String name,
        @NotNull
        Integer price
) {
}