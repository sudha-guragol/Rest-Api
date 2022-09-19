package in.ashokit.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
// @XmlRootElement purpose is it is representing class as a binding class this class object can be converted into xml
//&xml data can be stored  into objject
@XmlRootElement
public class Customer {
private Integer customerId;
private String customerName;
private Integer customerPhone;
}
