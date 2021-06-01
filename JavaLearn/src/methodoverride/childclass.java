package methodoverride;

public class childclass extends parent{

	public static void main(String[] args) {
		
		childclass obj1=new childclass();
		obj1.display();
		
		parent obj2=new parent();
		obj2.display();
		
		parent obj3=new childclass();
		obj3.display();

	}
	public void show()
	{
		System.out.println("I am in childclass show method");

	}
	public void display()
	{
		System.out.println("I am in childclass display method");
	}

}
