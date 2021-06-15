package com.easipm.wm.model;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import java.io.Serializable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import java.lang.reflect.Field;
 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.Table;
 import javax.persistence.Id;
 import javax.persistence.Entity;
@Entity
@Table(name="customers", schema="dbo" )
@Getter @Setter @RequiredArgsConstructor @AllArgsConstructor 
public class Customers  implements Serializable {

 private static final long serialVersionUID =1L;
 @Column(name="address")
	private String address;
 @Column(name="city")
	private String city;
 @Column(name="customer_name")
	private String customerName;
 @Column(name="state")
	private String state;
 @Id
 @Column(name="customer_id")
	private Integer customerId;
 @Column(name="zip_code")
	private String zipCode;




}
