package com.example.ThirdPartyApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ThirdPartyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThirdPartyApiApplication.class, args);
	}

}
