package com.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.beans.Employee;

public class EmployeeDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:company";
		Connection conn = 
			DriverManager.getConnection(url, "scott", "1234"); 
		return conn;
	}
	public static List<Employee> getAllRecords() throws ClassNotFoundException, SQLException {
		Connection conn=getConnection();
		String strSql="SELECT * FROM EMPLOYEE ORDER BY ID ASC";
		PreparedStatement stmt=conn.prepareStatement(strSql);
		ResultSet rs=stmt.executeQuery();
		List<Employee> list = new ArrayList<Employee>();
		while(rs.next()) {
			Employee r = new Employee();
			r.setId(rs.getInt("ID"));
			r.setName(rs.getString("NAME"));
			r.setEmail(rs.getString("EMAIL"));
			list.add(r);
		}
		rs.close();
		stmt.close();
		conn.close();
		return list;
	}
	public static int insert(Employee r) throws ClassNotFoundException, SQLException {
		Connection conn=getConnection();
		String strSql="INSERT INTO EMPLOYEE VALUES(?,?,?)";
		PreparedStatement stmt =conn.prepareStatement(strSql);
		stmt.setInt(1, r.getId());
		stmt.setString(2, r.getName());
		stmt.setString(4, r.getEmail());
		stmt.executeUpdate();
		stmt.close();
		conn.close();
		return 0;
	}
	public static int update(Employee r) throws ClassNotFoundException, SQLException {
		Connection conn=getConnection();
		String strSql="UPDATE EMPLOYEE SET NAME=?,Email=? WHERE ID=?";
		PreparedStatement stmt =conn.prepareStatement(strSql);
		stmt.setString(1, r.getName());
		stmt.setString(2, r.getEmail());
		stmt.setInt(3, r.getId());
		stmt.close();
		conn.close();
		return 0;
	}
	public static int delete(int id) throws ClassNotFoundException, SQLException {
		Connection conn=getConnection();
		String strSql="DELETE FROM EMPLOYEE WHERE ID=?";
		PreparedStatement stmt = conn.prepareStatement(strSql);
		stmt.setInt(1,id);
		stmt.executeUpdate();
		stmt.close();
		conn.close();
		return 0;
	}
	public static Employee getRecordById(int id) throws ClassNotFoundException, SQLException {
		Connection conn=getConnection();
		String strSql="SELECT * FROM EMPLOYEE WHERE ID=?";
		PreparedStatement stmt=conn.prepareStatement(strSql);
		stmt.setInt(1, id);
		ResultSet rs=stmt.executeQuery();
		Employee r=null;
		while(rs.next()) {
			r=new Employee();
			r.setId(rs.getInt("ID"));
			r.setName(rs.getString("NAME"));
			r.setEmail(rs.getString("EMAIL"));
		}
		rs.close();
		stmt.close();
		conn.close();
		return r;
	}

}
