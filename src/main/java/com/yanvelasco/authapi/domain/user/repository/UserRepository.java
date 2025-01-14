package com.yanvelasco.authapi.domain.user.repository;

import com.yanvelasco.authapi.domain.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserDetails findByLogin(String login);
}
