package com.jovitha.devops.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jovitha.devops.domain.Authentication;
import com.jovitha.devops.service.AuthService;

@Controller
@RequestMapping("/")
public class AuthController {
  @Autowired
  private AuthService service;

  @PostMapping("/log")
  public String login(@ModelAttribute("user") Authentication user) {
      Authentication oauthUser = service.login(user.getUsername(), user.getPassword());
      System.out.print(oauthUser);
      if (Objects.nonNull(oauthUser)) {
          return "redirect:/disp";
      } else {
          return "redirect:/";
      }
  }

  @PostMapping("/register")
  public String register(@ModelAttribute("user") Authentication user) {
      service.saveUser(user.getUsername(), user.getPassword());
      return "redirect:/disp";
  }

}
