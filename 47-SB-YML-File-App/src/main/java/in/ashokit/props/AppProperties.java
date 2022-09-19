package in.ashokit.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
//Representing our java class as a configuration class(represent our class as spring bean)
@Configuration

//used to represent configuration properties for our application class
@EnableConfigurationProperties

//we can seperate the prefixes by comma
//prefix represents from which property on words we want to read the messages
@ConfigurationProperties(prefix = "app")
public class AppProperties {

	
	private Map<String,String> messages=new HashMap<>();
}
