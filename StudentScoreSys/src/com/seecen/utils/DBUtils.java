package com.seecen.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	public static final String url = "jdbc:mysql://127.0.0.1:3306/studentsys?useUnicode=true&amp;characterEncoding=utf-8&amp;autoReconnect=true";
	public static final String user = "root";
	public static final String password = "";

	public static Connection getConnection() {
		Connection con = null;
		Statement stm = null;
		ResultSet re = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {            
			e.printStackTrace();
		}
		return con;
	}

	public static void colse(ResultSet re, Statement stm, Connection con) {
		try {
			if (re != null) {
				re.close();
			}
			if (stm != null) {
				stm.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

