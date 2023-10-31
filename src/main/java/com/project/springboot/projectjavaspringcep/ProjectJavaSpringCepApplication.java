package com.project.springboot.projectjavaspringcep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjectJavaSpringCepApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectJavaSpringCepApplication.class, args);
	}

}
