package com.user.service.controller;

import com.user.service.entity.User;
import com.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id){
        User user1 = userService.getUserById(id);
        return ResponseEntity.ok(user1);
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers(){
        List<User> allusers = userService.getUsers();
        return ResponseEntity.ok(allusers);
    }
}
