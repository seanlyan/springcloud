package com.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {

	@Value("${server.port}")
	String port;

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}


	//@GetMapping("/hello/{name}")
	@GetMapping("/hello")
	//public String hello(@PathVariable String name) {
	public  String hello(@RequestParam(value = "name",required=false,defaultValue="sean")String name) {
		System.out.println(name+" welcome . My is microservice provider user");
		return name+" welcome . This is microservice provider user. From port: " + port;
	}
}
