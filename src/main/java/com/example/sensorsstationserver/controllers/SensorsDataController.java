package com.example.sensorsstationserver.controllers;

import com.example.sensorsstationserver.entities.SensorData;
import com.jj.universallprotocollibrary.PingData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensors")
public class SensorsDataController {

    private final Logger logger = LoggerFactory.getLogger(SensorsDataController.class);

    @GetMapping("/heartbeat")
    public String heartbeat() {
        return "SensorsDataController, I am working";
    }

    @PostMapping("/data")
    public void receiveData(@RequestBody SensorData sensorData) {
        logger.info("Received SensorData from device: " + sensorData.deviceName + " message: " + sensorData.message);
    }

    @PostMapping("/pingdata")
    public void receivePingData(@RequestBody PingData pingData) {
        logger.info("Received SensorData from device: " + pingData.getDate() + " message: " + pingData.getMessage());
    }
}
