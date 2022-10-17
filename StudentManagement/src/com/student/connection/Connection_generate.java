package com.student.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_generate
{
	static Connection con;
	public static Connection createconnection()
	{
		try
		{
		//Load driver
		Class.forName("com.mysql.jdbc.driver");
		
		//connect driver
		String user="root";
		String password="smitha76";
		String url="jdbc:mysql://localhot:3306/student_manage";
		
		con= DriverManager.getConnection(url,user,password);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}
