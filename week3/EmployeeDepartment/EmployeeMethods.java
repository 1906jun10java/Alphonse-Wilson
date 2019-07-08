package com.revature.EmployeeDepartment;

import java.beans.Statement;
import java.security.acl.Owner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 * import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Owned;
import com.revature.bean.User;
import com.revature.util.ConnFactory;
 * public List<Owned> getMyOwnedList(User user) throws SQLException{
		List<Owned> ownedList = new ArrayList<Owned>();
		Connection conn = ConnFactory.getConnection();
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM OWNED WHERE USERID ="+user.getUserId());
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		String colName;
		
		Owned s = null;
		while (rs.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
				colName = rsmd.getColumnName(i);
				System.out.print(colName+" ["+rs.getString(i) + "] ");
				if(colName.equals("OWNED_AMOUNT_LEFT")) {
					System.out.println(" MonthlyPayment ["+rs.getInt(i)/5+"]");
				}
			}
			System.out.println();
			ownedList.add(s);
		}
		return ownedList;	
	}
 * */
public class EmployeeMethods {
	public List<EmployeeBean> getMyEmpList() throws SQLException{
		List<EmployeeBean> empList = new ArrayList<EmployeeBean>();
		Connection conn = ConnFactory.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnsNumber = rsmd.getColumnCount();
		String colName;
		
		EmployeeBean s = null;
		while (rs.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
				colName = rsmd.getColumnName(i);
				System.out.print(colName+" ["+rs.getString(i) + "] ");
				
			}
			System.out.println();
			empList.add(s);
		}
		return empList;	
	}

}
