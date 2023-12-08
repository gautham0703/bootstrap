package com.example.deployexample.controller;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TestController {

    @GetMapping(value = "/echo")
    public String getClusterInventoryCount(){
        return "System is up and running";
    }
}
