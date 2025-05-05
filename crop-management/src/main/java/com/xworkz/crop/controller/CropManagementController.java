package com.xworkz.crop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CropManagementController {

    @RequestMapping("/page")
    public String returnPage(){
        System.out.println("Returning to crop succes page");
        return "success.jsp";
    }

}
