package org.college;

public class Student extends College {
	// create above 4 class and call all your class methods into the Student using multilevel inheritance.
	public void studentName() {
		System.out.println("Dhanalakshmi");
	}
	public void studentDept() {
		System.out.println("Computer Science Dept");
	}
	public void studentId() {
		System.out.println("ID-R11033");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.HostelName();
		s.deptName();
		
	}
}

