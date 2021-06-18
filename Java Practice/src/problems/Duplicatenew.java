package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicatenew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = {"Earth","Mars","Mercury","Jupiter","Earth", "Mars"};
		
		// normal method
		
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("The duplicate element is : "+names[i]);
				}
			}
		}
		
		
		//using set method
		
		Set<String> setname = new HashSet<String>();
		
		for(String name : names)
		{
			if(setname.add(name)==false)
			{
				System.out.println("The duplicate element in the set is : "+name);
			}
		}
		
		
		//using hashmap method
		
		Map<String,Integer> mapname = new HashMap<String,Integer>();
		
		for(String name : names)
		{
			Integer count = mapname.get(name);
			if(count==null)
			{
				mapname.put(name,1);
			}
			else
			{
				mapname.put(name, count+1);
			}
		}
		
		
		for(String check : mapname.keySet())
		{
			if(mapname.get(check)>1)
			{
				System.out.println("The duplicate element in the map is : "+check);
			}
		}
		
	}

}
