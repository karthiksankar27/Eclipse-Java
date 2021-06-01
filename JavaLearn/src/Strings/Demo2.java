 package Strings;

public class Demo2 {

	public static void main(String[] args) {
		String name="India-UT-Puducherry-Muthialpet";
		String []locate=name.split("-");
		
		for(int i=0;i<locate.length;i++)
		{
			System.out.println("value for "+i+ " is "+locate[i]); 
			if(locate[i].equalsIgnoreCase("puducherry"))
			{
				break;
			}
		}

	}

}
