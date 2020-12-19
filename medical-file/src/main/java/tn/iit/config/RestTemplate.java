package tn.iit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpRequestInterceptor;

@Configuration
public class RestTemplate {

	@Bean
	public RestTemplate newInterceptingTemplate(ClientHttpRequestInterceptor...clientHttpRequestInterceptors)
	{
		RestTemplate restTemplate = new RestTemplate();
	}

}
