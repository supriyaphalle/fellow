package com.bridgelab.functions;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		int r= Integer.parseInt(args[2]);
		
		System.out.println("principle amount= "+p);
		System.out.println("year = "+y);
		System.out.println("percentage intrest  "+r);
		double payment= utility.MonthlyPayment(p, y, r);
		System.out.println("the monthly payment is "+payment);
	}

}
