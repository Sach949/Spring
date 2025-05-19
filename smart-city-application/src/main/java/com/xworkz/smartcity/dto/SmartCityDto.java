package com.xworkz.smartcity.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class SmartCityDto {

    private int cityId;
    private String cityName;
    private String officerInChargeName;
    private String state;
    private int totalPopulation;
    private double areaInSqrKm;
    private String dateOfSchemeImpl;
    private int pollutionLevel;
    private int noOfCctvInstalled;
    private String emergencyResponseContact;
    private boolean isWasteBinAvl;

}
