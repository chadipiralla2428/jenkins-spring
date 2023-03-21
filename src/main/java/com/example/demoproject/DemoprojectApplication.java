package com.example.demoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoprojectApplication {
	

	public static void main(String[] args) {
		System.out.println(10/0)
		SpringApplication.run(DemoprojectApplication.class, args);
	}

}
