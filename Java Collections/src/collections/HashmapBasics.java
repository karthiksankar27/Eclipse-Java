package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//no order - no indexing
		//stores values in key,value pair format <k,v>
		//key cannot be duplicate
		//can store n number of null values , but only 1 number of null key
		// hashmap is not threadsafe - unsynchronized
		
		HashMap<String,String> capital = new HashMap<String,String>(); // here we are creating the hasmap which have key and value pair
		capital.put("India", "New Delhi"); //here we are putting pair in the hashmap
		capital.put("Andhra", "Amaravati");
		capital.put("TamilNadu", "Chennai");
		capital.put("Kerala", "Thiruvananthapuram");
		capital.put("Goa", "Panaji");
		capital.put(null, "Super");
		capital.put("Gujarat", "Gandhinagar");
		capital.put("Karnataka", "Bengaluru");
		capital.put("Maharashtra", "Mumbai");
		capital.put("Delhi", null);
		capital.put("Odisha", null); // we can have "n" number of null values but only one number of null key
		
		capital.remove("Goa"); // here we are removing the pair Goa using the key "Goa"
		
		System.out.println(capital.get("TamilNadu")); // here we are getting the value of key "TamilNadu" and printing
		System.out.println(capital.get("Goa"));
		
		System.out.println(capital.get(null));
		System.out.println(capital.get("Delhi"));
		
		// now we are going to iterate over the keys using keyset()
		
		System.out.println("--------------------------");
		
		Iterator<String> it = capital.keySet().iterator();
		
		while(it.hasNext())
		{
			
			String key = it.next();
			String value = capital.get(key);
			System.out.println(value);
			
		}
		
		System.out.println("--------------------------");

		//iterate over the set pair using entryset
		
		Iterator<Entry<String,String>> it1 = capital.entrySet().iterator();
		
		while(it1.hasNext())
		{
			Entry<String,String> entry=it1.next();
			System.out.println("Key : "+ entry.getKey() + " " + "Value :" +entry.getValue());
						
			
		}
		
		System.out.println("--------------------------");

		
		// now iterating using Streams and lambda
		
		capital.forEach((k,v)->System.out.println("key = "+k+" "+ "Value= "+v));
		
		
		
		
		

	}

}
