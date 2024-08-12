package com.yanvelasco.authapi.domain.user.controller;

import com.yanvelasco.authapi.domain.user.dto.AuthenticationDTO;
import com.yanvelasco.authapi.domain.user.dto.RegisterDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO authenticationDTO) {
        var user = new UsernamePasswordAuthenticationToken(authenticationDTO.username(), authenticationDTO.password());
        var auth =  authenticationManager.authenticate(user);
        return ResponseEntity.ok().build();
    }

}
