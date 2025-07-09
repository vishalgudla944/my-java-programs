//retriving values using iterator
import java.util.*;
class p89HashSet3{
	
	public static void main(String args[]){
		
		HashSet<String> names = new HashSet<String>();
		names.add("Vishal");
		names.add("Ramesh");
		names.add("Siddhu");
		names.add("Sanjay");
		
		//Using iterator
		//In iterator  hasNext() is Used to check there is a values is available or not in the next
		//next() is used to print the values
		
		Iterator<String> newnames =  names.iterator();
      while(newnames.hasNext())
	  {
		String n = newnames.next();
        String newvariable = "Hello, Welcome "+n;
        System.out.println(newvariable);	
		  
	  }	
		
		
		
		
	}
	
	
}