package com.opt.demo.aws_learning_service_a.controller;

import com.opt.demo.aws_learning_service_a.dto.JokeRequest;
import com.opt.demo.aws_learning_service_a.service.SpringAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/v1")
public class SpringAIController {

    @Autowired
    SpringAIService aiService;

    @PostMapping("/joke")
    public String getJoke(@RequestBody JokeRequest request) {
        return aiService.getJoke(request.getTopic());
    }

    @GetMapping("/book")
    public String getBook(@RequestParam(name = "category") String category, @RequestParam(name = "year") String year) {
        return aiService.getBook(category, year);
    }

    @GetMapping(value = "/image", produces = "image/jpeg")
    public ResponseEntity<InputStreamResource> getImage(@RequestParam(name = "topic") String topic) throws URISyntaxException {
        return ResponseEntity.ok().body(aiService.getImage(topic));
    }
}