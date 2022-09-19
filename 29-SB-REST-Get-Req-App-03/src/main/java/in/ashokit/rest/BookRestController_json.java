package in.ashokit.rest;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.BookJson;

@RestController
public class BookRestController_json {
	
	@GetMapping("/bookJson")
	public BookJson getBookData()
	{
		BookJson b=new BookJson(102,"spring",500.00);
		
		//output will be in json format (message convertor convert java obj to json){"bookId":101,"bookName":"Java","bookPrice":500.0}
		return b;
	}

	

	

}
