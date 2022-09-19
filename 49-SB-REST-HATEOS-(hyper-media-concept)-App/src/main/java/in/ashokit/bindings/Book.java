package in.ashokit.bindings;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//RepresentationModel with this we can construct hyperlink using binding object
public class Book extends RepresentationModel<Book> {
	
	private String isbn;
	private String name;
	private Double price ;
	private String author;

}
