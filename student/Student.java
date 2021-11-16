package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student name is Shruti");
	}
	
	public void studentDept()
	{
		System.out.println("Student department is ECE");
	}
	
	public void studentID()
	{
		System.out.println("Student ID is 1719");
	}

	public static void main(String[] args) {
		Student s=new Student();
		
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.departmentName();
		s.studentName();
		s.studentID();
		s.studentDept();
		

	}

}
