package com.yanvelasco.authapi.domain.product.Controller;


import com.yanvelasco.authapi.domain.product.dto.ProductRequestDTO;
import com.yanvelasco.authapi.domain.product.dto.ProductResponseDTO;
import com.yanvelasco.authapi.domain.product.entity.ProductEntity;
import com.yanvelasco.authapi.domain.product.repository.ProductRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository repository;

    @PostMapping
    public ResponseEntity postProduct(@RequestBody @Valid ProductRequestDTO body){
        ProductEntity newProduct = new ProductEntity(body);

        this.repository.save(newProduct);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllProducts(){
        List<ProductResponseDTO> productList = this.repository.findAll().stream().map(ProductResponseDTO::new).toList();

        return ResponseEntity.ok(productList);
    }
}
