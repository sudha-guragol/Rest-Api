package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.response.QuoteApiResponse;

@Service
public class QuoteService {

	public String invokeQuoteApi()
	{
		
	String apiUrl="https://quoters.apps.pcfone.io/api/random";
	
	//gives implementation class object for webclient(WebClient (5.0 v )is an interface)
	WebClient webClient = WebClient.create();
	//used to send a GET Request(we can send get or post based on requirement)(below is method chaining)
	                    webClient.get()
	                            .uri(apiUrl)
	                            //in which format client sending response
	                            .header("Accept", "application/json")
	                            .retrieve()
	                     // .bodyToMono(String.class)
	                            //converting json res to java obj at client side(webclient do this using msg converters)
	                            .bodyToMono(QuoteApiResponse.class)
	                          //to handle 3rd party api method we use subscribe() method
	                            .subscribe(QuoteService::handleResponse);
	                   System.out.println("*********Req sent *******");
	                             
	return "Success";
	}
	
	

	//wen we get the response continue with below method
	//public static void handleResponse(String restData)
	public static void handleResponse(QuoteApiResponse restData)
	
	{
		System.out.println(restData); 
		//pushed to apache kofka so that other api can use take that response using apache kofkas
		System.out.println("Response pushed to Apache KOFKA ");
	}
	
}


//o/p  without waiting for response sop statement will be displayeds
//after res is sent handleresponse method will be executed 
//REq SEnt will be displayeds
/*********Req sent *******
{"type":"success","value":{"id":9,"quote":"So easy it is to switch container in #springboot."}}
Response pushed to Apache KOFKA */
//first req will be sent after response is pushed to apache kofka


//o/p 2 with java obj
/**********Req sent *******
QuoteApiResponse(type=success, value=Value(id=11, quote=I have two hours today to build an app from scratch. @springboot to the rescue!))
Response pushed to Apache KOFK*/
