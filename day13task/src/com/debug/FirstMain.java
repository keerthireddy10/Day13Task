package com.debug;

import java.util.Scanner;

public class FirstMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     FirstMain fm=new FirstMain();
     System.out.println("enter n value");
     int n=sc.nextInt();
     fm.print(n);
	}
	public void print(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(i);
		}
	
	}
	

}
