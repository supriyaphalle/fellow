package com.bridgelab.functions;

import java.util.Scanner;

public class FindYourNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N= Integer.parseInt(args[0]);
		int n= (int) Math.pow(2, N);
		int Number = utility.FindYourNumber(0,n-1);
		System.out.println("The number is  "+Number);
		
		
	}

}


