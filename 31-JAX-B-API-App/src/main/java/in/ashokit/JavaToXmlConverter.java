package in.ashokit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
//Marshalling
public class JavaToXmlConverter {
	
	
	public static void main(String[] args) throws Exception {
		
		
		Book b=new Book();
	    b.setBookId(101);
	    b.setBookName("java");
	    b.setBookPrice(150.00);
	    
//jax-B Api used to convert java obj to Xml
 JAXBContext context=JAXBContext.newInstance(Book.class);
 Marshaller marsheller = context.createMarshaller();
 marsheller.marshal(b, System.out);
	}

}
