package problems;

public class Numberreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numb = 56478;
		int rev =0;
		
		while(numb!=0)
		{
			rev = rev *10 + numb%10;
			numb = numb/10;
		}
		System.out.println(rev);
	}

}
