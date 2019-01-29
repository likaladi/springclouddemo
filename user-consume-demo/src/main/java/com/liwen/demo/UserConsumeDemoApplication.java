package com.liwen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient // 开启Eureka客户端
@EnableHystrix //开启熔断机制
@EnableFeignClients // 开启Feign功能
public class UserConsumeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserConsumeDemoApplication.class, args);
	}

}

