package com.jovitha.devops.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Register {
    @Id
    private String username;
    private String password;
    public Register(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Register(){

    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
