package com.xworkz.smartcity.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "smart_city_info")
@NamedQuery(name = "getAll", query = "select s from SmartCityEntity s")
@NamedQuery (name = "findById", query = "select s from SmartCityEntity s where s.cityId =:cid ")
public class SmartCityEntity {

    @Id
    @Column(name = "City_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;

    @Column(name = "City_Name")
    private String cityName;

    @Column(name = "Officer_InCharge_Name")
    private String officerInChargeName;

    @Column(name = "State")
    private String state;

    @Column(name = "Total_Population")
    private int totalPopulation;

    @Column(name = "Area_in_SqrKm")
    private double areaInSqrKm;

    @Column(name = "Date_of_SchemeImpl")
    private String dateOfSchemeImpl;

    @Column(name = "Pollution_Level")
    private int pollutionLevel;

    @Column(name = "Total_CCTV_Installed")
    private int noOfCctvInstalled;

    @Column(name = "Emergency_Contact")
    private String emergencyResponseContact;

    @Column(name = "Waste_Bin")
    private boolean isWasteBinAvl;

}
