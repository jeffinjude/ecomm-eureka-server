package com.jeffinjude.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommEurekaServerApplication.class, args);
	}

}
