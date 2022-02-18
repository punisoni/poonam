package constructor;

 class dabhade 
{
int id;
String name;
dabhade(int id,String name)
{
this.id=id;
this.name=name;

	}

void display()
{
	System.out.println(id+ " "+name);
	
	}

 public static void main(String[] args) 
		
		{
	        dabhade obj1=new dabhade(1,"teju");
			dabhade obj2=new dabhade(2,"poonam");
            obj1.display();
			obj2.display();
		}
	}

