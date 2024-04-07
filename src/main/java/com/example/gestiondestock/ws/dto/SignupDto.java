package com.example.gestiondestock.ws.dto;

import com.example.gestiondestock.enums.UserRole;
import lombok.Data;

@Data
public class SignupDto {
    private Long id;
    private String email;
    private String password;
    private String telephone;

}
