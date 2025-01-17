package com.kousoft.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kousoft.user.model.User;
import com.kousoft.user.service.UserService;
import com.kousoft.user.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/getuser")
    public List<User> listUser() {
        return userService.findAll();
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
    	System.out.println("enter into userservice");
        return userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Long id) {
        userService.delete(id);
        return "success";
    }

}