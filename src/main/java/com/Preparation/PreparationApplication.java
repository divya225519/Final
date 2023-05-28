package com.Preparation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PreparationApplication {
       private static final Logger log = LoggerFactory.getLogger(PreparationApplication.class);
       
	public static void main(String[] args) {
		SpringApplication.run(PreparationApplication.class, args);
		System.out.println("This is preparetion project ");
	}

}
