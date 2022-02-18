package ExceptionConcept;
import java. util.Scanner;
public class Vote 
{
	

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
	System.out.println("enter your age");
	int age=s.nextInt();
	try
	{
	if(age>18)
	{
		System.out.println("you are eligible");
		
	}
	else
	{   
		System.out.println("you are not eligible");
		
		}
	}
	catch(Exception e)
	{
	System.out.println("e")	;
	}
	}
}
