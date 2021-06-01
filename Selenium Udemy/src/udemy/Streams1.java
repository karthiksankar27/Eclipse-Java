package udemy;

import java.util.ArrayList;

import org.testng.annotations.Test;

// Writing program to print number of names starts with A

public class Streams1 {

	@Test
	public void normal() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Asif");
		names.add("Abimanyu");
		names.add("Rahul");
		names.add("Swetha");
		names.add("Aadhi");
		
		int count=0;
		
		for(int i=0; i<names.size();i++)
		{
			String name = names.get(i);
			
			if(name.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
