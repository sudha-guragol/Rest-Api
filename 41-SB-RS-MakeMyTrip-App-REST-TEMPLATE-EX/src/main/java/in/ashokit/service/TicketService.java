package in.ashokit.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
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
		
		
		HttpHeaders headers=new HttpHeaders();
		headers.set("content-Type","application/json");
		headers.set("Accept","application/json");
		
		//HttpEntity contains header and body data(requestData is a object,headers is a multi valued)
		//sending header and body at a time 
		HttpEntity<PassangerRequest> request=new HttpEntity<>(requestData,headers);
		
		RestTemplate rt=new RestTemplate();
		
		//makemy trip talking to IRCTC application
		
		//postForEntity used to send only http post request
		/*ResponseEntity<TicketResponse> postForEntity = 
				rt.postForEntity(endpointUrl, request, TicketResponse.class);*/
		
		
		//exchane method is generic available in rest template used to send any type of http request
		ResponseEntity<TicketResponse> postForEntity =
		rt.exchange(endpointUrl, HttpMethod.POST, request, TicketResponse.class);//same as above code
		TicketResponse body = postForEntity.getBody();
		
		return body;
	}
	

}
