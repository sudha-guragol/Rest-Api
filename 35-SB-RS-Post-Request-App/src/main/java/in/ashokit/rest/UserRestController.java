package in.ashokit.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.User;

@RestController
public class UserRestController {
@PostMapping(value="/saveUser",consumes= {"application/json","application/xml"},produces= {"text/plain"})
	public String addUser(@RequestBody User user)
	{
		System.out.println(user);
		String msg="User Saved Successfully";
		return msg;
	}
}
