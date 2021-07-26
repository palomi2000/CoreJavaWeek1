package com.neosoft.basics;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements:");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter elements:");
		for(int i=0;i<n;i++)
		{
	        arr[i] = sc.nextInt();     
		}
		int max=arr[0];
		int min=arr[0];
		int maxpos=0;
		int minpos=0;
		for(int j=1;j<n;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
				maxpos=j;
			}
			if(arr[j]<min)
			{
				min=arr[j];
				minpos=j;
			}
		}
		int temp=arr[maxpos];
		arr[maxpos]=arr[minpos];
		arr[minpos]=temp;
		System.out.println("Modified Array"
				+ "");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}