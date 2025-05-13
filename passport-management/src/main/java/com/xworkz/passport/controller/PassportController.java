package com.xworkz.passport.controller;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class PassportController {

    @Autowired
    PassportService service;

    @PostMapping("saving")
    public String savePassportMethod(PassportDto dto) {
        service.saveDataDto(dto);
        System.out.println("passport details are: " + dto);
        return "success.jsp";
    }

    @GetMapping("getAllPassportApplication")
    public String getAll() {
        service.getAll();
        System.out.println("Application details are: ");
        return "view.jsp";
    }
}
