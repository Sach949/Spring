package com.xworkz.ticket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TicketBookingController {

    @RequestMapping("/page")
    public String returnPage(){
        System.out.println("Returning to ticket booking succes page");
        return "success.jsp";
    }
}
