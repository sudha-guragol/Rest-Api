package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class QuoteService {

	public String invokeQuoteApi()
	{
		
	String apiUrl="https://quoters.apps.pcfone.io/api/random";
	
	//gives implementation class object for webclient(WebClient (5.0 v )is an interface)
	WebClient webClient = WebClient.create();
	//used to send a GET Request(we can send get or post based on requirement)(below is method chaining)
	                   String block = webClient.get()
	                            .uri(apiUrl) 
	                            .retrieve()
	                            .bodyToMono(String.class)
	                            .block();
	                   System.out.println("*********Req sent *******");
	                             
	return block;
	}
	
	public static void handleResponse(String restData)
	{
		System.out.println(restData); 
	}
	
}

//o/p *********Req sent *******s
