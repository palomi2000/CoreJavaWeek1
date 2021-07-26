package com.neosoft.basics;

	class Shapes {
		  public void area() {
		    System.out.println("The formula for area of ");
		  }
		  public void draw() {
			    System.out.println("Area ");
			  }
		}
	class Triangle extends Shapes {
		int h,b;
		public Triangle(int h, int b) {
			this.h = h;
			this.b = b;
		}
	  public void area() {
	    System.out.println("Area of Traingle is: "+ (0.5 * b * h));
	  }
	  public void draw() {
		  System.out.println("Drawing a shape"+ this.getClass().getName());
	  }
	}
	class Circle extends Shapes {
	  public void area() {
	    System.out.println("Circle is 3.14 * radius * radius ");
	  }
	}
	class Square extends Shapes {
		  public void area() {
		    System.out.println("Circle is 3.14 * radius * radius ");
		  }
		}
	class Polymorphism {
		  public static void main(String[] args) {
		    Shapes myShape = new Shapes();  // Create a Shapes object
		    Shapes myTriangle = new Triangle(4,5);  // Create a Triangle object
		    Shapes myCircle = new Circle();  // Create a Circle object
		    myShape.area();
		    myTriangle.area();
		    myTriangle.draw();
		    myShape.area();
		    myCircle.area();
		  }
		}


