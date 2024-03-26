package com.example.cli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class CliApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CliApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hell :D:D:D:D: World!");
	}
}
