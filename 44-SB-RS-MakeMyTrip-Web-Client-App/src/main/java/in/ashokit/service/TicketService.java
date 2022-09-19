package in.ashokit.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.request.PassangerRequest;
import in.ashokit.response.TicketResponse;

@Service
public class TicketService {

	
	public TicketResponse initiateTicketBookProcess(PassangerRequest requestData)
	{
		//need to call IRCTC API(36-SB-RS-IRTCT-API-POST-REQUEST)Application
		
		String endpointUrl="http://localhost:9090/bookticket";
		WebClient webClient = WebClient.create();
		                      TicketResponse ticket = webClient.post()
		                                                       .uri(endpointUrl)
		                                                       .contentType(MediaType.APPLICATION_JSON)
		                                                       .accept(MediaType.APPLICATION_JSON)
		                                                       //.body(requestData, PassangerRequest.class)
		                                                       //body insertors will insert obj to body send req to irctc
		                                                       .body(BodyInserters.fromValue(requestData))
		                                                       .retrieve()
		                                                        .bodyToMono(TicketResponse.class)
		                                                      .block();
		
		return ticket;
	}
	

}
