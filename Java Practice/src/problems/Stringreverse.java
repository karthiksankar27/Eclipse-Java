package problems;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "My name is Karthik";
		
		String t= " ";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			t = t + name.charAt(i);
		}
		
		System.out.println(t);
		
		String names[] = name.split(" ");
		//System.out.println(names[1]);
		String u = " ";
		for(int i=names.length-1;i>=0;i--)
		{
			u = u + names[i];
			System.out.print(" "+names[i]);
		}
		
		
		StringBuffer sb = new StringBuffer(name);
		
		System.out.println("\n"+sb.reverse());
	}
	
	

}
