package com.xworkz.ecommercefacility.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "SUBSCRIPTION_INFO")
@Data
public class SubscriptionEntity {

    @Id
    @Column(name = "SUBSCRIBER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subscriberId;

    @Column(name = "VALIDITY")
    private String validity;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "TYPE_OF_SUBSCRIPTION")
    private String typeOfSubscription;
}
