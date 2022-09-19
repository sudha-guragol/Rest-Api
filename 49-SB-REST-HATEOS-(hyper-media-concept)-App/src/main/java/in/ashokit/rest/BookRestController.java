package in.ashokit.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.Book;



@RestController
public class BookRestController {

	@GetMapping(value="/book/{isbn}",produces="application/json")
	public Book getBookInfo(@PathVariable("isbn") String isbn)
	
	{
		//isbn is a path variables
		Book b=new Book(isbn,"spring",150.50,"Rod Jphnson");
		
		//code to add a link for book address
		//wants to create one link which is binded to a method availablein restcontroller class which is binded as a link.after clicking that link
		//it has to display remaining books details
		/*we want to construct a link that link should be binded to one method in the class
		 * that link we want to add to our binding obj,that binding obj will go as a response to the client
		 */
		
	Link withRel=
				WebMvcLinkBuilder.linkTo(
						WebMvcLinkBuilder.methodOn(BookRestController.class)
						.getAllBooks())
				        .withRel("All-Books");
		
		//adding the link to our book object and return that obj(add()method is available in RepresentationModel class
		b.add(withRel);
		//binding obj will go as a response to our client
		return b;
				
				
	}
	
	@GetMapping(value="/books",produces="application/json")
	public List<Book> getAllBooks()
	{
		Book b1=new Book("ISBN001","spring",150.50,"Rod Jphnson");
		Book b2=new Book("IBBN002","spring Boot",250.50,"Rod Jphnson");
		Book b3=new Book("ISBN003","spring Cloud",350.50,"Rod Jphnson");
		
		List<Book> books=new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		return books;
	}
}
