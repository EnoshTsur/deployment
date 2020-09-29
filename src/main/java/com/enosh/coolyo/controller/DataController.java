package com.enosh.coolyo.controller;

import com.enosh.coolyo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/data")
public class DataController {


    @GetMapping("/get")
    public ResponseEntity<User> get(){
        return ResponseEntity.ok(new User("Avi", 23));
    }

}
