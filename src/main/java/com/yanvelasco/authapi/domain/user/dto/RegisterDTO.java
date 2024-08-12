package com.yanvelasco.authapi.domain.user.dto;

import com.yanvelasco.authapi.domain.user.entity.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}