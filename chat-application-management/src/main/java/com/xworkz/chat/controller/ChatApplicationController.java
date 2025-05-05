package com.xworkz.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatApplicationController {

    @RequestMapping("/page")
    public String returnPage(){
        System.out.println("Returning to chat succes page");
        return "success.jsp";
    }
}
