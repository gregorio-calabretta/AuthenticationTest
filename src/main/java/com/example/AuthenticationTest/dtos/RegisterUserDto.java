package com.example.AuthenticationTest.dtos;

import com.example.AuthenticationTest.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterUserDto {
    private String email;
    private String password;
    private String username;
}
