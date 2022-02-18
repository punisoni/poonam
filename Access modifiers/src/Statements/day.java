package Statements;
import java.util.Scanner;


public class day {

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
	System.out.println("enet day between 0 to 6 Day=");
	int day =s.nextInt();
	if (day==0)
	{
	System.out.println("\n Sunday");
	
	}
	else if(day==1)
	{
		System.out.println("\n monday");
	}
	else if(day==2)
	{
		System.out.println("\n tuesday");
	}
	else if(day==3)
		
	{
		System.out.println("\n wednesday");
	}
	else if(day==4)
	{
		System.out.println("\n Thursday");
	}
	else if(day==5)
	{
		System.out.println("\n friday");
     }
	else if(day==6)
	{
		System.out.println("\n Saturday");
     }
	else 
	{
		System.out.println("\n wrong input");
	
	  }
	
	} 

 }
