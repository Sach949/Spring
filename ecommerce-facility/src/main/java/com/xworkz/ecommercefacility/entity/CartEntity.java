package com.xworkz.ecommercefacility.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CART_INFO")
@Data
public class CartEntity {

    @Id
    @Column(name = "CART_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "TOTAL_NUMBER")
    private int totalNo;

    @Column(name = "TOTAL_PRICE")
    private double totalPrice;
}
