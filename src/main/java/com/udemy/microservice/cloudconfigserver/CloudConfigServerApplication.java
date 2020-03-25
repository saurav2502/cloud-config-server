package com.udemy.microservice.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.LongUnaryOperator;
import java.util.function.Supplier;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled","false");
		SpringApplication.run(CloudConfigServerApplication.class, args);

	}

}
