package in.ashokit.rest;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.domain.CustomerEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;
@RestController
public class CustomerRestController {

	//method for mono obj
	@GetMapping(value="/getEvent", produces="application/json")
	//returns one obj(mono)
	//to apply reactive features we use Mono obj
	public ResponseEntity<Mono<CustomerEvent>> getCustomerEvent()
	{
		CustomerEvent event=new CustomerEvent("asha", new Date());
		//mono.just()our obj is converted into mono obj
		
		Mono<CustomerEvent> customerMono = Mono.just(event);
		ResponseEntity<Mono<CustomerEvent>> responseEntity=new ResponseEntity<Mono<CustomerEvent>>(customerMono, HttpStatus.OK);
		return responseEntity;
		}
	
	
	//method for flux(stream of obj)
	
	//this method will produce stream of responses
	@GetMapping(value="/getEvents",produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<CustomerEvent>> getCustomerEvents()
	{
		
		//creating pojo obj with data(which obj we want to send)
		CustomerEvent event=new CustomerEvent("ajay", new Date());
		
		//creating stream object to send data
		Stream<CustomerEvent> customerStream=Stream.generate(() ->event); 
		
		//giving stream obj to flux obj
		Flux<CustomerEvent> ceFlux=Flux.fromStream(customerStream);
		
		//setting response interval(how frequently u want to send response
		Flux<Long> interval=Flux.interval(Duration.ofSeconds(3));
		
		
		//combining intervalFlux and customerEventFlux(by zip() method)
		Flux<Tuple2<Long,CustomerEvent>> zip=Flux.zip(interval, ceFlux);
		
		//getting second tuple2 vlaue as Flux obj(data will be represented in the form of tuples(touples nothing but columns)(tuple1 is Id,tuple2 is actual data)
		//tuple2 represent customerEvent data,getting tuple2 using getT2 method(gives flux map)
		Flux<CustomerEvent> fluxMap=zip.map(Tuple2::getT2);
		
		//Adding flux obj to response body(giving flux map as parameter
		ResponseEntity<Flux<CustomerEvent>> resEntity=new ResponseEntity<Flux<CustomerEvent>> (fluxMap,HttpStatus.OK);
		
		//returning resEntity with flux data
		return resEntity;
	}
	
}
