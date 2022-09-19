package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest1")
public class GreetController {
	
	@GetMapping()    //http:localhost:7090/rest1
	public String getGreetMsg()
	{
		String msg="Good Morning User!!";
		return msg;
		
	}
	//============OR======

	@GetMapping("/welcome")    //http:localhost:7090/rest1/greet
	public String getwelcomeMsg1()
	{
		String msg="In Rest 1 ,welcome User!!";
		return msg;
		
	}
	
	@GetMapping("/wish")  //http:localhost:7090/rest1/wish
	public String getWishMsg()
	{
		String msg="All the Best";
		return msg;
	}

}
