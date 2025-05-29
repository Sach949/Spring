package com.xworkz.ecommercefacility.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ProductDto {

    private int productId;
    private String productName;
    private double price;
    private String rating;
}
