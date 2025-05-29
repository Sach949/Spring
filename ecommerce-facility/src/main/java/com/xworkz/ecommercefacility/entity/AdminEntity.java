package com.xworkz.ecommercefacility.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
//@Table(name = "ADMIN_INFO")
@Data
public class AdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;


    private String username;


    private String password;
}
