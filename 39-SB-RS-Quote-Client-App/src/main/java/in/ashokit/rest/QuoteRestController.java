package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.props.AppProperties;
import in.ashokit.service.QuoteClient;

@RestController
public class QuoteRestController {
	@Autowired
	private QuoteClient quoteClient;
	
	@GetMapping("/quote")
	public String getQuote()
	{
		//String quote=quoteClient.invokeRandomQuoteApi();//(Approach -1)
		String quote=quoteClient.invokeQuoteApi(); //Approach -2
		return quote;
	}

}
