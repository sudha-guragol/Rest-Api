package in.ashokit.bindings;

import lombok.Data;

@Data
//class represents one flight information
public class Flight {
private String	code;
private Integer price;
private String origin;
private String destination;
private String departureDate;
private String planeType;
private String airlineName;
private  Integer emptySeats;
}
