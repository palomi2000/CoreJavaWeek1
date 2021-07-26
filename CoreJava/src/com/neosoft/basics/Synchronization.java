package com.neosoft.basics;

public class Synchronization {

	public static void main(String[] args) {
		SharedResource s = new SharedResource();
		MyThread t1 = new MyThread(s,2,5);
		MyThread t2 = new MyThread(s,3,7);
		t1.start();
		t2.start();
		
		
	}

}
class SharedResource{
	
	synchronized static void doPrint(int x,int y) {		
		for(int i=x;i<=x+y;i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println();
	}
}

class MyThread extends Thread{
	SharedResource s;
	int x,y;
	
	public MyThread(SharedResource s,int x,int y) {
		this.s=s;
		this.x=x;
		this.y=y;
	}
	@Override
	public void run() {
		s.doPrint(this.x,this.y);
	}
}




