package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.normal method
		
		String names[] = {"Java","Ruby", "Javascript", "C", "Python","Java","C"};
		int number[] = {1,5,4,6,8,2,4,6,9,7,1};
		
			
		for(int i=0; i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("The duplicate element is : "+names[i]);
				}
			}
		}
		
		for(int i=0; i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++)
			{
				if(number[i]==(number[j]))
				{
					System.out.println("The duplicate element is : "+number[i]);
				}
			}
		}
		System.out.println("-------------------------------");
		
		//2.using set method
		
		Set<String> store = new HashSet<String>();
		
		for(String name : names )
		{
			if(store.add(name)== false)
			{
				System.out.println("The duplicate element is : "+name);
			}
		}
		
		Set<Integer> value = new HashSet<Integer>();
		
		for(Integer numb : number)
		{
			if(value.add(numb)== false)
			{
				System.out.println("The duplicate element is : "+numb);
			}
		}
		
		System.out.println("-------------------------------");
		
		//3. Using map method
		
		Map<String,Integer> demo = new HashMap<String,Integer>();
		
		for(String name : names )
		{
			Integer count = demo.get(name);
			if(count==null)
			{
				demo.put(name, 1);
			}
			else
			{
				demo.put(name, ++count);
			}
		}
		
				
		for(String dup : demo.keySet())
		{
			if(demo.get(dup)>1)
			{
				System.out.println("The duplicate element is : "+dup);
			}
		}
		
		Map<Integer,Integer> intmap = new HashMap<Integer,Integer>();
		
		for(Integer numb : number)
		{
			Integer count = intmap.get(numb);
			if(count == null)
			{
				intmap.put(numb, 1);
			}
			else
			{
				intmap.put(numb, ++count);
			}
		}
		
		//System.out.println(intmap.get(1));
		
		for(Integer dup : intmap.keySet()) 
		{
			if(intmap.get(dup)>1)
			{
				System.out.println("The duplicate element is : "+dup);
			}
		}
		
		
		
			
		
		
		
		
		
		
		

	}

}
