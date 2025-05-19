package com.xworkz.smartcity.repo;

import com.xworkz.smartcity.entity.SmartCityEntity;

import java.util.List;

public interface SmartCityRepo {

    String saveCityDetails(SmartCityEntity entity);

    List<SmartCityEntity> getAllCityDetails();

    SmartCityEntity getCityById(int id);
}
