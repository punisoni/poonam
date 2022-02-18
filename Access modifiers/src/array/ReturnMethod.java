package array;

import java.util.Arrays;
 public class ReturnMethod
 {


	public static String[]return_Array()
	
	{
String[]ret_Array= {"Ruby","java","python","c","c++"};
return ret_Array;
}
public static void main(String args[])
{
	String[]str_Array=return_Array();
	
	System.out.println("Array returned from method:"+Arrays.toString(str_Array));
}
}
