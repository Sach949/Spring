package com.xworkz.smartcity.controller;

import com.xworkz.smartcity.dto.SmartCityDto;
import com.xworkz.smartcity.service.SmartCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SmartCityController {

    @Autowired
    SmartCityService service;

    @PostMapping("/saving")
    public String saveCityDetails(SmartCityDto cityDto){
        service.saveCityDetails(cityDto);
        System.out.println("City details are: "+cityDto);
        return "success.jsp";
    }

}
