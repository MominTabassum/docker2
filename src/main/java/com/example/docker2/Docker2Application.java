package com.example.docker2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Docker2Application {

@RequestMapping("/home")
  public String home() {
    return "Hello Docker2 World";
  }

	public static void main(String[] args) {
		SpringApplication.run(Docker2Application.class, args);
	}

}




