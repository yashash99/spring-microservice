package com.yashas.apps.appa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppAApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppAApplication.class, args);
	}

}
