
public class demo2 {
	
	public static void main(String args[])
	{
		String name = "My name is Karthik";
		
		String t= " ";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			t = t + name.charAt(i);
		}
		System.out.println(t);
	}

}
