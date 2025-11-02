package com.opt.demo.aws_learning_service_a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URISyntaxException;

@Service
public class SpringAIService {

    public String getJoke(String topic){
        if(topic.length() < 10){
            if (topic.isBlank()) {
                return "Why did the computer go to the doctor? Because it had a virus!";
            } else {
                return "Here's a joke about " + topic + ": Why did the " + topic + " cross the road? To get to the other side!";
            }
        } else{
            return "Why did the person write a long topic about '" + topic + "'? Because they wanted to make the AI work harder for a punchline!";
        }

    }

    public String getBook(String category, String year) {
        if (category == null || category.isBlank()) {
            category = "fiction";
        }
        if (year == null || year.isBlank()) {
            year = "2020";
        }
        return "Recommended book in category '" + category + "' for year " + year + ": 'The Adventures of " + category.substring(0, 1).toUpperCase() + category.substring(1) + " (" + year + ")'";
    }

    public InputStreamResource getImage(String topic) {
        // Return a 1x1 pixel JPEG image as a placeholder
        byte[] imageBytes = {(byte)0xFF, (byte)0xD8, (byte)0xFF, (byte)0xDB, (byte)0x00, (byte)0x43, (byte)0x00, (byte)0x08, (byte)0x06, (byte)0x06, (byte)0x07, (byte)0x06, (byte)0x05, (byte)0x08, (byte)0x07, (byte)0x07, (byte)0x07, (byte)0x09, (byte)0x09, (byte)0x08, (byte)0x0A, (byte)0x0C, (byte)0x14, (byte)0x0D, (byte)0x0C, (byte)0x0B, (byte)0x0B, (byte)0x0C, (byte)0x19, (byte)0x12, (byte)0x13, (byte)0x0F, (byte)0x14, (byte)0x1D, (byte)0x1A, (byte)0x1F, (byte)0x1E, (byte)0x1D, (byte)0x1A, (byte)0x1C, (byte)0x1C, (byte)0x20, (byte)0x24, (byte)0x2E, (byte)0x27, (byte)0x20, (byte)0x22, (byte)0x2C, (byte)0x23, (byte)0x1C, (byte)0x1C, (byte)0x28, (byte)0x37, (byte)0x29, (byte)0x2C, (byte)0x30, (byte)0x31, (byte)0x34, (byte)0x34, (byte)0x34, (byte)0x1F, (byte)0x27, (byte)0x39, (byte)0x3D, (byte)0x38, (byte)0x32, (byte)0x3C, (byte)0x2E, (byte)0x33, (byte)0x34, (byte)0x32};
        java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(imageBytes);
        return new InputStreamResource(bis);
    }




}
