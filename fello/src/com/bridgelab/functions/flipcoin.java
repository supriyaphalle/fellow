package com.bridgelab.functions;

import java.util.Scanner;
public class flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of trials:");
		int trials= s.nextInt();
		int head=0, tail=0;
		for(int i=0;i<trials;i++)
		{
			if(Math.random()<0.5) 
				head++;
			else
				tail++;
		}
		
		System.out.println("total no of heads appeared::"+ head);
		System.out.println("total no of tails appeared::"+ tail);
		System.out.println("percentage of no of heads vs tails :"+100*head/trials+"/"+100*tail/trials);
		//System.out.println("percentage of no of tails:"+100*tail/trials);
		
		
		
	}

}
