package com.xworkz.ecommercefacility.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
//@Table(name = "ecommerce_user_info")
@Data
public class RegisterEntity {

    @Id
    @Column(name="REG_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regID;

    @Column(name="USERNAME")
    private String userName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "MOBILE_NO")
    private long mobile;
}
