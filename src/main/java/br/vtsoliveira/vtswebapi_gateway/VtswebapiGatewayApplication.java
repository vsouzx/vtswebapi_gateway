package br.vtsoliveira.vtswebapi_gateway;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VtswebapiGatewayApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(VtswebapiGatewayApplication.class)
				.web(WebApplicationType.REACTIVE)
				.run(args);
	}

}
