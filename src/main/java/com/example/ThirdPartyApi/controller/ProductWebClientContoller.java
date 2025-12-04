package com.example.ThirdPartyApi.controller;

import com.example.ThirdPartyApi.Entity.Product;
import com.example.ThirdPartyApi.service.ProductWebClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/webClient")
public class ProductWebClientContoller {

    @Autowired
    private ProductWebClientService productWebClientService;

    @GetMapping("/product")
    public Flux<Product> getProduct(){
        return productWebClientService.fetchProducts();
    }
}
