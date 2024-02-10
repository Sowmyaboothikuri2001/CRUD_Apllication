package com.task.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	public static String url="jdbc:mysql://@localhost:3306/employee";
	public static String username="root";
	public static String password="root";
	public static Connection connection=null;
	public static Connection getDBConnection() throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		return null;		
	}
	
    public static void getDBDestroyConnection() throws SQLException {
        connection.close();
    }
}
