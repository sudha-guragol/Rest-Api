package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Application;
import in.ashokit.bean.Customer;

@RestController
public class CustomerRestController {
	
	@PutMapping(value="update",consumes= {"Application/json"})
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer)
	{
		//logic to update customer record in DB
		System.out.println("*********customer  info***="+customer);
		return new ResponseEntity<>("updated successfully",HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/delete/{customerId}") 
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer customerId)
	{//logic to delete the record from DB
		System.out.println(customerId);
		return new ResponseEntity<>("Record deleted Successfully",HttpStatus.OK); 
	}
	
	

}
