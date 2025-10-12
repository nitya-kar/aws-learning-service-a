package com.opt.demo.aws_learning_service_a.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/health")
    public ResponseEntity<String> getUserServiceHealth(){
        return ResponseEntity.ok("System monitoring shows the user service is functioning correctly, with no anomalies detected.");
    }
}
