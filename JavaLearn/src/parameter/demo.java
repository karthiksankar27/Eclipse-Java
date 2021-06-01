package parameter;

public class demo {

	public static void main(String[] args) {
		
		demo obj1=new demo();
		obj1.add(10,20);
		obj1.sum(25.45, 23.56);
	}
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Result is "+c);
	}
	public void sum(double x, double y)
	{
		double z=x+y;
		System.out.println("Result is "+z);

	}

}
