package unit2;
class Parent1
{
	static int i=10;
	Parent1()
	
	{
		System.out.println("value of i in parent class" +i);
		
	}
	
	
}
class child1 extends Parent1
{
	child1()
	{
		super();
		System.out.println("child class"+i);
		
	}
}

public class Inheritance 
{

	public static void main(String[] args)
	{
	child1 obj=new child1();

	}

}
