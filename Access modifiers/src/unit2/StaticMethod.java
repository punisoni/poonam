package unit2;

class computer
{
	 int core;
	 String name;
	 static String compname="lenovo";
	 
	 static void modify()
	 {
		 compname="dell";
		 
	 }
	 computer(int c,String n)
	 {
		 name=n;
		 core=c;
	 }
	 public void show()
	 {
		 System.out.println( core+" " +name+" "+compname);
		 
	 }
}
public class StaticMethod
{
	 public static void main(String[] args) 
	 {
		 computer.modify();
		 
		 computer c=new computer(20,"poonam");
		 computer c1=new computer(25,"soni");
		 c.show();
		 c1.show();
		 


	}

}

