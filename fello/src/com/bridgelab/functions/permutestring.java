package com.bridgelab.functions;

import java.util.Scanner;
public class permutestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter string");
		String  a= s.nextLine();
		int length = a.length();
		utility.permutationofstring(a, 0, length);
		
	}

}
