package com.bridgelab.functions;

import java.util.ArrayList;
import java.util.List;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s= new Scanner(System.in);
		int []a= new int[170];
		int count=0;
		for(int i=0; i<1000;i++)
		{
			boolean f = utility.primenumber(i);
			if(f)
			{
				a[count]=i;
				count= count+1;
			 
			}
		}
		System.out.println();
		System.out.println("count is"+count); 
		
		utility.printarray(a);//print prime numbers
		System.out.println("\n");
		System.out.println("\n anagram numbers");
		utility.findanagram(a);
		
		System.out.println("\n palindrome numbers");
		utility.findpalindrome(a);
		
		

	}

}
