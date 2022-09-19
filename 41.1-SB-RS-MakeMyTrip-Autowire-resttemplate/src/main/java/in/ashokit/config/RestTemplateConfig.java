package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
//Ioc container will call this methoid wen appli started it is represented as a spring bean it will be autowired and injected
	@Bean
	public RestTemplate createRestTemplate()
	{
		RestTemplate rt=new RestTemplate();
		return rt;
	}
}
