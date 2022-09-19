package in.ashokit.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.Request.PassengerRequest;
import in.ashokit.response.TicketResponse;

@RestController
public class IrctcRestController {

	
	@PostMapping(value="/bookticket",consumes= {"application/xml","application/json"},produces = {"application/xml","application/json"})
	
	public TicketResponse bookTicket(@RequestBody PassengerRequest request)
	{
		TicketResponse response =new TicketResponse();
		response.setStatus("CONFIRMED");
		response.setPrice(120.32);
		BeanUtils.copyProperties(request , response);
	return response;
		
	}
	/*//method is an endpoint
	//new ticket is created
	public ResponseEntity<TicketResponse> bookTicket(@RequestBody PassengerRequest request)
	{
		//logic to book ticket
		TicketResponse response=new TicketResponse();
		response.setStatus("CONFIRMED");
		response.setPrice(1200.00);
		BeanUtils.copyProperties(request, response);
		//customising status code with response entity
	return new ResponseEntity<>(response, HttpStatus.CREATED);
	}*/
}
