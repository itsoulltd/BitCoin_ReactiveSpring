package com.itsoul.lab.bitcoin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.itsoul.lab")
public class BitCoinApplication {
	public static void main(String[] args) {
		SpringApplication.run(BitCoinApplication.class, args);
	}
}
