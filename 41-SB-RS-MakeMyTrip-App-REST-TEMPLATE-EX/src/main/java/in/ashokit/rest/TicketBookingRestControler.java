package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.PassangerRequest;
import in.ashokit.response.TicketResponse;
import in.ashokit.service.TicketService;

@RestController
public class TicketBookingRestControler {

	@Autowired
	private TicketService ticketService;
	
	@PostMapping("/book") 
	public TicketResponse bookTicket(@RequestBody  PassangerRequest request)
	{
		return ticketService.initiateTicketBookProcess(request) ;
		
	}
	
}
