package array;

public class ArrayLengthDemo 
{

	public static void main(String[] args) 
	{
		int []Source= {100,200,300};
		int[] dest=new int[3];
		
			System.arraycopy(Source,0,dest,0,Source.length);
			for(int i=0;i<dest.length;i++)

		System.out.println("element at index "+i+" :"+dest[i]);

	}

}
