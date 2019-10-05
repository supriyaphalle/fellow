package com.bridgelab.functions;
import java.util.Scanner;
public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no fo Stake, Goals, Trials: ");
		System.out.println("Stake:=");
		int Stake= s.nextInt();
		System.out.println("Goals:=");
		int Goal= s.nextInt();
		System.out.println("trials:=");
		int trials= s.nextInt();
		
		int bets=0;
		int wins=0;
		for(int i=0; i< trials; i++)
		{
			int cash= Stake;
			while(cash>0 && cash < Goal)
			{
				bets++;
				if(Math.random()<0.5)
					cash++;
				else 
					cash--;
			}
			if(cash== Goal)
				wins++;
			
		}
		System.out.println(wins+" wins of " +trials);
		System.out.println("Percentage no of game wins :: "+ 100*wins/trials);
		//System.out.println("")
		
		s.close();
	}

}
