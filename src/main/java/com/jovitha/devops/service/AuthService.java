package com.jovitha.devops.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jovitha.devops.domain.Authentication;
import com.jovitha.devops.repository.AuthRepo;

@Service
public class AuthService {
  @Autowired
  private AuthRepo rep;

  public Authentication login(String username, String password)
  {
    Authentication user = rep.findByUsernameAndPassword(username, password);
    return user;
  }

  public void saveUser(String username, String password) 
  {
    Authentication user = new Authentication();
    user.setUsername(username);
    user.setPassword(password);
    rep.save(user);
  }
}
