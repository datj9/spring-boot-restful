package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController()
@RequestMapping("/users")
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getListUser() {
        List<UserDto> users = userService.getListUser();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") int userId) {
        UserDto user = userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }

//    @GetMapping("/search")
//    public ResponseEntity<?> searchUser(@RequestParam(value = "name",defaultValue = "Ha",required = true) String name) {
//        System.out.println(name);
//        return null;
//    }
    @GetMapping("/search")
    public ResponseEntity<?> searchUser(@RequestParam List<String> name) {
        System.out.println(name.get(0));
        return null;
    }

    @PostMapping("")
    public ResponseEntity<?> createUser() {
        return null;
    }

    @PutMapping("/{id}")
    public  ResponseEntity<?> updateUser() {
        return null;
    }
}
