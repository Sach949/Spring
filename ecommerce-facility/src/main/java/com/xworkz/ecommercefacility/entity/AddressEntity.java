package com.xworkz.ecommercefacility.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
//@Table(name = "ADDRESS_INFO")
@Data
public class AddressEntity {

    @Id
    @Column(name = "ADDRESS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    @Column(name = "ADDRESS_NAME")
    private String address;

    @Column(name = "TYPE_OF_ADDRESS")
    private String addressType;

    @Column(name = "MOBILE")
    private long mobile;
}
