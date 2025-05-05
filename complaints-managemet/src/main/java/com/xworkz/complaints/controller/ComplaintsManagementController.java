package com.xworkz.complaints.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComplaintsManagementController {


    @RequestMapping("/page")
    public String returnPage(){
        System.out.println("Returning to complaints succes page");
        return "success.jsp";
    }
}
