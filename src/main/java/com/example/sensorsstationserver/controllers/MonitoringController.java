package com.example.sensorsstationserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/monitoring")
public class MonitoringController {

    private final Logger logger = LoggerFactory.getLogger(SensorsDataController.class);

    @GetMapping("/heartbeat")
    public String heartbeat() {
        return "MonitoringController, I am working";
    }

    @PostMapping("/uploadImage")
    public void uploadImage(@RequestPart(name = "img") MultipartFile image) {
        logger.info("Request image upload " + image.getOriginalFilename());
        String filePath = "spring_images/";
        try {
            String fileName = image.getOriginalFilename();
            if (fileName == null) {
                fileName = "nullimagename";
            }
            image.transferTo(new File(filePath, fileName));
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("image.transferTo failed");
        }
    }
}
