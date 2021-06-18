package problems;

public class Specialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "#@%$%# karthik 0164691 #$%fdhd@#$%";
		
		//regular expression[a-zA-Z0-9]
		
		//s=s.replaceAll("[^a-zA-Z0-9]", "");
		s=s.replaceAll("[^a-z]", "");
		System.out.println(s);
		
	

	}

}
