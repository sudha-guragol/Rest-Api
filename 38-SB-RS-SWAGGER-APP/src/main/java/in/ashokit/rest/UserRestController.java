package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping("/user/{userId}")
	public String getName(@PathVariable Integer userId)
	{
		if(userId==101)
		{
			return "rani";
		}
		else if (userId==100)
		{
			return "raja";
		}
		else
		{
			return "User NOt Found";
		}
	}

}


//Run the app and Access it from browser 
//http://localhost:7090/v2/api-docs (generate our rest api documentation in browser) copy that and paste in api-docs.json file
//http://localhost:7090/swagger-ui.html