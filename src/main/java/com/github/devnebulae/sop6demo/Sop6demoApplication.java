package com.github.devnebulae.sop6demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {
	@GetMapping
	public String greeting() {
		return "Hello!";
	}
}

@SpringBootApplication
public class Sop6demoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sop6demoApplication.class, args);
	}
}
