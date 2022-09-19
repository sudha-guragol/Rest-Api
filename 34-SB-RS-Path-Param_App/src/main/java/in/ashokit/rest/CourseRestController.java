package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {
	//cname ,tname
	@GetMapping("/course/{cname}/trainer/{tname}")
	public String getCourseDetails(@PathVariable String cname,@PathVariable String tname)
	{
		String msg= cname +" By " + tname + " will start on 15-July 8.00 Am IST";
		return msg;
	}
	
	
	@GetMapping("/course/{a}/trainer/{b}")
	public String getCourseDetails1(@PathVariable("a") String cname,@PathVariable("b") String tname)
	{
		String msg= cname +" By " + tname + " will start on 15-July 8.00 Am IST";
		return msg;
	}

}

/*(for both methods same i/p and o/p)
i/p :http://localhost:7090/course/SBMS/trainer/Ashok
o/p :SBMS By Ashok will start on 15-July 8.00 Am IST*/	