package unit2;

class dabhade 
{
int id;
String name;
static String college ="snd";

dabhade(int id,String name)
{
this.id=id;
this.name=name;

	}

void display()
{
	System.out.println(id+ " "+name+" " +college);	
	}
}
public class StaticVariable
{
	public static void main(String[] args) 
		
		{
	        dabhade obj=new dabhade(1,"teju");
			dabhade obj2=new dabhade(2,"poonam");
           obj.display();
			obj2.display();
		}
	}
