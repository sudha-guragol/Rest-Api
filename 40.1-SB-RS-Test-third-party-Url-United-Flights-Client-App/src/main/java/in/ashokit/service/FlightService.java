package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FlightService {
	
	//this method represents data in json format
public String invokeUnitedFlightsApi()
{
	String endpointUrl="http://mu.mulesoft-training.com/essentials/united/flights/";
	
	//uses builder design pattern so we cant autowire it
	RestTemplate rt=new RestTemplate();
	ResponseEntity<String> responseEntity = rt.getForEntity(endpointUrl, String.class);
	String body =responseEntity.getBody();
	//access vistara api
	//access indigo api
	
	return body;
}


//this method represents data in object format

public String invokeFlightsApi()
{
	//3rd party Url
	String endpointUrl="http://mu.mulesoft-training.com/essentials/united/flights/";
	
	//uses builder design pattern so we cant autowire it
	//this is our rest template
	RestTemplate rt=new RestTemplate();
	
	//get for entity method
	ResponseEntity<String> responseEntity = rt.getForEntity(endpointUrl, String.class);
	
	String body =responseEntity.getBody();
	//access vistara api
	//access indigo api
	
	return body;
}
}
