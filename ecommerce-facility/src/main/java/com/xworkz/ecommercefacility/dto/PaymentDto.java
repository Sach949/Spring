package com.xworkz.ecommercefacility.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PaymentDto {

    private int paymentId;
    private String paymentMode;
    private double amount;
    private String status;

}
