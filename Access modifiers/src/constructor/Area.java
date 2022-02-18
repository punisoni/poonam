package constructor;
class Area
{
	public Area(int a)
	
	{
		int area=a*a;
		System.out.println("side of square is "+a);
		System.out.println("side of square is "+area);
		

				}
	public Area(int l,int b)
	{
		System.out.println("\n-------------------");
		int area=l*b;
		System.out.println("Length of rectangle "+l);
		System.out.println("Breadth of rectangle "+b);
		System.out.println("Area of rectangle is  "+area);
		}
	
	public Area( double pi,int r)
	{
		System.out.println("\n--------------------------");
		double area=pi*r*r;
		System.out.println("Radius of ciecle"  +r);

		
		System.out.println("Area of circle "+area);

	}
	public static void main(String args[])
	{
		Area obj1= new Area(10);
		Area obj2= new Area(101,20);
		Area obj3= new Area(3.14,4);
		
	}

}