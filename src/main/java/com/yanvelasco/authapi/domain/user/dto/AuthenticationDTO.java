package com.yanvelasco.authapi.domain.user.dto;

public record AuthenticationDTO(
    String username,
    String password
) {
}
