package in.ashokit.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix ="app")
// we can use multiple prefixes 
//@ConfigurationProperties(prefix ="app","db")
public class AppProperties {

	
	private Map<String,String> messages=new HashMap<>();
}
