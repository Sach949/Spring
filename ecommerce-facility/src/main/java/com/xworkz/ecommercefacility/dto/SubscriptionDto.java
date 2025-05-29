package com.xworkz.ecommercefacility.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class SubscriptionDto {

    private int subscriberId;
    private String validity;
    private double price;
    private String typeOfSubscription;
}
