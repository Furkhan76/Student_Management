package com.student.main;

import java.util.Scanner;

import com.student.DAO.StudentDao;
import com.student.entity.Student;

public class StudentApp {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to Student Management System ");
		while(true)
		{
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to Display Students");
			System.out.println("Press 4 to Update Student details");
			System.out.println("Press 5 to Exit the Application");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter Student Name");
					String name=s.next();
					
					System.out.println("Enter Student Phone Number");
					String Phone_Number=s.next();
					
					System.out.println("Enter Student City");
					String city=s.next();
					
					Student student=new Student(name,Phone_Number,city);
					boolean answer=StudentDao.insertStudentToDb(student);
					if(answer)
					{
						System.out.println("Student added Successfully....");
					}
					else
					{
						System.out.println("Insertion Unsucessfull");
					}
					System.out.println(student);
			
			case 2:
			case 3:
			case 4:
			case 5: System.out.println("Thank you for using the Application..");
					break;
			}
			
		}

	}

}
