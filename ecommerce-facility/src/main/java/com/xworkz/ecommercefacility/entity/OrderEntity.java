package com.xworkz.ecommercefacility.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDER_INFO")
@Data
public class OrderEntity {

    @Id
    @Column(name = "ORDER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "DATE_OF_PURCHASE")
    private String dateOfPurchase;
}
