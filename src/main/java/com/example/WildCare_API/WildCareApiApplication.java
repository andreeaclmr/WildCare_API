package com.example.WildCare_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class WildCareApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(WildCareApiApplication.class, args);
	}

}
