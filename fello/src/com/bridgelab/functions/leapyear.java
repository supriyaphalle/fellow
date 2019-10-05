package com.bridgelab.functions;

import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("enter the year");
		int year= s.nextInt();
		boolean flag= utility.checkleapyear(year);
		if(flag)
			System.out.println("tyhe entered year is leapyear");
		else
			System.out.println("tyhe entered year is not leap year ");
		
	}

}
