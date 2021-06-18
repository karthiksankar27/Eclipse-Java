package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Newone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[] = {"Java", "C", "Ruby", "Python", "Java", "Spring", "Ruby"};
		
		//1. normal
		
		for(int i=0; i<name.length;i++)
		{
			for(int j=i+1; j<name.length;j++)
			{
				if(name[i].equals(name[j]))
				{
					System.out.println("Duplicate element is : "+name[i]);
				}
			}
		}
		
		
		//2. set
		
		Set<String> dset = new HashSet<String>();
		
		for(String setname : name)
		{
			 if(dset.add(setname)==false)
			 {
				 System.out.println("Duplicate element from set is : "+setname);
			 }
		}
		
		
		//3. Map
		
		Map<String,Integer> dmap = new HashMap<String,Integer>();
		
		for(String mapname : name)
		{
			Integer count = dmap.get(mapname);
			 if(count == null)
			 {
				 dmap.put(mapname, 1);
			 }
			 
			 else
			 {
				 dmap.put(mapname, count+1);
			 }
		}
		
		
		
		for(String check : dmap.keySet())
		{
			if(dmap.get(check)>1)
			{
				System.out.println("Duplicate element in the map is : "+check);
			}
		}
			
	}

}
