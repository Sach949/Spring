package com.xworkz.ecommercefacility.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SELLER_INFO")
@Data
public class SellerEntity {

    @Id
    @Column(name = "SELLER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int sellerId;

    @Column(name = "SELLER_NAME")
    private String sellerName;

    @Column(name = "TYPE_OF_GOODS_SELLING")
    private String typeOfGoodsSelling;

    @Column(name = "REGISTERED_DATE")
    private String registeredDate;
}
