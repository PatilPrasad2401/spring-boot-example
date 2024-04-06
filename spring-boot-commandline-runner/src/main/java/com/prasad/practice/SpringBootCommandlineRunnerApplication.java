package com.prasad.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Array;
import java.util.Arrays;

@SpringBootApplication
public class SpringBootCommandlineRunnerApplication implements CommandLineRunner {
	private Logger logger= LoggerFactory.getLogger(SpringBootCommandlineRunnerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCommandlineRunnerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Total NOnOperations:{}",args.length);
		Arrays.stream(args).forEach(name->logger.info("{}={}",name,args));

	}
}
