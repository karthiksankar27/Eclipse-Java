package problems;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int list[] = {6646, 64 ,54, 94 ,64,3123,6949 ,94949,54,63,04,784,6465464,987987987,0254,3546,02};
		int smallest = list[0];
		int largest = list[0];
		
		for(int i=1;i<list.length;i++)
		{
			
				if(smallest>list[i])
				{
					smallest = list[i];
				}
				
				else if(largest<list[i])
				{
					largest = list[i];
				}
			
	}
		
		System.out.println("Smallest : "+smallest+ " " + "Largest : "+largest);
	}

}
