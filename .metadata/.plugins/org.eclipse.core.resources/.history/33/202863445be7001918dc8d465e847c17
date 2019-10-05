package com.bridgelab.functions;

import java.util.Scanner;

		public class stopwatch {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				long initialtime=0;
				long Finaltime=0;
				Scanner s= new Scanner(System.in);
				System.out.println("Do you want to start stopwatch  (y/n):");
				char opt= s.next().charAt(0);
				if(opt=='y')
				{
					 initialtime = utility.starttime();
				}
				System.out.println("press y to stop the stopwatch:");
				char a= s.next().charAt(0);
				if(a=='y')
				{
					Finaltime = utility.Endtime();
					
				}
				long difference;
				 difference= Finaltime - initialtime;
				 System.out.println(" time is :" +difference);
				long mils = difference % 1000;

			        difference = (difference - mils) / 1000; // in seconds

			        long secs = difference % 60;

			        difference = (difference - secs) / 60; // in minutes

			        long minutes = difference % 60;

			        difference = (difference - minutes) / 60; // in hours

			        long hours = difference % 24;

			        difference = (difference - hours) / 24; // in days

			        long days = difference;
			        String message = "";

			        if (days > 0) {
			            message = days + " days and  " + hours + " hours";
			        } else if (hours > 0) {
			            message = hours + " hours and " + minutes + " minutes";
			        } else if (minutes > 0) {
			            message = minutes + " minutes and " + secs + " seconds";
			        } else if (secs > 0) {
			            message = secs + " seconds and " + mils + " milliseconds";
			        } else {
			            message = mils + " milliseconds";
			        }
				System.out.println(message);
				
				
				
				
				
			}

		}


