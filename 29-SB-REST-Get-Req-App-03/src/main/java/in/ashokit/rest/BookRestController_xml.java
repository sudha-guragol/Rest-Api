package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.BookJson;
import in.ashokit.request.BookXml;

@RestController
public class BookRestController_xml {
	
	@GetMapping("/bookXml")
	public BookXml getBookData()
	{
		BookXml xml=new BookXml(101,"Java",500.00);

		return xml;
		/*		
		//output will be in xml format (message convertor convert java obj to xml)
		<bookXml>
		<bookId>101</bookId>
		<bookName>Java</bookName>
		<bookPrice>500.0</bookPrice>
		</bookXml>*/
	}

}
