package com.revature.EmployeeDepartment;

import java.sql.SQLException;

public class EmployeeDepartmentMain {

	public static void main(String[] args) {
		empDep();
	}
	public static void empDep() {
		EmployeeMethods emp = new EmployeeMethods();
		try {
			emp.getMyEmpList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
