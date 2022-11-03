package com.medicalstore.medicalstore.controllers;

// import org.springframework.security.authentication.AnonymousAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/profile")
    public String profile(){
        return "profile"; 
    }
    @GetMapping("/empty_cart")
    public String empty_cart(){
        return "emptycart";
    }
    @GetMapping("/orders")
    public String orders(){
        return "orders";
    }
    @GetMapping("/product_detail")
    public String product_detail(){
        return "productdetail";
    }
    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }
    @GetMapping("/forgotpassword/")
    public String forgot_password(){
        return "forgotpassword";
    }
    @GetMapping("/profile/editaddress")
    public String edit_address(){
        return "editaddress";
    }
}

