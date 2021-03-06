package pl.adamberezka.springmicroservicesdemodiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringMicroservicesDemoDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesDemoDiscoveryServerApplication.class, args);
	}

}
