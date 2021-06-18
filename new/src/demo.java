
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "My name is Karthik";
		
		String t= " ";
		
		String revName = "";
		
		String newName[] = name.split(" ");
		
		for(int i=0;i<newName.length;i++)
		{
			System.out.print(newName[i] + " " );
		}
		
		for(int j=newName.length-1; j>=0;j--)
		{
			
			revName = revName + newName[j] + " ";
			
		}
		System.out.println("");
		System.out.println(revName);
	
		 String revString[] = revName.split(" ");
		 int a=0;
		String t1= " " ;
		 while(a<revString.length)
		 {
			 for(int k =revString[a].length()-1; k>=0 ;k--)
					 {
				 		t1 = t1 + revString[a].charAt(k);
				 		
					 }
			 t1 = t1 + " " ;
		 		
			 
			 a++;
		 }
		 
		 System.out.println(t1);
		 
	

}
}
