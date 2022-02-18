package array;

public class TwoDArray 
{

	public static void main(String[] args) 
	{
	int[][]myarray=new int[3][3];
	myarray[0][0]=1;
	myarray[0][1]=myarray[1][0]=0;
	myarray[1][1]=1;
	System.out.println("Array element are:");
	System.out.println(myarray[0][0]+" " +myarray[0][1]);
	System.out.println(myarray[1][0]+" " +myarray[1][1]);

	}

}
