package com.medicalstore.medicalstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicalstore.medicalstore.Service.ShopService;
import com.medicalstore.medicalstore.models.manager;
import com.medicalstore.medicalstore.models.shop;

@Controller
@RequestMapping("/shop_registration")
public class ShopRegistrationController {
    
    @Autowired
    ShopService shopService;

    @ModelAttribute("Shop")
    public shop Shop(){
        return new shop();
    }

    @GetMapping
    public String showRegistrationForm(Model model) {
        // model.addAttribute("user", new usersRegistrationdto());
        System.out.println("in controller get.");
        List<manager> managers= shopService.ManagersWithoutShop();
        model.addAttribute("managers", managers);
        return "shop_registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("Shop") shop Shop){
        System.out.println("in controller post before userservice save");

        shopService.save_shop(Shop);
        System.out.println("in controller post.");
        
        return "redirect:/shop_registration?success";
    }
}
