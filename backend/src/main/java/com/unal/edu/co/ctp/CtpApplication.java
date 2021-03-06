package com.unal.edu.co.ctp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.IOException;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class CtpApplication {

	public static void main(String[] args) {
		SpringApplication.run(CtpApplication.class, args);
	}
}
