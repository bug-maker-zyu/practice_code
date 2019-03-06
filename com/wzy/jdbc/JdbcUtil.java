package com.wzy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/practice_db";
		String name = "root";
		String psw = "970823";		
		return DriverManager.getConnection(url, name, psw);		
	}
	
	//增加删除修改的sql语句的执行
	public static int IDASqlExcute(String sql) throws Exception {
		Connection conn = getConnection();
		Statement stat = conn.createStatement();
		return stat.executeUpdate(sql);
	}
	
	//查询语句的执行
	public static ResultSet SelectSqlExcute(String sql) throws Exception {
		Connection conn = getConnection();
		Statement stat = conn.createStatement();
		return stat.executeQuery(sql);
	}
	
	
}
