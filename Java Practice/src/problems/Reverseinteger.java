package problems;

public class Reverseinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numb = 14569;
		
		int rev=0;
		
		while(numb !=0 )
		{
			rev= rev*10;
			rev= rev  + numb %10;
			
			numb = numb/10;
			
		}
		System.out.println(rev);
		
		//using string buffer method
		long numb1 = 13165498;
		
		StringBuffer sb = new StringBuffer(String.valueOf(numb1));
		sb.reverse();
		System.out.println(sb);
	}

}
