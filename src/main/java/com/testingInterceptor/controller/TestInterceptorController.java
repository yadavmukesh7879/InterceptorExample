package com.testingInterceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestInterceptorController {
    @GetMapping("/testInterCeptor")
    public String testInterceptor() {
        return "He Govind.....!!";
    }
}
