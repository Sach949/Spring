package com.xworkz.ecommercefacility.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class OrderDto {

    private int orderId;
    private String productName;
    private double price;
    private String dateOfPurchase;
}
