package com.example.demo22222;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo22222Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo22222Application.class, args);
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        System.out.println(" === ROUTE === " + builder);
        return builder.routes().build();
    }

}
