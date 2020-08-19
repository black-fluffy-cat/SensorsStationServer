package com.example.sensorsstationserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitoring")
public class MonitoringController {

    private final Logger logger = LoggerFactory.getLogger(SensorsDataController.class);

    @GetMapping("/heartbeat")
    public String heartbeat() {
        return "MonitoringController, I am working";
    }
}
