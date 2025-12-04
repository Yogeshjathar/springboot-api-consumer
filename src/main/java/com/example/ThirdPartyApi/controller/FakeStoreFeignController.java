package com.example.ThirdPartyApi.controller;

import com.example.ThirdPartyApi.service.FakeStoreClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/feign")
public class FakeStoreFeignController {

    private final FakeStoreClient fakeStoreClient;

    public FakeStoreFeignController(FakeStoreClient fakeStoreClient) {
        this.fakeStoreClient = fakeStoreClient;
    }

    @GetMapping("/products")
    public List<Object> getProducts() {
        return fakeStoreClient.getProducts();
    }
}
