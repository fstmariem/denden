package com.example.demo;





import com.example.deoa.etudianrepository;

import com.example.web.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
@EnableJpaRepositories(basePackages = { "com.example.deoa" })

public class DemoApplication  
{
  

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
                
	}
}

  