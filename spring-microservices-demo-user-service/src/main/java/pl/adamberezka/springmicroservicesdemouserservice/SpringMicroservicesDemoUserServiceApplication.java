package pl.adamberezka.springmicroservicesdemouserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringMicroservicesDemoUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesDemoUserServiceApplication.class, args);
	}

}
