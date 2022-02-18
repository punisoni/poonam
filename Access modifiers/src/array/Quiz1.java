package array;

public class Quiz1 
{

	public static void main(String[] args)
	{
	int a[]=new int[5];
	int k,sum=0;
	a[0]=100;
	a[1]=200;
	a[2]=300;
	a[3]=400;
	a[4]=500;
	for(k=0;k<a.length;k++)
	{
		sum=sum+a[k];
		
	}
	
		System.out.print("sum is : "+sum);	

	}

}
