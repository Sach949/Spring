package com.xworkz.ecommercefacility.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_INFO")
@Data
public class PaymentEntity {

    @Id
    @Column(name = "PAYMENT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;

    @Column(name = "PAYMENT_MODE")
    private String paymentMode;

    @Column(name = "AMOUNT")
    private double amount;

    @Column(name = "PAYMENT_STATUS")
    private String status;
}
