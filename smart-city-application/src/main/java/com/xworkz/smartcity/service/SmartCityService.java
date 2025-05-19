package com.xworkz.smartcity.service;

import com.xworkz.smartcity.dto.SmartCityDto;
import com.xworkz.smartcity.entity.SmartCityEntity;

import java.util.List;

public interface SmartCityService {

    String saveCityDetails(SmartCityDto smartCityDto);

    List<SmartCityEntity> getAllCityDetails();

    SmartCityEntity getCityById(int id);
}
