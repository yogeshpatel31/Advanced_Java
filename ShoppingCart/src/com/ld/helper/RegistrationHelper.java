package com.ld.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationHelper {

	private String DB_DRIVER = "com.mysql.jdbc.Driver";
	private String DB_URL = "jdbc:mysql://localhost/shop";
	private String username = "root";
	private String password = "root";

	public boolean validateUser(String username, String password) throws Exception {

		boolean flag = false;
		Connection conn = getConnection();
		String sql = "SELECT * FROM login_details WHERE username = ? AND password = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Couldn't login Now. Try later");

		}
		return flag;
	}

	public boolean registerUser(String username, String password, String firstName, String lastName, String mobileNo) {

		boolean flag = false;
		Connection conn = getConnection();

		String sql = "INSERT INTO user_details" + "( `username`,	`first_name`,`last_name`,`mobile_no`)" + "VALUES"
				+ "(?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, firstName);
			ps.setString(3, lastName);
			ps.setString(4, mobileNo);

			int row = ps.executeUpdate();
			System.out.println("Row0 : " + row);

			if (row > 0) {

				sql = "INSERT INTO `shop`.`login_details`" + "(`username`,`password`)" + "VALUES" + "(?,?)";
				ps = conn.prepareStatement(sql);
				ps.setString(1, username);
				ps.setString(2, password);
				row = ps.executeUpdate();
				System.out.println("Row1 : " + row);

				if (row > 0) {
					flag = true;

				} else {
					throw new Exception("Couldn't register Now. Try later");

				}

			} else {
				throw new Exception("Couldn't register Now. Try later");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	public String getUserFirstName(String username) throws Exception {

		String firstName = "";
		Connection conn = getConnection();
		String sql = "SELECT first_name FROM user_details WHERE username = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				firstName = rs.getString("first_name");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Couldn't login Now. Try later");

		}
		return firstName;
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
