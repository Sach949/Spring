package com.xworkz.ecommercefacility.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AddressDto {

    private int addressId;
    private String address;
    private String addressType;
    private long mobile;
}
