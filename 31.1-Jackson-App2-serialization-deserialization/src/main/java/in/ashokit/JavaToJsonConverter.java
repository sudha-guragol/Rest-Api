package in.ashokit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
       Book b=new Book();
       b.setBookId(101);
      b.setBookName("java");
       b.setBookPrice(150.0);
       
       System.out.println(b);
       //convert book data into json
       ObjectMapper mapper=new ObjectMapper();
    //   String json = mapper.writeValueAsString(b);
       //writerWithDefaultPrettyPrinter (prints json data in proper format
       //message converter will execute above line n below line use jackson api and will convert obj to json
       String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(b);
       System.out.println(json);
	}

}


/*o/p (serialization)

{
	  "bookName" : "java",
	  "bookPrice" : 150.0,
	  "bid" : 101
	}*/