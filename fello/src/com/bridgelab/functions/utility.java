package com.bridgelab.functions;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author slot2
 *
 */
public class utility {

	static Scanner s= new Scanner(System.in);
	
	 public static double doublevalue() {
			double doublevalue = s.nextDouble();
			return doublevalue;
			 
		 }


	//**********************************************************************		
	//   printing array
	//*********************************************************************	


	public static void printarray(int []a)
	{
	    //Retrieving values from list
	    int size = a.length;
	    for(int i=0;i<size;i++)
	    {
	        System.out.print(a[i]+" ");
	    }
	}



	 
//**********************************************************************		
//	                  arrray input
//*********************************************************************	
			
	public static int [] arrayinput()
	{
		System.out.println("Enter the length of array");
		int l= s.nextInt();
		System.out.println("enter the array element");
		int []array=new int[l] ;
		for(int i=0;i<l;i++)
		{
			array[i]= s.nextInt();			
		}
		return array;
	}

	 
//**********************************************************************		
//	                  arrray input String
//*********************************************************************	

	
	public static String [] arrayinputString()
	{
		System.out.println("Enter the length of array");
		int l= s.nextInt();
		System.out.print("\n enter the array element(String)");
		String []array=new String [l] ;
		for(int i=0;i<l;i++)
		{
			array[i]= s.next();			
		}
		return array;
	}


	 
//**********************************************************************		
//	                  arrray Printing String
//*********************************************************************	

	
	  public static void printstringarray(String []a) 
	  {
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.print (a[i]+" "); 
		   }
	  }
	 
	 
	//**********************************************************************		
//	                   check leap year		
	//*********************************************************************	
			
			/**
			 * @param year
			 * @return
			 */
			public static boolean checkleapyear(int year)
			{
				boolean flag= true;
				if(year%400==0)
					flag= true;
				else if(year%100==0)
					flag= false;
				else if(year%4==0)
					flag= true;
				
				return flag;
			}
			
//**********************************************************************		
//	                   power of two	
//*********************************************************************	

public static void poweroftwo(int n)	
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(Math.pow(2, n));
		}
	}

//**********************************************************************		
//                         Hormonic sum	
//*********************************************************************	


public static int harmonic(int n)
{
	int sum=0;
	for(int i=0;i<n;i++)
	{
		sum= sum+ 1/i;
	}
	return sum;
}

//**********************************************************************		
//                       Prime factors
//*********************************************************************	


public static void primefactors(int n)
{
	while(n%2==0)
	{
		System.out.println("2 ");
		n/=2;
	}
	
	for(int i=0; i<Math.sqrt(n);i=i+2)
	{
		if(n%i==0)
		{
			System.out.println(i+ " ");
			n/=2;
		}
	}
		
}

//**********************************************************************		
//                     swipe string
//*********************************************************************	

public static String swapstring(String a, int i, int j)
{
	char[] b = a.toCharArray();
	char temp= b[i];
	b[i]= b[j];
	b[j]= temp;	
	return String.valueOf(b);
}

//**********************************************************************		
//                   permutation of string 
//*********************************************************************	

public static void permutationofstring(String str, int start, int end)
{
    if (start == end-1)  
        System.out.println(str);  //print permutation of string
    else  
    {  
        for (int i = start; i < end; i++)  
        {  
            str = swapstring(str,start,i);  
            permutationofstring(str,start+1,end);  
            str = swapstring(str,start,i);  
        }
    }
}


//**********************************************************************		
//                Stop watch
//*********************************************************************	
public static long starttime()
{
	long initialtime = System.currentTimeMillis();
	 System.out.println(" initialtime" + initialtime);
	return  initialtime ;
}
public static long Endtime()
{
	long Finaltime = System.currentTimeMillis();
	 System.out.println(" Finaltime" + Finaltime);
	return Finaltime;
}

public static long timeDifference(long Finaltime,long initialtime)
{
	 long difference= Finaltime - initialtime;
	
	long mils = difference % 1000;

       difference = (difference - mils) / 1000; // in seconds
	
	
	return  difference;
}



//**********************************************************************		
//              Quadratic
//*********************************************************************	


public static double quadratic(double a,double b,double c) {
	
	 double delta = Math.sqrt(b * b - 4 * a * c);
	 
    double root1 = (-b +  delta) / (2*a) ;
    double root2 = (-b -  delta) / (2*a) ;

   System.out.println("The roots of the Quadratic Equation \"a*x*x + b*x + c\" are " +root1+" and "+root2);
	
    return 0;
	
}


//**********************************************************************		
//            ANAGRAM CHACKING	
//*********************************************************************	

public static boolean anagramchecking(String a, String b)
{
	char[]a1=a.toCharArray();
	char[]b1=b.toCharArray();
	int l1= a1.length;
	int l2= b1.length;
	if(l1!=l2)
	{
		return false;
	}
	else 
	{
		Arrays.sort(a1);
		Arrays.sort(b1);
		for(int i=0;i<l1;i++)
		{
			if(a1[i]!=b1[i])
			{
				return false;
			}
		}
		
	}
	return true;
}



