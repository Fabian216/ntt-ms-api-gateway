package ntt.ntt_ms_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NttMsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttMsApiGatewayApplication.class, args);
	}

}
