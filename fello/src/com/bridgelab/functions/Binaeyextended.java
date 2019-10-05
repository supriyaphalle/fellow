package com.bridgelab.functions;
import java.util.Scanner;
public class Binaeyextended {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
				int n=0,i,j;
				//String lowernibble= " ", uppernibble= " ";
			   Scanner s= new Scanner(System.in);
				System.out.println("enter decimal value");
					  n = s.nextInt();
			   String binary =utility.dicimaltobinary(n);
			   System.out.println(" binary conversion of decimal value " +n +" is" +binary);
			   
			   int length = binary.length();
			   //System.out.println(length);
			  String [] letters= binary.split(" ");
			  String x=String.valueOf(letters); 
			  int a= utility.swapNibbles(n);
			  System.out.println("Decimal conversion of binary number after nibble swapping is:: "+a);
			


		}

	}
