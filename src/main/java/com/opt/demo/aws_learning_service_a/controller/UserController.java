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
        String inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            return ResponseEntity.internalServerError().body("Unable to determine IP address");
        }
        return ResponseEntity.ok("System monitoring shows the user service is functioning correctly, with no anomalies detected on the server "+ inetAddress);
    }
}
