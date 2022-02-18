package Statements;
import java.util.Scanner;

public class poonam {

	public static void main(String[] args) 
	{
		int a,b,c;
		int max=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter value a :");
		a=s.nextInt();
		System.out.println("enter value b :");
		b=s.nextInt();
		System.out.println("enter value c :");
		c=s.nextInt ();
		if (a>b)
		{
			if(a>c)
				max=a;
			else
				max=c;
			
		}
		else
		{
			if(b>c)
				max=b;
			else
				max=c;
			}
		{
		if(c>a)
			max=c;
		else
			max=a;
		}
	
	System.out.println("\n max value = " +max);
	

	}

}
