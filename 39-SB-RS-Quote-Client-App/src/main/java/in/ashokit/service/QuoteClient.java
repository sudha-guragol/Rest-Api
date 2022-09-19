package in.ashokit.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.props.AppProperties;
import in.ashokit.response.QuoteApiResponse;

@Service
public class QuoteClient {
	
	
	@Autowired
	private AppProperties appProps;

	//rest client logic which is going to send get request to the given URL
	//1st method convert json data to string
	public String invokeRandomQuoteApi()
	
	{
		//anybody can access below url called random QuoteApi
		//third party rest api giving raw response in json
		
		/*String apiUrl="https://quoters.apps.pcfone.io/api/random";
		
		         OR*/
		
		Map<String, String> msgs = appProps.getMessages();
		String apiUrl = msgs.get("QuoteApiUrl");
		
		
		RestTemplate rt=new RestTemplate();
		
		//wants to held rest template in string format(raw json)(getForEntity means get request)
		//if it is post request use postForEntity
		ResponseEntity<String> responseEntity = rt.getForEntity(apiUrl, String.class);
		//for every response status code will be available
		int statusCode = responseEntity.getStatusCodeValue();
		
		if(statusCode ==200)
		{
			String body = responseEntity.getBody();
			System.out.println(body);
			return body;
		}
		return null;
	}
	
	
	
	
public String invokeQuoteApi()
	
	{
		//anybody can access below url called random QuoteApi
		//third party rest api giving raw response in json
		//gives only json data
		//String apiUrl="https://quoters.apps.pcfone.io/api/random";
	
	
	Map<String, String> msgs = appProps.getMessages();
	String apiUrl = msgs.get("QuoteApiUrl");
	
		RestTemplate rt=new RestTemplate();
		
		//wants to held rest template in string format(raw json)(getForEntity means get request)
		//if it is post request use postForEntity
		//represent response json into QuoteApiResponse (object) format 

		ResponseEntity<QuoteApiResponse> responseEntity = rt.getForEntity(apiUrl, QuoteApiResponse.class);
		//for every response status code will be available
		int statusCode = responseEntity.getStatusCodeValue();
		
		if(statusCode ==200)
		{
			QuoteApiResponse body = responseEntity.getBody();
			System.out.println(body);
			return body.getValue().getQuote().toUpperCase();
		}
		return null;
	}
}
