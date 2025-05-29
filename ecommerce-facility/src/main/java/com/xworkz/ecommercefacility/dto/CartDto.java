package com.xworkz.ecommercefacility.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CartDto {

    private int cartId;
    private String productName;
    private int totalNo;
    private double totalPrice;
}
