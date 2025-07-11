package com.heinhub.aiis_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // Eureka 서버에 클라이언트로 등록하기 위한 어노테이션
public class AiisServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiisServiceApplication.class, args);
	}

}
