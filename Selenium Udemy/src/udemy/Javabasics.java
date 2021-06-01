package udemy;

public class Javabasics {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I started learning Java");			//just print output
		// add 2 numbers 2,3 5
		//int a=2;
		//int b=3;
		//int c=a+b;
		//System.out.println("Sum is "+c);     // sum of 2 numbers is completed
		//////////////////////////
		
		// Writing program to Validate header
		// creating object for the class Methods
		
		Methods m=new Methods();		//calling validateheader method from the Methods class
		
		m.ValidateHeader();  // used to call ValidateHeader method form Methods class - successful
		//System.out.println(m.validateheader());  // used to call validateheader method from Methods class - successful
		
		Javabasics a=new Javabasics();		//creating obj for this class
		a.getData();		// calling getData method of this class
		
	
	}
	public void getData()
	{
		System.out.println("I am in getData method");
	}

}
