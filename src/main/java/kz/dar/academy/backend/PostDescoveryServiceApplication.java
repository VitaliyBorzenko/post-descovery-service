package kz.dar.academy.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PostDescoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostDescoveryServiceApplication.class, args);
	}

}
