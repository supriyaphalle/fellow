package com.bridgelab.functions;
import java.util.Scanner;
public class CoupanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter coupen number: ");
		int n= s.nextInt();
		String Coupannumber= utility.Coupannumber();
		System.out.println("Coupan code  is: " +Coupannumber);
	}

}
