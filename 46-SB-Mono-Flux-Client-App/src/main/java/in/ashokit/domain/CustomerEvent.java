package in.ashokit.domain;

import java.util.Date;

import lombok.Data;

@Data
public class CustomerEvent {
	
	private String customerName;
	private Date date;
	public CustomerEvent(String customerName, Date date) {
		super();
		this.customerName = customerName;
		this.date = date;
	}

	
	
}
