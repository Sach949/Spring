package com.xworkz.ecommercefacility.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "LOGIN_INFO")
@Data
public class LoginEntity {

    @Id
    @Column(name = "LOGIN_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int loginId;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;
}
