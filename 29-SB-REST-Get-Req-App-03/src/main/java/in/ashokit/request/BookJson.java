package in.ashokit.request;

import lombok.Data;

@Data
public class BookJson {
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	public BookJson(Integer bookId, String bookName, Double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	

}
