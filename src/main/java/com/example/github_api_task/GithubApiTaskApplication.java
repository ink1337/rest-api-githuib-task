package com.example.github_api_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GithubApiTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubApiTaskApplication.class, args);
	}

}
