package com.wzy.jdbc;

import java.sql.ResultSet;

public class ServiceTest {
	
	public static boolean login(String loginID, String psw) {
		
		String sql = "select * from user where loginID = '"+ loginID +"' and loginPsw = '"+psw+"';";
		boolean flag = false;
		ResultSet result;
		try {
			result = JdbcUtil.SelectSqlExcute(sql);
			
			flag = result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;	
	}
	
	
}
