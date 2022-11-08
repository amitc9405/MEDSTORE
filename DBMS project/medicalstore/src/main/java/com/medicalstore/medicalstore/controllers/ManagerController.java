package com.medicalstore.medicalstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.medicalstore.medicalstore.Service.managerService;
import com.medicalstore.medicalstore.Service.myuserdetails;
import com.medicalstore.medicalstore.Service.usersService;
import com.medicalstore.medicalstore.models.manager;
import com.medicalstore.medicalstore.models.users;

@Controller
public class ManagerController {
    
    @Autowired
    managerService managerservice;

    @Autowired
    usersService usersservice;

    @GetMapping("/manager")
    public String home(Model model){
        Object user = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Boolean auth = false;
        if(user instanceof myuserdetails)
        {
            auth=true;
            myuserdetails user1 = (myuserdetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            model.addAttribute("username", user1.getUsername());
            
        }
        model.addAttribute("auth", auth);
        return "manager_home";
    }

    @GetMapping("/manager_profile")
    public String profile(Model model){

            myuserdetails user1 = (myuserdetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            manager manager = managerservice.fetch_by_username(user1.getUsername());
            users user = usersservice.fetchbyEmail(user1.getUsername());
            model.addAttribute("name", manager.getManager_name());
            model.addAttribute("state", manager.getManager_state());
            model.addAttribute("gender", manager.getManager_sex());
            model.addAttribute("aadhar_no", manager.getManager_aadhar_no());
            model.addAttribute("house_no", manager.getManager_house_no());
            model.addAttribute("street",manager.getManager_street());
            model.addAttribute("pincode", manager.getManager_pincode());
            model.addAttribute("city", manager.getManager_city());
            model.addAttribute("email", user.getEmail());
            model.addAttribute("username", user1.getUsername());
            model.addAttribute("salary", manager.getSalary());
            model.addAttribute("phone_no", manager.getManager_phn_no());

            return "manager_profile";

    }
}
