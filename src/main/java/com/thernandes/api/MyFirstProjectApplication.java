package com.thernandes.api;

import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
		System.out.println("My first project...");
	}
}
