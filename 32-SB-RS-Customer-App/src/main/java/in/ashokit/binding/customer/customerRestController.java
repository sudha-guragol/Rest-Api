package in.ashokit.binding.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Application;
import in.ashokit.binding.Customer;
@RestController
public class customerRestController {
	//produces array
	@GetMapping(value="/customer" ,produces= {"application/xml"})
	public Customer getCustomerData()
	{
		Customer customer=new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("aditi");
		customer.setCustomerPhone(9844351);
		return customer;
	}

}
