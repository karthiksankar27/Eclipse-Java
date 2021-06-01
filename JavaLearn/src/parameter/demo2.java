package parameter;

public class demo2 {

	public static void main(String[] args) {
		
		demo2 obj1=new demo2();
		//obj1.add(10,20);
		obj1.sum(25.45, 23.56);
		System.out.println("C is "+obj1.add(10,20));
		System.out.println("Name is "+demo2.fullname("Karthikeyan", "Sankar"));
		
	}
	public int add(int a, int b)
	{
		int c=a+b;
		return(c);
	}
	public void sum(double x, double y)
	{
		double z=x+y;
		System.out.println("Result is "+z);

	}
	public static String fullname(String first,String last)
	{
		String name=first+last;
		return name;
	}

}
