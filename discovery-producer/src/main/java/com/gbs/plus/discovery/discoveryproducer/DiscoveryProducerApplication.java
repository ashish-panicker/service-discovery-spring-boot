package com.gbs.plus.discovery.discoveryproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DiscoveryProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryProducerApplication.class, args);
	}

}
