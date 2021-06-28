package pl.adamberezka.springmicroservicesdemoteamservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringMicroservicesDemoTeamServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesDemoTeamServiceApplication.class, args);
	}

}
