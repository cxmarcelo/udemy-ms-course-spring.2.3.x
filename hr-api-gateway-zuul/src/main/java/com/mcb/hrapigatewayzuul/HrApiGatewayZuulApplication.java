package com.mcb.hrapigatewayzuul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class HrApiGatewayZuulApplication implements CommandLineRunner {

	@Value("${jwt.secret}")
	private String jwtSecret;
	
	@Value("${oauth.client.name}")
	private String clientName;

	@Value("${oauth.client.secret}")
	private String clientSecret;
	
	
	public static void main(String[] args) {
		SpringApplication.run(HrApiGatewayZuulApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Testando server de config");
		System.out.println(jwtSecret);
		System.out.println(clientName);
		System.out.println(clientSecret);
		
	}

}
