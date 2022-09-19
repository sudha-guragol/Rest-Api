package in.ashokit.service;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

public class CustomerEventService {
	//mono obj url
	private String REST_URL1="http://localhost:9090/getEvent";
	
	//flux obj url
	private String REST_URL2="http://localhost:9090/getEvents";
	

	public void invokeCustomerEvent() {
		Builder builder=WebClient.builder();
		WebClient webClient=builder.build();
		
		String eventResponse = webClient.get()
		                                .uri(REST_URL1)
		                                 .retrieve()
		                                 //represent single resPOnse(on mono we can perform reactive operations)
		                                 .bodyToMono(String.class)
		                                 //.doOnSuccess(onSuccess)
		                                  .block();
		System.out.println(eventResponse);
	}
	
	
	public void invokeCustomerEvents() {
		Builder builder=WebClient.builder();
		WebClient webClient=builder.build();
		
		        webClient.get()
		              .uri(REST_URL2)
		              .retrieve()
		              //getting(stream of responses)s res continiously(first res will cm n wait for 3 sec later 2nd res will cm` n wait for 3 sec so` on
		              .bodyToFlux(String.class)
		              .subscribe(System.out::println);
	}
	
}
