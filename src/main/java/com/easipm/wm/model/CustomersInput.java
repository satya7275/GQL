package com.easipm.wm.model;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import java.io.Serializable;
@Getter @Setter @RequiredArgsConstructor @AllArgsConstructor 
public class CustomersInput  implements Serializable {

 private static final long serialVersionUID =1L;
	private String address;
	private String city;
	private String customerName;
	private String state;
	private Integer customerId;
	private String zipCode;
}
