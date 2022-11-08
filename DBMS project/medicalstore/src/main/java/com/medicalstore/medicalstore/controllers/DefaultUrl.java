package com.medicalstore.medicalstore.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultUrl {
    
    @GetMapping("/default")
    public String defaultpage(HttpServletRequest request){
        System.out.println("---------------------------------------");
        System.out.println(request.isUserInRole("MANAGER"));
        System.out.println(request.isUserInRole("ROLE_MANGER"));
        if (request.isUserInRole("ROLE_MANAGER"))
        {
            System.out.println("IN IF");
            return "redirect:/manager";
        }
        else
        System.out.println("out of if");
        return "redirect:/";

    }
}
