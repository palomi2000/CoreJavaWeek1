package com.neosoft.basics;
	public class Students
	{
		public int marks;
		public String name,course,stid;
		Students(String stid,int marks,String name,String course)
		{
			this.stid = stid;
			this.marks=marks;
			this.name=name;
			this.course=course;
			
			
		}
		public void display()
		{
			if (course=="BCA" && marks>=60 )
			{
				System.out.println("ID: "+stid + " name: " +name+  " Marks: " +marks+ " course: "+course);
				System.out.println();
			}
		}
		
	public static void main(String[] args)
	{
		Students s[]=new Students[5];
		s[0]= new Students("1",65,"Palomi","BCA");
		s[1]= new Students("2",75,"Rita","BSC");
		s[2]= new Students("3",45,"Kailesh","BCA");
		s[3]= new Students("4",55,"Drishty","BTECH");
		s[4]= new Students("5",60,"Mansi","BCA");
		s[0].display();
		s[1].display();
		s[2].display();
		s[3].display();
		s[4].display();
		
		
	}

}
