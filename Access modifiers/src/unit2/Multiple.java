package unit2;
interface A
{
	void show();
	
}
interface B
{
	void Disp();
	}
class Multiple implements A,B
{
public void show()
{
	System.out.println("Interface A ");
}
public void Disp()
{
	System.out.println("Interface B ");
}
	public static void main(String[] args)
	{
		Multiple m=new Multiple();
		m.show();
		m.Disp();
		
		

	}

}
