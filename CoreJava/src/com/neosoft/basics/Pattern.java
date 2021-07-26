package com.neosoft.basics;
import java.util.Scanner;


public class Pattern {
	int l_r_space,space,insides;
	int k=-1;
	int j=1;
	public void Pattern(int row,int column) {
		
		for(int i=1;i<=row;i++) {
			space=column-(k+2);
			l_r_space=space/2;
			insides=column-space;
			while(l_r_space>0) {
				System.out.print(" ");
				l_r_space--;
			}
			while(insides>0) {
				System.out.print(j++);
				System.out.print(" ");
				insides=insides-2;
			}
			l_r_space=(space/2)-1;
			while(l_r_space>0) {
				System.out.print(" ");
				l_r_space--;
			}
			System.out.println();
			k=k+2;
		}
		
	}
	
	
	public static void main(String []args) {
		
		Pattern p=new Pattern();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row=sc.nextInt();
		int column=(row*2)-1;
		p.Pattern(row,column);
		sc.close();
		
	}

}