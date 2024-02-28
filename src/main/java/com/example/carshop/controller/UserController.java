package com.example.carshop.controller;

import com.example.carshop.DTO.UserDTO;
import com.example.carshop.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/xd")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add-user")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userService.createUser(userDTO));
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> loginUser(@RequestBody UserDTO userDTO){
        UserDTO checkedUser = userService.compareUser(userDTO);
        if(checkedUser != null){
            return ResponseEntity.ok(checkedUser);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/changePassword")
    public ResponseEntity<UserDTO> changePassword (@RequestBody UserDTO userDTO){
        UserDTO changedPassword = userService.changePassword(userDTO);
        if(changedPassword != null){
            return ResponseEntity.ok(changedPassword);
        } else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}