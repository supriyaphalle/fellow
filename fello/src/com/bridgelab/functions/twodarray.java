package com.bridgelab.functions;
import java.util.Scanner;
public class twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no rows and coloms ");
		System.out.println("rows:=");
		int M= s.nextInt();
		System.out.println("Coloms:=");
		int N= s.nextInt();
		System.out.println(" select the data type for the inpput number:\n 1.integer    \n 2.Double \n 3.Boolean ");
		int opt =s.nextInt();
		int a[][]= new int[M][N];
		double b[][]= new double[M][N];
		boolean c[][]= new boolean[M][N];
		
		System.out.println("Enter the matrix Elements");
		switch(opt)
		{
		case 1: 
			{	// int a[][]= new int[M][N];
				for(int i=0; i<M;i++)
				{
					for(int j=0;j<N;j++)
					{
						a[i][j]= s.nextInt();
					}
				}
				
				System.out.println("The entered matrix is:");
				for(int i=0; i<M;i++)
				{
					for(int j=0;j<N;j++)
					{
						System.out.print(a[i][j]+"   ");
					}
					System.out.println();
				}
				break;
			}
		case 2: 
		{	// double b[][]= new double[M][N];
			for(int i=0; i<M;i++)
			{
				for(int j=0;j<N;j++)
				{
					b[i][j]= s.nextDouble();
				}
			}
			System.out.println("The entered matrix is:");
			for(int i=0; i<M;i++)
			{
				for(int j=0;j<N;j++)
				{
					System.out.print(b[i][j]+"   ");
				}
				System.out.println();
			}
			break;
		}
		case 3: 
		{	 //boolean c[][]= new boolean[M][N];
			for(int i=0; i<M;i++)
			{
				for(int j=0;j<N;j++)
				{
					c[i][j]= s.nextBoolean();
				}
			}
			System.out.println("The entered matrix is:");
			for(int i=0; i<M;i++)
			{
				for(int j=0;j<N;j++)
				{
					System.out.print(c[i][j]+"  ");
				}
				System.out.println();
			}
			break;
		}	
		default: break;
			
			
		}
		
		
		
	}

}
