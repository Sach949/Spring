package com.xworkz.pass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PassManagementController {

    @RequestMapping("/login")
    public String returnSomePage(@RequestParam("name")String name, @RequestParam("email")String email){
        System.out.println("Calling Some page");
        System.out.println("\n"+name);
        System.out.println("\n"+email);
        return "somePage.jsp";
    }

}