//**********************************************************************		
//          find prime numbers	
//*********************************************************************	
public static boolean primenumber(int a)
{
 
	
		boolean flag=true;
		for(int j=2;j<a;j++)
		{
			if((a%j==0) &&(a!=j) )
			{
				 flag= false;
			}
		}
		if(flag)
		{
			return true;
			//count++;
			//System.out.println(count);
		}
		
		//System.out.println("total number of prime number within the range of "+a+"&"+b+" are :: " + count);
		return false;
}	
	


//**********************************************************************		
//       	palindrome number
//*********************************************************************	
public static boolean palindromnumber(int a)
{
	String str= String.valueOf(a);
	char []arr= str.toCharArray();
	int length = arr.length-1;
	//boolean flag= true
	for(int i=0; i<=length;i++)
	{
		if(arr[i]!= arr[length-i])
		{
			return false;
		}
	}
	return true;
	
}


//**********************************************************************		
// find anagram
//*********************************************************************	


public static void findanagram(int []a)
{
	int size = a.length;
	
	for(int k=0;k<size-1;k++)
	{
		String a1= String.valueOf(a[k]);
		for(int j=(k+1);j<size;j++)
		{	
			String b1= String.valueOf(a[j]);
			if(a1!=b1)
			{
				boolean flag =  utility.anagramchecking(a1,b1);
				if(flag)
				{
					System.out.print("    " + a1 +"&"+ b1);
				}
			
			}
		}
		
	}
}


//**********************************************************************		
// FIND PALINDROME FOR INTEGER
//*********************************************************************	
public static void findpalindrome(int []a)
{
	int size = a.length;
	for(int k=0;k<size-1;k++)
	{
		boolean flag=true;
		String str= String.valueOf(a[k]);
		char[] b= str.toCharArray();
		int length=b.length;
		if(length>1)
		{
			for(int i=0;i<length;i++)
			{
				if(b[i]!=b[length-1-i])
				{
					flag= false;
				
				}
			}
		
			if(flag)
			{
				System.out.print(a[k]+" ");
			}
		}
	}
	
}


//**********************************************************************		
//binary search for integers 
//*********************************************************************	


public static boolean binarysearchint(int []a, int x)
{ 
	Arrays.sort(a);
	int i=0, length= a.length-1;
	while(i<=length)
	{
		int m=(i+length)/2;
		if(x==a[m])
		return true;
		if(x>a[m])
			i= m+1;
		if(x<a[m])
			length=m-1;
		
   }
	return false;
}




//**********************************************************************		
//binarySearch method for String
//*********************************************************************	

public static int binarysearchstring(String []a, String x)
{ 
	Arrays.sort(a);
	int i=0, length= a.length-1;
	while(i<=length)
	{
		int m=(i+length)/2;
		int res= x.compareTo(a[m]);
		if(res==0)
			return m;
		if(res>0)
			i=m+1;
		else
			length= m-1;
	}
	return -1;
}




//**********************************************************************		
//        insertionSort method for integer

//*********************************************************************	


public static int[] insertionSort(int words[]){
	int temp;
	for(int i=1;i<words.length;i++){
		for(int j=i;j>0;j--){
			if((words[j]-words[j-1])<0){
				temp=words[j];
				words[j]=words[j-1];
				words[j-1]=temp;
			}
			else
				break;
		}
	}
	return words;
}


//**********************************************************************		
//b               insertionSort method for String
//*********************************************************************	

public static String[] insertionSortString(String words[]){
	String temp;
	for(int i=1;i<words.length;i++){
		for(int j=i;j>0;j--){
			if(words[j].compareTo(words[j-1])<0){
				temp=words[j];
				words[j]=words[j-1];
				words[j-1]=temp;
			}
			else
				break;
		}
	}
	return words;
}






//**********************************************************************		
//b              bubbleSort method for integer
//*********************************************************************	
public static int [] bubblesortint(int []arr)
{
	int n= arr.length,i=0;
	for( i=0;i<n-1;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1]= temp;
			}
		}
		
	}
		/*
		 * System.out.println("Sorted data is:"); for(i=0;i<n;i++) {
		 * System.out.print(arr[i]+" "); }
		 */
	return arr;
}



//**********************************************************************		
//b              bubbleSort method for String
//*********************************************************************	

public static void bubblesortstring(String []arr)
{
	int n= arr.length,i=0;
	for( i=0;i<n-1;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(arr[i].compareTo(arr[j]) < 0)
			{
				String temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1]= temp;
			}
		}
		
	}
	System.out.println("Sorted data is:");
	for(i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
}


//**********************************************************************		
//b              vending machine for notes
//*********************************************************************	


