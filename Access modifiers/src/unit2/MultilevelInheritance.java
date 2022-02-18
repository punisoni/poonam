package unit2;

class Sem4
{ 
	public Sem4()
	{
		System.out.println("sem4 constructor ");
		
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
		System.out.println("Reasult of Semester-4\n\n");
		System.out.println("marks in mathematics   "+math);
		System.out.println("marks in c   "+c);
		System.out.println("marks in cpp  "+cpp);
		System.out.println("\n\n......................\n\n");
		}
	}
class Sem5 extends Sem4
{
	int java,dbms,eng;
	public Sem5()
	{
		System.out.println("sem5 constructor ");

	}
	public void input2()
	{
		java=55;
		dbms=88;
		eng=65;
	}
	public void output2()
	{
		System.out.println("Reasult of semester-5\n\n ");
		System.out.println("marks of java "+java);
		System.out.println("marks of dbms"+dbms);
		System.out.println("marks of english "+eng);
		}
}
class Sem6 extends Sem5
{
	int m1,m2,m3;
	public Sem6()
	{
	System.out.println("sem6 costructor");
	}
	public void input3()
	{
		m1=65;
		m2=66;
		m3=73;
	}
	public void output3()
	{
		System.out.println("Reasult of semester-6\n\n ");
		System.out.println("marks of m1 "+m1);
		System.out.println("marks of m2 "+m2);
		System.out.println("marks of java "+m3);
		}
	}

public class MultilevelInheritance {

	public static void main(String[] args)
	{
		Sem6 obj=new Sem6();
		obj.input();
		obj.input2();
		obj.input3();
		obj.output();
		obj.output2();
		obj.output3();
	}

}

