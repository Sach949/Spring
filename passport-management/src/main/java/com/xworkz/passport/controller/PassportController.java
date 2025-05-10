package com.xworkz.passport.controller;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassportController {

    @Autowired
    PassportService service;

    @PostMapping("saving")
    public String savePassportMethod(PassportDto dto){
        service.saveDataDto(dto);
        System.out.println("passport details are: "+dto);
        return "success.jsp";
    }
}
