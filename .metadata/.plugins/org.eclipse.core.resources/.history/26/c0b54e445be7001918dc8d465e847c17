package com.bridgelab.functions;

public class ElapsedTimeforSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arrayInt= {8,5,1,19,40,63,26,37};
		String [] arrayString = {"wsxc","edcf","ijhg","cgffi","pouy","wnbi","qazx","mnza","zxmo"};
		int lengthInt= arrayInt.length;
		int lengthString= arrayString.length;
		int SearchInt= 40;
		String SearchString= "pouy";
		long []elaspedtime =new long[6];
		long initialtime=0;
		long Finaltime=0;
		long difference, mils;
		
		 /// Insersion Sort
		 System.out.println("Insersion Sort Int");
		 initialtime = utility.starttime();
		int [] sortInt= utility.insertionSort(arrayInt);
		utility.printarray(arrayInt);
		Finaltime = utility.Endtime();
       elaspedtime[0]= utility.timeDifference(Finaltime, initialtime);    
       System.out.println(elaspedtime[0]);
	     
       ///Insersion for String;
	        
       System.out.println("\n Insersion Sort String");
			 initialtime = utility.starttime();
			 String [] sortSting= utility.insertionSortString(arrayString);
			 utility.printstringarray(sortSting);
			Finaltime = utility.Endtime();
			elaspedtime[1]= utility.timeDifference(Finaltime, initialtime);   
			System.out.println("\n"+elaspedtime[1]);
		
		 /// Binary search
			 System.out.println("Binary Search Int");
		 initialtime = utility.starttime();
		boolean f= utility.binarysearchint(arrayInt, SearchInt);
		System.out.println("\n"+f);
		Finaltime = utility.Endtime();
		elaspedtime[2]= utility.timeDifference(Finaltime, initialtime);     
		System.out.println(elaspedtime[2]);
		
		
	        ///Binary sEarch for String;
		 System.out.println("Binary Search String");
	      	 initialtime = utility.starttime();
			int res= utility.binarysearchstring(arrayString, SearchString);
			Finaltime = utility.Endtime();
			elaspedtime[3]= utility.timeDifference(Finaltime, initialtime);   
			System.out.print(elaspedtime[3]);
			
			//BubbleSort
			
			 System.out.println("Bubble sort Int \n");
			initialtime = utility.starttime();
			int sortInt1[]= utility.bubblesortint(arrayInt);
			utility.printarray(sortInt1);
			Finaltime = utility.Endtime();
	       elaspedtime[4]= utility.timeDifference(Finaltime, initialtime);    
	       System.out.println(elaspedtime[4]);
	       
		        ///Buibblefor String;
	       System.out.println("Bubble sort String \n");
				 initialtime = utility.starttime();
				 utility.bubblesortstring(arrayString);
				 
				Finaltime = utility.Endtime();
				elaspedtime[5]= utility.timeDifference(Finaltime, initialtime);   
				System.out.println(elaspedtime[5]);
			///Elapsed time array 	
				System.out.println("Elapsed time data is:");
				for(int i=0;i<6;i++)
				{
					System.out.print(elaspedtime[i]+" ");
				}	
		        
	        
	        
	}

}
