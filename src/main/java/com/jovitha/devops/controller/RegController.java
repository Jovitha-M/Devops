package com.jovitha.devops.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jovitha.devops.domain.Login;
import com.jovitha.devops.domain.Register;
import com.jovitha.devops.service.RegService;

@Controller
public class RegController {
    @Autowired
    private RegService service;

    @PostMapping("/register")
    public String register(@ModelAttribute("user") Login user) {
 
        service.saveUser(user.getUsername(), user.getPassword());
        return "redirect:/log";
    }

    @RequestMapping("/log")
    public String login(){
        return "index";
    }
}
