package com.codecool.hogwartshouses;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HogwartsHousesApplication {

	public static void main(String[] args) {
		//TODO create config class to wire implementations by Environment variable
		SpringApplication.run(HogwartsHousesApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}