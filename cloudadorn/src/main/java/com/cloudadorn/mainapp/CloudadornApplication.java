package com.cloudadorn.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cloudadorn.*")
public class CloudadornApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudadornApplication.class, args);
	}

}
