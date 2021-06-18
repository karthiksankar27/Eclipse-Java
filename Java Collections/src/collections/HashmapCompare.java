package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashmapCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1,"A");
		map1.put(2,"B");
		map1.put(3,"C");
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		
		map2.put(3,"C");
		map2.put(1,"A");
		map2.put(2,"B");
		
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		
		map3.put(1,"A");
		map3.put(2,"B");
		map3.put(3,"C");
		map3.put(3,"D");
		
		//1.comparing on the basis of key value, using equals method
		
		System.out.println(map1.equals(map2)); // here we get output "true"
		System.out.println(map1.equals(map3)); // here we get output "false", because map3 has extra key with different value
		System.out.println("---------------------------");
		
		//2.comparing on the basis of same keys, using keyset method
		
		System.out.println(map1.keySet().equals(map2.keySet())); // here we get "true"
				
		System.out.println(map1.keySet().equals(map3.keySet())); // here we get "true", keys are same only mapp3 has another value
		System.out.println("---------------------------");

		
		//3.find out the extra keys
		
		HashMap<Integer,String> map4 = new HashMap<Integer,String>(); // here creating new map to combine with map1
		// and then to find the extra key from map4
		
		map4.put(1,"A");
		map4.put(2,"B");
		map4.put(3,"C");
		map4.put(4,"D");
		
		//now combine the keys using HashSet
		HashSet<Integer> keys = new HashSet<Integer>(map1.keySet()); // here getting the keyset of map 1 and
		// then converting it to hashset
		keys.addAll(map4.keySet()); // now the hashset having map1 keys will be added with map4 keys
		keys.removeAll(map1.keySet()); // here removing all the keys of map1
		System.out.println(keys); // here remaining will be only the extra keys
		System.out.println("---------------------------");

		
		//4.compare using values
		HashMap<Integer,String> map5 = new HashMap<Integer,String>();
		map5.put(1,"A");
		map5.put(2,"B");
		map5.put(3,"C");
		
		HashMap<Integer,String> map6 = new HashMap<Integer,String>();
		
		map6.put(4,"A");
		map6.put(5,"B");
		map6.put(6,"C");
		
		HashMap<Integer,String> map7 = new HashMap<Integer,String>();
		
		map7.put(1,"A");
		map7.put(2,"B");
		map7.put(3,"C");
		map7.put(4,"C");
		
		// on comparing values duplicate values are not allowed
		
		System.out.println(map5.values().equals(map6.values()));// this gives wrong answer
		// for key we are using keyset... that is the keys from the map are converted to set
		// but here we are directly comparing the keys
		// so in the below method we used arraylist to get the values and then comparing with the arraylist list of another values
		
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values()))); // gives true
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values()))); // gives false
		
		//if duplicates are allowed using HashSet
		
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values()))); //true
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values()))); // true
		
		
		
		
		
		
		

	}

}
