package in.ashokit.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.bindings.Flight;
import in.ashokit.bindings.Flights;

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

public Flights invokeFlightsApi()
{
	//3rd party Url
	String endpointUrl="http://mu.mulesoft-training.com/essentials/united/flights/";
	
	//uses builder design pattern so we cant autowire it
	//this is our rest template
	RestTemplate rt=new RestTemplate();
	
	//get for entity method
	ResponseEntity<Flights> responseEntity = rt.getForEntity(endpointUrl, Flights.class);
	
	Flights body = responseEntity.getBody();
	//List<Flight> flights = body.getFlights();
	
	//display json data to object form
	//flights.forEach(flight ->System.out.println(flights));
	
	return body;
}
}
