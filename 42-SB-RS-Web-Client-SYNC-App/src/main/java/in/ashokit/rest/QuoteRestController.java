package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.QuoteService;

@RestController
public class QuoteRestController {

	@Autowired
	private QuoteService quoteService;
	
	@GetMapping("/random")
	public String getRandomQuote() {
		return quoteService.invokeQuoteApi();
	}
}
