package com.bridgelab.functions;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Insersion sort for Integers");
		
		int [] UnsortedArray= utility.arrayinput();
		System.out.println("\n unSorted array is");
		utility.printarray(UnsortedArray);//to print array
		
		int [] sortedArray = utility.insertionSort(UnsortedArray);
		System.out.println("\nSorted array is");
		utility.printarray(sortedArray);
	}

}
