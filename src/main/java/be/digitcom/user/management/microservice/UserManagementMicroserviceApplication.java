package be.digitcom.user.management.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserManagementMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementMicroserviceApplication.class, args);
	}

}
