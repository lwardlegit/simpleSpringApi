package io.javaprojectfiles.springbootapisample.simpleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SimpleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApiApplication.class, args);
	}

}

