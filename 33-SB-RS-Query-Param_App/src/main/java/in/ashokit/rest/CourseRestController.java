package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	 
	//here v are not dealing with object ,we are using string(produces = {"text/plain"} is optional ,whenever we use a string value for method it will be considered as a plain text)
	// @GetMapping(value ="/course" , produces = {"text/plain"})
	 
	 //Or
	 @GetMapping(value ="/course" )
//dispatcher servlet will pass parameter to method(@RequestParam used to read data from query parameter)
	//public String getCourseDetails(@RequestParam("name") String name)  OR
	 
	 public String getCourseDetails(@RequestParam(value="name",defaultValue="SBMS") String name)
	{
		 
		 String msg ="";
		 
		if("SBMS".equals(name))
		{
			msg="New batch  for SBMS from 15-july @8.00 Pm IST";
		}
		else if("JRTP".equals(name))
		{
			msg="New batch  for SBMS from 14-july @11.30.00 Pm IST";
		}
		else if ("AWS".equals(name))
		{
		msg="New batch  for SBMS from 13-july 7.00 Pm IST";
		}
		else
		{
			msg="Contact Ashok IT!!!";
			}
		return msg;
	}
	 
	 @GetMapping("/fee")
	 public String getCourseFee(@RequestParam("cname") String cname,@RequestParam("tname") String tname)
	 {
		 String msg=cname + " by " + tname + " Is 5000 INR only ";
		 return msg;
	 }
	 }


/*i/p   http://localhost:7090/course?name=SBMS
o/p New batch for SBMS from 15-july @8.00 Pm IST

i/p :http://localhost:7090/course?name=JRTP
O/P :New batch for SBMS from 14-july @11.30.00 Pm IST

I/P :http://localhost:7090/course?name=IAS
O/P :Contact Ashok IT!!!

i/p: http://localhost:7090/fee?cname=SBMS&tname=ashok
o/p :SBMS by ashok Is 5000 INR only
I/P : http://localhost:7090/fee?cname=JRTP&tname=ASHOK
O/P :JRTP by ASHOK Is 5000 INR only 

*/	
	
