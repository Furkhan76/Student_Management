package com.student.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.student.connection.Connection_generate;
import com.student.entity.Student;

public class StudentDao 
{
	public static boolean insertStudentToDb(Student student)
	{
		boolean f=false;
		try
		{
		Connection con=Connection_generate.createconnection();

		String query="insert into students(sname,sphone,scity) values(?,?,?)";

		PreparedStatement pstmt=con.prepareStatement(query);

		pstmt.setString(1,student.getStudentName());
		pstmt.setString(2,student.getStudentPhone());
		pstmt.setString(3,student.getStudentCity());
		
		pstmt.executeUpdate();
		f=true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return f;
	}

}
