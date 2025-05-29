package com.xworkz.ecommercefacility.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_INFO")
@Data
public class ProductEntity {

    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "RATING")
    private String rating;
}
