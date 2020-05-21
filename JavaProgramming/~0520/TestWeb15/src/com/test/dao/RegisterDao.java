package com.test.dao;
import com.test.beans.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
public class RegisterDao {
	public static Connection getConnection() throws NamingException, SQLException {
		InitialContext ic=new InitialContext();
		DataSource ds=(DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
		return ds.getConnection();
	}
	public static List<Register> getAllRecords() throws NamingException, SQLException{
		Connection conn=getConnection();
		String strSql="select * from register";
		PreparedStatement stmt=conn.prepareStatement(strSql);
		ResultSet rs=stmt.executeQuery();
		List<Register> list=new ArrayList<Register>();
		while(rs.next()) {
			Register r= new Register();
			r.setId(rs.getInt("ID"));
			r.setName(rs.getString("NAME"));
			r.setPassword(rs.getString("PASSWORD"));
			r.setEmail(rs.getString("EMAIL"));
			r.setSex(rs.getString("SEX"));
			r.setCountry(rs.getString("Country"));
			list.add(r);
		}
		rs.close();
		stmt.close();
		conn.close();
		return list;
	}
	public static int insert(Register r) throws NamingException, SQLException {
		Connection conn=getConnection();
		String strSql="insert into register values(?,?,?,?,?,?)";
		PreparedStatement stmt =conn.prepareStatement(strSql);
		stmt.setInt(1, r.getId());
		stmt.setString(2, r.getName());
		stmt.setString(3, r.getPassword());
		stmt.setString(4, r.getEmail());
		stmt.setString(5, r.getSex());
		stmt.setString(6, r.getCountry());
		stmt.executeUpdate();
		stmt.close();
		conn.close();
		return 0;
	}
	public static int update(Register r) throws SQLException, NamingException {
		Connection conn=getConnection();
		String strSql="update register set name=?, Password=?, Email=?, Sex=?, Country=? where id=?";
		PreparedStatement stmt =conn.prepareStatement(strSql);
		stmt.setString(1, r.getName());
		stmt.setString(2, r.getPassword());
		stmt.setString(3, r.getEmail());
		stmt.setString(4, r.getSex());
		stmt.setString(5, r.getCountry());
		stmt.setInt(6, r.getId());
		stmt.executeUpdate();
		stmt.close();
		conn.close();
		return 0;
	}
	public static int delete(int id) throws NamingException, SQLException {
		Connection conn=getConnection();
		String strSql="DELETE FROM register WHERE id=?";
		PreparedStatement stmt = conn.prepareStatement(strSql);
		stmt.setInt(1,id);
		stmt.executeUpdate();
		stmt.close();
		conn.close();
		return 0;
	}
	public static Register getRecordById(int id) throws NamingException, SQLException {
		Connection conn=getConnection();
		String strSql="select * from register where id=?";
		PreparedStatement stmt=conn.prepareStatement(strSql);
		stmt.setInt(1, id);
		ResultSet rs=stmt.executeQuery();
		Register r=null;
		while(rs.next()) {
			r=new Register();
			r.setId(rs.getInt("ID"));
			r.setName(rs.getString("NAME"));
			r.setPassword(rs.getString("PASSWORD"));
			r.setEmail(rs.getString("EMAIL"));
			r.setSex(rs.getString("SEX"));
			r.setCountry(rs.getString("Country"));
		}
		rs.close();
		stmt.close();
		conn.close();
		return r;
	}
}



