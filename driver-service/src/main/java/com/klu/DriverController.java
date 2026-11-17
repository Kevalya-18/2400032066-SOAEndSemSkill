package com.klu;

import org.springframework.web.bind.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Autowired
    private Environment environment;

    @GetMapping("/status")
    public String getDriverStatus() {

        String port = environment.getProperty("local.server.port");

        System.out.println(
            "Request handled by Driver Service on port: " + port
        );

        return "Driver Service is running on port: " + port;
    }
}

