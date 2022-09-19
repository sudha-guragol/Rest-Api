package in.ashokit;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
//unmarshalling
public class XmlToJavaConverter_unMarshalling {
public static void main(String[] args) throws Exception {
	JAXBContext context = JAXBContext.newInstance(Book.class);
Unmarshaller unmarshaller = context.createUnmarshaller();
Object object = unmarshaller.unmarshal(new File("Book.xml"));
Book b=(Book) object;
System.out.println(b);
}
}

//unmarshalling (o/p) Book(bookId=101, bookName=java, bookPrice=150.0)
