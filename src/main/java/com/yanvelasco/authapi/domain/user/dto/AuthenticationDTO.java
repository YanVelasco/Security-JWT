package com.yanvelasco.authapi.domain.user.dto;

public record AuthenticationDTO(
        String login, String password
) {
}