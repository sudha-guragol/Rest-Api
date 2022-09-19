package in.ashokit.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
//@XmlRootElement(name="user")//user is the root element name for xml data
@XmlRootElement
public class User {
	private Integer uid;
	private String fname;
	private String lname;
	private String email;
	
	public User()
	  {
		  System.out.println("inside User constructor");  
	  }

}
