package com.hcl.hiring.hiringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages={"com.hcl.hiring"})
@EnableJpaRepositories
public class HiringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiringappApplication.class, args);
	}

}
