package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurkaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurkaClient2Application.class, args);
	}
	  @GetMapping("/substraction/{num1}/{num2}")
	   public int substraction(@PathVariable int num1,@PathVariable int num2 )
	   {
		   return num1-num2;
	   }
}
