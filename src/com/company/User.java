package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String username;
    private String password;
    private Role role;

    enum Role{
        ADMIN,CUSTOMER
    }

    public User(String username, String password, Role role) {
        this.username = username;
        if (isPasswordValid(password)){
            this.password = password;
        } else {
            this.password = null;
        }
        this.role = role;
    }

    public User() {
    }

    public boolean isPasswordValid(String password){
        Pattern pattern = Pattern.compile("((?=.*\\d{3,})(?=.*[A-Z])(?=.*[#%!]).{8,40})");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    //region Getter and Setter
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    //endregion
}
