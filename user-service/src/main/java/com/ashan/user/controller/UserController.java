package com.ashan.user.controller;


import com.ashan.user.dto.response.IUserResponse;
import com.ashan.user.dto.request.UserDTO;
import com.ashan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<IUserResponse> addUser(@RequestBody UserDTO user) {
        return userService.addUser(user);
    }

    @GetMapping("/get/all")
    public ResponseEntity<IUserResponse> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/get/email")
    public ResponseEntity<IUserResponse> getUserByEmail(@RequestBody UserDTO email) {
        System.out.println(email.getEmail());
        return userService.getUserByEmail(email.getEmail());
    }
}
