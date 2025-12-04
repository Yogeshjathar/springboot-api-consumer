package com.example.ThirdPartyApi.service;

import com.example.ThirdPartyApi.Entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "fake-api", url = "https://fakestoreapi.com")
public interface FakeStoreClient {

    @GetMapping("/products")
    List<Product> getProducts();

}
