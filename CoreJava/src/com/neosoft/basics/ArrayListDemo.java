package com.neosoft.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student(101,90,"Java","abc1"));
		studentlist.add(new Student(102,91,"Java","abc2"));
		studentlist.add(new Student(103,92,"Java","abc3"));
		studentlist.add(new Student(104,93,"Java","abc4"));
		
		Iterator<Student> itr = studentlist.iterator();
		while(itr.hasNext()) {
			Student student = itr.next();
			System.out.print("ID: "+student.id+", ");
			System.out.print("Name: "+student.name+", ");
			System.out.print("Subject: "+student.subject+", ");
			System.out.print("Marks: "+student.marks+",");
			System.out.println();
		}
		
		studentlist.clear();

	}

}
class Student{
	int id,marks;
	String name,subject;
	public Student(int id, int marks, String name, String subject) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
		this.subject = subject;
	}
	
	
}


