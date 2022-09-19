package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.request.PassangerRequest;
import in.ashokit.response.TicketResponse;

@Service
public class TicketService {

	
	public TicketResponse initiateTicketBookProcess(PassangerRequest requestData)
	{
		//nees to call IRCTC API(36-SB-RS-IRTCT-API-POST-REQUEST
		
		String endpointUrl="http://localhost:9090/bookticket";
		
		RestTemplate rt=new RestTemplate();
		//makemy trip talking to IRCTC applocation
		ResponseEntity<TicketResponse> postForEntity = 
				rt.postForEntity(endpointUrl, requestData, TicketResponse.class);
		TicketResponse body = postForEntity.getBody();
		
		return body;
	}
	

}
