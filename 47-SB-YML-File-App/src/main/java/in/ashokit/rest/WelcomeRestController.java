package in.ashokit.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.props.AppProperties;

@RestController
public class WelcomeRestController {

	@Autowired
	private AppProperties appProps;
	
	@GetMapping("/wish")
	public String wishMessage()
	{
		Map<String, String> msgs = appProps.getMessages();
		String msgValue = msgs.get("wishMsg");
		return msgValue;
		}
	

	@GetMapping("/greet")
	public String greetMessage()
	{
		Map<String, String> msgs = appProps.getMessages();
		String greetValue = msgs.get("greetMsg");
		return greetValue;
		}
	
}
