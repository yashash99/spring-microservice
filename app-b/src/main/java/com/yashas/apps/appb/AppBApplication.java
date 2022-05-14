package com.yashas.apps.appb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppBApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppBApplication.class, args);
	}

}
