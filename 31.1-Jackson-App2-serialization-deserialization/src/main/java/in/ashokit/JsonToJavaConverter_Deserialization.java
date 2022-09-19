package in.ashokit;

import java.io.File;


import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter_Deserialization {
	
	public static void main(String[] args) throws Exception {
		
		File file=new File("Book.json");
		//we do serialization n deserialization by ObjectMapper object
		ObjectMapper mapper=new ObjectMapper();
		Book book = mapper.readValue(file, Book.class);
	System.out.println(book);
	//o/p Book(bookId=101, bookName=java, bookPrice=150.0)
	//Deserialization
	}

}

