package com.example.AuthenticationTest.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDtoResponse {
    private Long id;
    private String username;
    private String email;
}
