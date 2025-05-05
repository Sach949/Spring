package com.xworkz.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryManagementCotroller {

    @RequestMapping("/page")
    public String returnPage(){
        System.out.println("Returning to succes page");
        return "success.jsp";
    }

    @RequestMapping("/display")
    public String printMsg(){
        return "display page";
    }
}
