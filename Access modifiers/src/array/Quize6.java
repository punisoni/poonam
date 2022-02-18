package array;

public class Quize6 
{ 

	public static void main(String[] args) 
	{
		int[] value= {1,2,3,4};
		int[]a=new int[5];//{1,2,3,4};
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		for (int i=0; i<value.length;i++)
		{
			System.out.println("element at index 0:"+a[0]);
			System.out.println("element at index 1:"+a[1]);
			System.out.println("element at index 2:"+a[2]);
			System.out.println("element at index 3:"+a[3]);
			System.out.println("element at index 4:"+a[4]);
			}
	 }

}
