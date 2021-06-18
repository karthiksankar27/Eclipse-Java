package problems;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<=50;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count==0)
			{
			System.out.println(i);
		}
		}
	}

}
