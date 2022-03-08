package com.ust.model;

import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor; import lombok.Data; 
import lombok.NoArgsConstructor; import lombok.NonNull; 
import lombok.RequiredArgsConstructor; 
 


@Data 

//@NoArgsConstructor 
@RequiredArgsConstructor 
@AllArgsConstructor 	
@Entity 
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="empId")
	private Integer empId;
	
	@Column(name="empName",length=20)
	private String empName;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="emailid",length=50)
	private String emailid;
	
	@Column(name="phonenumber")
	private Integer phonenumber;
	
	@Column(name="password",length=50)
	private String password;
}
