package com.example.gymOnRent;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GymOnRentApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymOnRentApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	ModelMapper modelMapper = new ModelMapper();
}
