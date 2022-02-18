package array;

import java.util.Scanner;

public class Quize2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	int i;	
   int a[]=new int[5];
   
   
  for(i=0;i<5; i++)
 {
	  System.out.println(" enter value :");
	  a[i]=s.nextInt();
	  
  }
  System.out.println("\n array elements are: ");
  for(i=0;i<5;i++)
  {
	  System.out.println(" "+a[i]);
  }
	}

}
