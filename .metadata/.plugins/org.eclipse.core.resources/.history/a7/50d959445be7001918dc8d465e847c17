package com.bridgelab.functions;
import  java.util.Scanner;


public class intaddzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the array range");
		int N= s.nextInt();
		int a[]= new int[N];
		int i=0;
		System.out.println("Enter the array Elements");
		for(i=0;i<N;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Entered the array");
		System.out.println("a[]= ");
		for(i=0;i<N;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n Ans is");
		for(int p =0;p<(N-2);p++)
		{
			//System.out.println(p);
			for(int j=p+1;j<(N-1);j++)
			{
				for(int k=j+1;k<N;k++)
				{
					int g=(a[p]+a[j]+a[k]);
					//System.out.println(g);
					if(g==0)
					{
						System.out.println(a[p]+" " +a[j]+" "+a[k]);
					}
				}
			}
		}
		
	}

}
