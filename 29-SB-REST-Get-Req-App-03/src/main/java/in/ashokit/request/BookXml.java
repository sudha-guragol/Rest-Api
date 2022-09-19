package in.ashokit.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class BookXml {

	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	
	public BookXml() {
		// TODO Auto-generated constructor stub
	}
	public BookXml(Integer bookId, String bookName, Double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	
	
}
