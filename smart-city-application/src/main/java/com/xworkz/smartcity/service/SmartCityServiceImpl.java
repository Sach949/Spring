package com.xworkz.smartcity.service;

import com.xworkz.smartcity.dto.SmartCityDto;
import com.xworkz.smartcity.entity.SmartCityEntity;
import com.xworkz.smartcity.repo.SmartCityRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Service
public class SmartCityServiceImpl implements SmartCityService{

    @Autowired
    SmartCityRepo repo;

    @Override
    public String saveCityDetails(SmartCityDto smartCityDto) {
        System.out.println("Service method is invoked");
        if(smartCityDto != null){
            SmartCityEntity smartCityEntity = new SmartCityEntity();
            BeanUtils.copyProperties(smartCityDto,smartCityEntity);
            System.out.println("Entity detail is: "+smartCityDto);
            repo.saveCityDetails(smartCityEntity);
        }else{
            System.out.println("Dto is null");
        }
        return "saved";
    }

    @Override
    public List<SmartCityEntity> getAllCityDetails() {
        List<SmartCityEntity> cityEntityList = repo.getAllCityDetails();
        List<SmartCityDto> cityDtoList = new ArrayList<>();
        cityEntityList.stream().forEach(dto->{
            SmartCityDto cityDto = new SmartCityDto();
            cityDto.setCityName(dto.getCityName());
            cityDto.setOfficerInChargeName(dto.getOfficerInChargeName());
            cityDto.setState(dto.getState());
            cityDto.setTotalPopulation(dto.getTotalPopulation());
            cityDto.setAreaInSqrKm(dto.getAreaInSqrKm());
            cityDto.setDateOfSchemeImpl(dto.getDateOfSchemeImpl());
            cityDto.setPollutionLevel(dto.getPollutionLevel());
            cityDto.setNoOfCctvInstalled(dto.getNoOfCctvInstalled());
            cityDto.setEmergencyResponseContact(dto.getEmergencyResponseContact());
            cityDto.setWasteBinAvl(dto.isWasteBinAvl());
        });
        return cityDtoList;
    }

    @Override
    public SmartCityEntity getCityById(int id) {
        return null;
    }
}
