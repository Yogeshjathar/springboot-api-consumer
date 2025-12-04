package com.example.ThirdPartyApi.service;

import com.example.ThirdPartyApi.Entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductClient {

    private static RestTemplate restTemplate;

    public ProductClient(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    private static final String url = "https://fakestoreapi.com/products/";
    public List<Product> getAllProducts(){
        Product[] p = restTemplate.getForObject(url, Product[].class);
        return Arrays.asList(p);
    }
}
