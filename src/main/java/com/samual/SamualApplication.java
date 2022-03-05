package com.samual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.samual.*")
@SpringBootApplication
public class SamualApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamualApplication.class, args);
	}

}
