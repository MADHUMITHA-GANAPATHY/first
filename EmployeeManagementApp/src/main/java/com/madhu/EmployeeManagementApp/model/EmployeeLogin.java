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
@Entity
@Table(name="employeeLogin")

public class EmployeeLogin {
	@Id
	private String uid;
	private String password;


}
