package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.Dao")
@EntityScan(basePackages = "com.example.Entity")
@SpringBootApplication(scanBasePackages = "com.example")
public class FashionDestinationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FashionDestinationApplication.class, args);
	}

}
