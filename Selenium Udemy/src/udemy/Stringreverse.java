package udemy;

public class Stringreverse {
	
	public static void main(String[] args) {
		
		String a="rahul";
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+ a.charAt(i);
		}
		
		System.out.println("Reversed string is "+b);
		
		if(a.equals(b))
		{
			System.out.println("The entered string " +a +" " +"is a palindrome");
		}
		else
		{
			System.out.println("The entered string " +a+" "+" is not a palindrome");

		}
	}

}
