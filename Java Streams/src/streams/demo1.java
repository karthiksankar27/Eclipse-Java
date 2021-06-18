package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 {

	// @Test
	public void display() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Andavar");
		names.add("Alavandhan");
		names.add("Bhoomi");
		names.add("Anil");
		names.add("Chutti");
		names.add("Domar");

		// instead the above method we can also convert the arrays to list using
		// "Arrays.asList" method ... check below commented line
		// List<String> names=
		// Arrays.asList("Andavar","Alavandhan","Bhoomi","Anil","Chutti","Domar"); ----
		// this also can be used

		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String check = names.get(i); // here we are getting name one by one

			if (check.startsWith("A")) {
				count++;
			}
		}
		System.out.println("Number of names starts with letter A is " + count);
	}

	// the above test we have written in normal format
	// now we are going to use the streams in getting the count of names with letter
	// "A"

	// @Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Andavar");
		names.add("Alavandhan");
		names.add("Bhoomi");
		names.add("Anil");
		names.add("Chutti");
		names.add("Domar");

		// stream is as collection of String
		// we are converting the arraylist into stream

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		// in the stream we are performing the filter operation
		// here the filter method takes the argument and lambda expression "->"
		// left side of the lambda expression should be variable .. here our variable is
		// "s"
		// right side of the lambda expression should be actions.. here our action is to
		// check the names "s.startsWith("A")"
		// here the filter method checks the names parallelly ...not in sequence like
		// for-loop (which we used before)
		// here the filter operation is the intermediate operation
		// now we will see the working of Stream
		// 01. Create a stream --- We have created Stream by using stream()
		// 02.Perform intermediate operations on the initial stream to
		// transform it into another stream and so on on further
		// intermediate operations ---- we performed intermediate operation using
		// filter()---
		// --- and converted one stream into another stream having names with letter "A"
		// 03.Perform terminal operation on the final stream to get the result
		// ---- here "count()" is the terminal operation which will be done on the
		// stream containing names with letter "A"

		// instead of having list of items we can create in the form of Streams....

		Long d = Stream.of("Arun", "Alaya", "Super", "Sumaar", "About").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		// above method we are creating a list by simply using Stream.of method
		// then the filter method can be written like this also
		// return true is to get the names starting with letter A
		// then we are counting the names stating with letter A

		names.stream().forEach(s -> System.out.println(s)); // this is used to print all the names in the List

		System.out.println("---------------------");
		names.stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));// this is used to print only the
																						// name with letters more than 5

		System.out.println("---------------------");

		names.stream().filter(s -> s.length() > 5).limit(2).forEach(s -> System.out.println(s));// this is used to print
																								// first 2 names with
																								// letters more than 5
																								// by using the limit
																								// method

	}

	
	//@Test
	public void streamMap() // we are using mapping method .... mapping method is used to manipulate the
							// data according to our requirement
	{
		// print the names ending with letter "a" to uppercase

		Stream.of("Anupama", "Babu", "Charlie", "Deva", "Elepha").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		// what we do here
		// we are passing the names in the streams
		// in the filter method names ends with "a" gets filtered into new streams
		// then the new streams is moved to map method
		// in the map method the stream from the filter method is changed to uppercase
		// then using this stream we are printing the names using forEach() method
		System.out.println("------------------------");

		Stream.of("Arjun", "Bheeman", "Charlie", "Aadhiban", "Children", "Subramani").filter(s -> s.endsWith("n"))
				.sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		// what we do here
		// here we are getting the names ending with letter "n"
		// and sorting
		// and then converting the names to uppercase
		// and then printing the names
		
		System.out.println("------------------------");

		
		Stream.of("Azuna", "Bheeman", "Charlie", "Aadhiban", "Children", "Aprajith").filter(s->s.startsWith("A"))
		.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		// what we do here
		// here we are getting the names starting with letter "A"
		// and then sorting the obtained names from filter methods
		// and then converting to uppercase
		// and then printing the names

	}

	
	//@Test
	public void list()
	{
		// we have 2 lists and we are going to merge them
		ArrayList<String> names = new ArrayList<String>();
		names.add("Andavar");
		names.add("Alavandhan");
		names.add("Bhoomi");
		names.add("Anil");
		names.add("Chutti");
		names.add("Domar");
		
		List<String> names1= Arrays.asList("Arjun", "Bheeman", "Charlie", "Aadhiban", "Children", "Subramani");
		
		Stream<String> newStream= Stream.concat(names.stream(), names1.stream());// here i am converting the list to streams and then concatinating and then storing in the stream
		//newStream.sorted().forEach(s->System.out.println(s)); // here we are sorting the concatenated stream and then printing
		
		System.out.println("----------------------------");
		
		//Stream.of(15,56,84,50,94,420,1,5,7,3).sorted().forEach(s->System.out.println(s)); // here i am just printing the numbers in sorted format
		
		// now we are going to find whether the name is present in the list or not
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Arjun"));// using anyMatch method to check whether the name is present in the list or not
		System.out.println(flag);
		Assert.assertTrue(flag); // here we are expecting true... if the flag is true testcase will be passed or else it will fail
		
		
		
		
	}
	

	@Test
	public void streamCollect()
	{
		// in the previous methods we have got the streams and manipulated for our requirements and then printed
		// here we are going to convert it back to the list using collect method
		List<String> ls = Stream.of("Arjun", "Bheeman", "Charlie", "Aadhiban", "Children", "Subramani").filter(s -> s.endsWith("n"))
		.sorted().map(s -> s.toUpperCase()).collect(Collectors.toList());
		// above---- we are converting the stream back to list
		
		System.out.println(ls.get(0));// from the list we are getting the name present in the index 0
		
		System.out.println("-----------------------------");
		
		//
		// now we are given a array of integers
		//1. we have to print the unique numbers of the array
		//2. sort the unique numbers array and get the 3rd element
		
		List<Integer> li = Arrays.asList(5,2,6,1,5,2,6,8,7,9,3,1,5); // here we are converting the array to the list so that we can use for stream
		li.stream().distinct().forEach(s->System.out.println(s));// here we are converting the list to stream and finding the unique using distinct method
		System.out.println("-----------------------------");
		List<Integer>newLi= li.stream().distinct().sorted().collect(Collectors.toList());// here i am sorting the unique numbers list and then converting back to list 
		//so that i can get the 3rd element in the sorted unique numbers list
	
		System.out.println(newLi.get(2));// here getting the 3rd element from the list
	}

}
