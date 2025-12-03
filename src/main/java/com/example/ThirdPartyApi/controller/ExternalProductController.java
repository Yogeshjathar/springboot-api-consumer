package com.example.ThirdPartyApi.controller;

import com.example.ThirdPartyApi.service.ProductClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/external")
public class ExternalProductController {

    private static ProductClient productClient;

    public ExternalProductController(ProductClient productClient){
        this.productClient = productClient;
    }

    @GetMapping("/product")
    public Object[] fetchProducts(){
        return productClient.getAllProducts();
    }
}
