package com.example.ThirdPartyApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webClient")
public class ProductWebClientContoller {

    @GetMapping
    public String getProduct(){
        return "Hello";
    }
}
