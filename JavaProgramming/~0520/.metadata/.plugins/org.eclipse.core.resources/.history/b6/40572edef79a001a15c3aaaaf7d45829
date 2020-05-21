package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.test.beans.Register;

public class RegisterDao2 {

	// * CRUD(Create Retrieve Update Delete)
	// SELECT
	// VIEW
	// INSERT
	// UPDATE
	// DELETE
	
	public static Connection getConnection() 
			throws NamingException, SQLException {
		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/myoracle");
		return ds.getConnection();
	}
	public static List<Register> getAllRecords() 
			throws NamingException, SQLException {
		Connection conn = getConnection();
		String strSql = "SELECT * FROM REGISTER";
		PreparedStatement stmt = 
				conn.prepareStatement(strSql);
		ResultSet rs = stmt.executeQuery();
		List<Register> list = new ArrayList<Register>();
		while(rs.next()) {
			Register r = new Register();
			r.setId(rs.getInt("ID"));
			r.setName(rs.getString("NAME"));
			r.setPassword(rs.getString("PASSWORD"));
			r.setEmail(rs.getString("EMAIL"));
			r.setSex(rs.getString("SEX"));
			r.setCountry(rs.getString("COUNTRY"));
			list.add(r);
		}
		return list;
	}
}










