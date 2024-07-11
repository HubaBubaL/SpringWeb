package ru.mtshomework.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserwebApplication.class, args);
		org.apache.log4j.BasicConfigurator.configure();
		System.setProperty("log4j.debug", "");
	}

}
