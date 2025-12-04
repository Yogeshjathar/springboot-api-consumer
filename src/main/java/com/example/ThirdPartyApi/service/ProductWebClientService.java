package com.example.ThirdPartyApi.service;

import com.example.ThirdPartyApi.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ProductWebClientService {

    @Autowired
    private WebClient webClient;

    public Flux<Product> fetchProducts(){
        return webClient.get()
                .uri("https://fakestoreapi.com/products/")
                .retrieve()
                .bodyToFlux(Product.class);
    }
}
