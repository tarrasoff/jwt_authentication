package com.example.jwt_authentication.dtos;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}