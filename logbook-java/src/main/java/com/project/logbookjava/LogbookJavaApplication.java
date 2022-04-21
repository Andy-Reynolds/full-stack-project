package com.project.logbookjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

// TODO: Need to remove exclude before hooking up to SQL

@SpringBootApplication
@CrossOrigin
public class LogbookJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogbookJavaApplication.class, args);
	}

}
