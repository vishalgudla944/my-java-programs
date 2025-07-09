//retriving values using for each loop
import java.util.*;
class p88HashSet2
{
	
	public static void main(String args[]){
	HashSet<String> names = new HashSet<String>();
	
	names.add("Vishal");
	names.add("Ramesh");
	names.add("Siddhu");
	names.add("Sanjay");
	
	//Printing values by using object
	System.out.println(names);
	
	//Printing values using for each loop 
	//for each helps to perform actions on the values
	//Synatax is for(datatype variable: object name)
    
    
    for(String v : names ){
		
		String newvariable = "Welcome "+v;
		System.out.println(newvariable);
	}
	
	// Everey Value in names is temporarly stored in values for iteration.
	//Now we can perform different operations on each value.
	
	}
	
	
	
}