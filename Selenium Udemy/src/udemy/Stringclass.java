package udemy;

public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String - It is one of the prebuilt class in JAVA
		
		String a = " Stringclass ";
		
		System.out.println(a.charAt(3));
		System.out.println(a.indexOf("g"));
		System.out.println(a.substring(5));
		System.out.println(a.substring(2, 6));
		System.out.println(a.concat("superb"));
		System.out.println(a.length());
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String arr[] = a.split("c");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("c", "g"));
	}

}
