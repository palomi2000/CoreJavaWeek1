package com.neosoft.basics;

public class Employee {
	int eid, esal;
	String ename;
	Project project;
	
	Employee(int eid, String ename, int esal, Project project) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.project = project;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project mobileApp = new Project(1, "Mobile App for Project Management", "Bandra");
		Project webApp = new Project(2, "E-Commerce Web App", "Andheri");
		
		Employee e1 = new Employee(1, "Palomi", 30000, mobileApp);
		Employee e2 = new Employee(2, "Rita", 28000, webApp);
		
		Employee e3 = new Employee(3, "Mansi", 24000, webApp);
		Employee e4 = new Employee(4, "Kailesh", 23000, mobileApp);
		
		Employee[] eArr = {
				e1, e2, e3, e4
		};
		
		for(Employee e: eArr) {
			if ( e.esal > 25000 && e.project.pname.equals("E-Commerce Web App") ) {
				System.out.println();
				System.out.println("Employee id - " + e.eid);

				System.out.println();
				System.out.println("Employee name - " + e.ename);
				
				System.out.println();
				System.out.println("Employee salary - " + e.esal);
				
				System.out.println();
				System.out.println("Employee Project - " + e.project.pname);
				
				System.out.println();
				System.out.println("Employee Location - " + e.project.plocation);
				System.out.println("-------------------------------------");
			}
		}
	}
	

}

