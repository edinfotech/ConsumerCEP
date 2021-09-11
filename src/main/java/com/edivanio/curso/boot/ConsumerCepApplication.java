package com.edivanio.curso.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerCepApplication.class, args);
	}

}
