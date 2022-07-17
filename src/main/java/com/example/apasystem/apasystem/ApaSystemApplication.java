package com.example.apasystem.apasystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;


@ComponentScan(basePackages = {"com.example.apasystem.apasystem"})
@EnableJpaRepositories(basePackages = {""})
@EntityScan(basePackages = {""})
@SpringBootApplication
public class ApaSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApaSystemApplication.class, args);
	}

}
