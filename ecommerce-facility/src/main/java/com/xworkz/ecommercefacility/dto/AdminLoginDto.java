package com.xworkz.ecommercefacility.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AdminLoginDto {

    private int adminId;
    private String username;
    private String password;
}
