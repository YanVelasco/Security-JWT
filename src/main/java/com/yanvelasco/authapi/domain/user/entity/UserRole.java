package com.yanvelasco.authapi.domain.user.entity;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private final String role;

    UserRole(String role){
        this.role = role;
    }

    public static UserRole fromString(String role){
        for(UserRole userRole : UserRole.values()){
            if(userRole.role.equals(role)){
                return userRole;
            }
        }
        return null;
    }


    public String getRole(){
        return role;
    }
}
