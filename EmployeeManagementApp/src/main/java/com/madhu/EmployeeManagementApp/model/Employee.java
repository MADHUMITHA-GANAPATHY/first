package com.madhu.EmployeeManagementApp.model;


import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="employeeRest")
public class Employee {
	@Id
	private int eid;
	
	private String ename;
	private String ecity; 
	

}
