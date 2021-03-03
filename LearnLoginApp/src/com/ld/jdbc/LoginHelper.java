package com.ld.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginHelper {

	private String DB_DRIVER = "com.mysql.jdbc.Driver";
	private String DB_URL = "jdbc:mysql://localhost/test";
	private String username = "root";
	private String password = "root";

	public boolean validateUser(String username, String password) throws Exception {

		boolean flag = false;
		Connection conn = getConnection();
		String sql = "SELECT * FROM login WHERE username = ? AND password = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				flag = true;
			}

		} catch (Exception e) {

			throw new Exception("Couldn't login Now. Try later");

		}
		return flag;
	}

	public boolean registerUser(String username, String password) {
		return false;

	}

	public boolean updateUser(String username) {
		return false;

	}

	public boolean deleteUser(String username) {
		return false;

	}

	private Connection getConnection() {
		Connection conn = null;
		try {
			
			try {
				Class.forName(DB_DRIVER).newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			conn = DriverManager.getConnection(DB_URL, username, password);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
		}

		return conn;
	}

}
