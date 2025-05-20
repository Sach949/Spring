package com.xworkz.passport.controller;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public String getAll(Model model) {
        List<PassportDto> dtos = service.getAll();
        model.addAttribute("listOfDtos",dtos);
//        service.getAll();
//        System.out.println("invoking controller"+service.getAll());
        System.out.println("Application details are: ");
        return "view.jsp";
    }

    @GetMapping("getById")
    public String getApplicantById(@RequestParam("passportId")String id, Model model){
       PassportDto passportDto = service.getApplicantById(Integer.parseInt(id));
       model.addAttribute("item",passportDto);
        System.out.println("Controller: "+passportDto);
        return "viewPassport.jsp";
    }

    @GetMapping("update")
    public String updateApplicationById(@RequestParam("passportId")String pid, Model model){
        PassportDto passportDto = service.getApplicantById(Integer.parseInt(pid));
        model.addAttribute("item",passportDto);
        System.out.println("Update Controller: "+passportDto);
        return "update.jsp";
    }

    @PostMapping("updating")
    public String update(PassportDto dto){
        System.out.println("Update id is:"+dto);
        service.updateApplicationById(dto);
        return "updateSuccess.jsp";
    }


}
