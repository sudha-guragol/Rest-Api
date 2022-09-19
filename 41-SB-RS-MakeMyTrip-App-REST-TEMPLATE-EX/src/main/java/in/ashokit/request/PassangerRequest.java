package in.ashokit.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
//request binding class
@XmlRootElement
public class PassangerRequest {

	
	private String name;
	private String dob;
	private String  gender;
	private String doj;
	private String from;
	private String to;
	private String train;
	
	}

