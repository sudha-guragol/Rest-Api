package in.ashokit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(value=Include.NON_NULL)
public class Book {
	@JsonProperty("bid")
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

}
