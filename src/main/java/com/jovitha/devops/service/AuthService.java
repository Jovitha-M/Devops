package com.jovitha.devops.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jovitha.devops.domain.Login;
import com.jovitha.devops.repository.LogRepo;

@Service
public class AuthService {
  @Autowired
  private LogRepo rep;
  public Login log(String username, String password)
  {
    Login user = rep.findByUsernameAndPassword(username, password);
    return user;
  }
  public void saveUser(String username, String password) 
  {
    Login user = new Login();
    user.setUsername(username);
    user.setPassword(password);
    rep.save(user);
  }
}
