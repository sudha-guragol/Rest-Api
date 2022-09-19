package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class WeclomeRestController {
	/*@GetMapping ("/welcome")//binding this method to GET request(http:localhost:7090/rest2/welcome
	public String getWelcomeMsg()
	{
		String msg=" In rest2 Welcome User..";
		return msg;
	}*/
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcoemMsg()
	{
		String msg="In REST2 Welcome user ";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
