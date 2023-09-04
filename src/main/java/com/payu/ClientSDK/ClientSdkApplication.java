package com.payu.ClientSDK;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.payu")
public class ClientSdkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientSdkApplication.class, args);
	}
}
