package constructor;

class SV 
{
	int rollno;
	String name;
	static String college="ITS";
	SV(int r,String n)
	
	{
rollno=r;
name=n;

	}
	
	
	void display()
	{
		System.out.println(rollno+"" +name+""+college);
		
	}
	}
class SV1{

public static void main(String[] args)	
{
	SV obj1=new SV(1,"rushi");
	SV obj2=new SV(2,"dada");
	obj1.display();
	obj2.display();
}

	}

	


	
