package com.neosoft.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
	public static void main(String[] args)
	{
		
		ArrayList<trainer> tr = new ArrayList<trainer>();
		ArrayList<filteredtrainer> ftr = new ArrayList<filteredtrainer>();
		tr.add(new trainer(101,19000,"ABC1","Java"));
		tr.add(new trainer(102,25000,"ABC2","Java"));
		tr.add(new trainer(103,22000,"ABC3","Python"));
		tr.add(new trainer(104,17000,"ABC4","Python"));
		
		Iterator<trainer> itr = tr.iterator();
		while(itr.hasNext()) {
			trainer trainer = itr.next();
			if(trainer.salary>20000 && trainer.course=="Java")
			{
				ftr.add(new filteredtrainer(trainer.id,trainer.salary,trainer.name,trainer.course));
				tr.remove(new trainer(trainer.id,trainer.salary,trainer.name,trainer.course));
			}
			
		}
		
		Iterator<filteredtrainer> fitr = ftr.iterator();
		while(fitr.hasNext()) {
			filteredtrainer ftrainer = fitr.next();
			System.out.println("Filtered tariners list:");
			System.out.print("ID: "+ftrainer.id+", ");
			System.out.print("Name: "+ftrainer.name+", ");
			System.out.print("Subject: "+ftrainer.course+", ");
			System.out.print("Marks: "+ftrainer.salary+",");
			System.out.println();
			
		}
	}

}
class trainer
{
	int id,salary;
	String name,course;
	public trainer(int id, int salary, String name, String course) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.course = course;
	}
	
}
class filteredtrainer
{
	int id,salary;
	String name,course;
	public filteredtrainer(int id, int salary, String name, String course) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.course = course;
	}
}
