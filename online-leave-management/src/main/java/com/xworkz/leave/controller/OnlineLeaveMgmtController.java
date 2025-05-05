package com.xworkz.leave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OnlineLeaveMgmtController {

    @RequestMapping("/page")
    public String returnPage(){
        System.out.println("Returning to online leave succes page");
        return "success.jsp";
    }
}
