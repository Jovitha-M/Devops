package com.jovitha.devops.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jovitha.devops.domain.Login;
import com.jovitha.devops.domain.Register;
import com.jovitha.devops.repository.LogRepo;
@Service
public class RegService {
    @Autowired
            private LogRepo logrepo;
            public void saveUser(String username, String password) {
                Login user = new Login();
                user.setUsername(username);
                user.setPassword(password);
                logrepo.save(user);
            }
}
