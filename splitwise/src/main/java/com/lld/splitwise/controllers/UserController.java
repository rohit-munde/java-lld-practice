package com.lld.splitwise.controllers;

import com.lld.splitwise.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public User getUserById(Integer userId){
        for(User user: userList){
            if(user.getId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userList;
    }
}
