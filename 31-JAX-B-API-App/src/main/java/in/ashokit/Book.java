package in.ashokit;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement //annotation is used to convert java obj to xml format
public class Book {
	
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

}
