package dev.ranieri.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@ComponentScan("dev.ranieri")
public class MicroTransferServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroTransferServiceApplication.class, args);
	}

}
