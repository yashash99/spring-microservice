package com.yashas.apps.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}
	
	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/app-a/**")
                		 .filters(f -> f.stripPrefix(1)) //https://github.com/spring-cloud/spring-cloud-gateway/issues/501#issuecomment-422165544
                        .uri("lb://app-a/"))

                .route(r -> r.path("/app-b/**")
                		 .filters(f -> f.stripPrefix(1))
                        .uri("lb://app-b/"))
                .build();
    }

}
