
package unit2;

public class Shape {
	public void  area(int side)
	{
		int result =side*side;
		System.out.println("Area of Square is "+result);
		
	}
	public void area(int length,int breadth)
	{
		int result=length*breadth;
		System.out.println("Area of Reactangle is "+result);
		
	}
	public void area(double pi , int r)
	{
		double result=pi*r;
		System.out.println("Area of circle is  "+result);
	}

	public static void main(String[] args) {
		{
			Shape obj=new Shape();
			obj.area(10);
			obj.area(10,20);
			obj.area(3.14,6);		}

	}

}
