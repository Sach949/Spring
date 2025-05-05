package com.xworkz.pass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PassManagementController {

    @RequestMapping("/page")
    public String returnSomePage(){
        System.out.println("Calling Some page");
        return "somePage.jsp";
    }

    @RequestMapping("/secondPage")
    public String printMsg(){
        return "Second Method";
    }
}
