package com.ust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication

@ComponentScan(basePackages= {"com.ust"})
public class HospitalDeviceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalDeviceManagementApplication.class, args);
	}

}
