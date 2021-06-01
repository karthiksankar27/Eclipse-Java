package datatype;

public class Firstclass {

	public static void main(String[] args) {
		
		Firstclass obj1= new Firstclass();
		obj1.sum();
		

	}

	public void sum()
	{
		int a=90;
		int b=100;
		int c=a+b;
		System.out.println("Sum value = "+c);
		System.out.println("The values of a and b are"+a +" "+" "+b);
		System.out.println("The values of b and a are"+b +" "+" "+a);
	}
}
