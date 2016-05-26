package com.ryanjbaxter.spring.cloud.ocr.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class OcrHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcrHystrixDashboardApplication.class, args);
	}
}
