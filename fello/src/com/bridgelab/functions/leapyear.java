package com.bridgelab.functions;

import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("enter the year");
		int year= s.nextInt();
		boolean f= utility.checkleapyear(year);
		if(f)
			System.out.println("the entered year is leapyear");
		else
			System.out.println("the entered year is not leap year ");
		
	}

}