public static int vendingmachinenote(int money,int index,int count)
{
	int temp=0;
	int []moneyatmachine= {1000,500,100,50,10,5,2,1};
	
	
		//for(int i=0;i<=moneyatmachine.length-1;i++)
		
		if(money==0)
		{
			System.out.println("Minimum number of notes are  "+count);
			return -1;
		
		}
		else
		{		
			if(money>=moneyatmachine[index])
			{
				 temp= money/moneyatmachine[index];
				money= money-temp*moneyatmachine[index];
				System.out.println(temp +"notes of"+ moneyatmachine[index]);
				count+=temp;
			}
			index++;
			vendingmachinenote(money,index,count);
		
	}
	return -1;
}


//**********************************************************************		
//b             Distance
//*********************************************************************	


public static double distance(double x,double y)
{

    // compute distance to (0, 0)
    double dist = Math.sqrt(x*x + y*y);
    
    System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	System.out.println("Power of x and y is :"+Math.pow(x, y));
    
    return 0;

  
}


//**********************************************************************		
//b              windchill
//*********************************************************************	



public static double  windchill(double temprature,double speed ) {
	
	
    
double 	 chill= 35.74 + 0.6215*temprature + (0.4275*temprature- 35.75) * Math.pow(speed, 0.16);                                                                  

		return chill;
		
		
	}

//**********************************************************************		
//b              day of week
//*********************************************************************	

public static int dayofweek(int month, int day, int year) {
    int y = year - (14 - month) / 12;
    int x = y + y/4 - y/100 + y/400;
    int m = month + 12 * ((14 - month) / 12) - 2;
    int d = (day + x + (31*m)/12) % 7;
    return d;
}

//**********************************************************************		
//						sqrt
//*********************************************************************	


public static void sqrt(double c)
{
	double epsilon = 1.0e-15; 
	double t = c;
	while (Math.abs(t - c/t) > epsilon*t)
	{
           t = (c/t + t) / 2.0;
     }
        System.out.println("Squaroot is  "+t);
     // return t;
}


//**********************************************************************		
//						Binary conversion
//*********************************************************************	



public static String dicimaltobinary(int n)
{
	int a;
	String x= " ", reverse= " ";
	while(n>0)
	{
		a=n%2;
		x= x+ " " +a;
		n=n/2;
	}
	int length = x.length();
	for(int i= length-1; i>0;i--)
	{
		reverse += x.charAt(i);
	}
	return reverse;
}


//**********************************************************************		
//						Swap nibble
//*********************************************************************	


public static int swapNibbles(int x) 
{ 
    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
} 

//**********************************************************************		
//						Swap nibble
//*********************************************************************	
public static void Temperatureconversion(int c, int f)
{
     int cel = (c*9/5) + 32;
     int far = (f-32) * 5/9;
     System.out.println( c +" temperature in fahrenheit :" +far);
    
     System.out.println(f + " temperature in celcious: " +cel);
    
     
}

//**********************************************************************		
//						Monthly payment
//*********************************************************************	

public static double  MonthlyPayment( int P, int Y, int R)
{
    double payment=0;
    double r= R/(12*100);
    double n= 12*Y;
    payment= (P*r)/(1-(Math.pow((1+r), -n)));
	return payment;
}


//**********************************************************************		
//						Coupannumber
//*********************************************************************	

public static String Coupannumber()
{	int max= 1000000000;
	char [] data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	StringBuffer sb =new StringBuffer(); 

	int random=(int) (Math.random()*max);	
	System.out.println("Random" +random);
	System.out.println("data length= "+data.length);
	System.out.println("data is");
	while (random>0)
	{
		sb.append(data[random % data.length]);
		System.out.println(random % data.length);
		random /= data.length;
	}

	String couponCode=sb.toString();
	//System.out.println("Coupon Code: "+couponCode);	

	
	return couponCode ;
}



//**********************************************************************		
//						mearge sort
//*********************************************************************	
 



//**********************************************************************		
//						Find your Number
//*********************************************************************	


public static int  FindYourNumber(int a, int b)
{ 
	int x= b-a;
	//System.out.println("\n"+x);
	if(x==1) {
		return b;
	}
	 
	int mid= (a+b)/2;
	System.out.println("\n Is your number is greater than " +mid);
	System.out.println("// press  true if number is greater than  the above number accordingly");
	//boolean check = s.;
	String check= s.nextLine();
	if(check.equals("true"))
	{	return utility.FindYourNumber(mid,b);
	
	}
	else
	{
		return utility.FindYourNumber(a, mid);
	}
	//return -1;
}


////public static boolean binarysearchint(int []a, int x)
//{ 
//	Arrays.sort(a);
//	int i=0, length= a.length-1;
//	while(i<=length)
//	{
//		int m=(i+length)/2;
//		if(x==a[m])
//		return true;
//		if(x>a[m])
//			i= m+1;
//		if(x<a[m])
//			length=m-1;
//		
//   }
//	return false;
//}
//
//



}

