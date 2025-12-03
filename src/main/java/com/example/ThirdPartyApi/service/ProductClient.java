package com.example.ThirdPartyApi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductClient {

    private static RestTemplate restTemplate;

    public ProductClient(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Object[] getAllProducts(){
        String url = "https://fakestoreapi.com/products/";
        return restTemplate.getForObject(url, Object[].class);
    }
}
