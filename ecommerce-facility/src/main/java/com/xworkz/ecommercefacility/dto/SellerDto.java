package com.xworkz.ecommercefacility.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class SellerDto {

    private  int sellerId;
    private String sellerName;
    private String typeOfGoodsSelling;
    private String registeredDate;
}
