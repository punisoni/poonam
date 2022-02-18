package unit2;

class Sem1
{ 
	public Sem1()
	{
		System.out.println("sem1 constructor ");
		
	}
	int math,c,cpp;
	void input()
	{
		math=50;
		c=60;
		cpp=70;
		
	}
	public void output()
	{
		System.out.println("Reasult of Semester-1\n\n");
		System.out.println("marks in mathematics   "+math);
		System.out.println("marks in c   "+c);
		System.out.println("marks in cpp  "+cpp);
		System.out.println("\n\n......................\n\n");
		}
	}
class Sem2 extends Sem1
{
	int java,dbms,eng;
	public Sem2()
	{
		System.out.println("sem2 constructor ");

	}
	public void input2()
	{
		java=55;
		dbms=88;
		eng=65;
	}
	public void output2()
	{
		System.out.println("Reasult of semester-2\n\n ");
		System.out.println("marks of java "+java);
		System.out.println("marks of dbms"+dbms);
		System.out.println("marks of english "+eng);
		}
}


public class singleInheritance {

	public static void main(String[] args)
	{
		Sem2 obj=new Sem2();
		obj.input();
		obj.input2();
		obj.output();
		obj.output2();
	}

}
