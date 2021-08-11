package com.Techment.day8.collections;

import java.util.Scanner;

public class TestQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your age");
		Scanner sc = new Scanner(System.in);
		int age[]=new int[5];
		
		for(int i=0;i<age.length;i++) {
			age[i]=sc.nextInt();
		}
		int c=0,b=0,a=0;
		for(int j=0;j<age.length;j++)
		{
		
		if(age[j]<18)
		{ 
			
			a++;
			
		}
		else if(age[j]>18 && age[j]<54)
		{
			
			b++;
			
		}
		else
		{
			
			c++;
			
		}
		System.out.println("Children :"+a);
		System.out.println("Adult :"+b);
		System.out.println("Senior citizen :"+c);
		}

	}

}
