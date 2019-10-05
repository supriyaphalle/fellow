package com.bridgelab.functions;
import java.util.Scanner;

public class poweroftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the power value :");
		int n = s.nextInt();
		if(n<0 && n<=31 )
		{
			utility.poweroftwo(n);
		}
		else
			System.out.println("out of order");
	}

}
