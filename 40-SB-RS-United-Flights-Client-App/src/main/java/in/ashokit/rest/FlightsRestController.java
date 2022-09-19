package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.Flights;
import in.ashokit.service.FlightService;

@RestController
public class FlightsRestController {
	@Autowired
	private FlightService flightService;
	
	@GetMapping("/flights")
	public String getFlights()
	{
		return flightService.invokeUnitedFlightsApi();
	}

	@GetMapping("/flightsInfo")
	public Flights getFlightsInfo()
	{
		Flights flights = flightService.invokeFlightsApi();
		return flights;
	}
}
