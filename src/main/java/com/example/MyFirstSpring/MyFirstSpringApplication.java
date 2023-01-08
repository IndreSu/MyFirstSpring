package com.example.MyFirstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class MyFirstSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringApplication.class, args);
	}
//aaaa
	@GetMapping
	public List hello(){
		return List.of("Hello" , "World");
	}

}
