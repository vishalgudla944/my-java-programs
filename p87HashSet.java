import java.util.*;
class p87HashSet
{
	public static void main(String args[])
	{
	
	HashSet <String> names = new HashSet<String>();
	
	System.out.println("names.isEmpty():"+names.isEmpty());
	
	names.add("Vishal");
	names.add("Depressed");
	
	
	if (names.isEmpty())
		System.out.println("HashSet is Empty");
	
	else 
		System.out.println("HashSet Size is: "+names.size());
	
		
    if(names.contains("Depressed"))
	{
		names.remove("Depressed");
	}
			
	System.out.println("updated HashSet Size is: "+names.size());
	
	names.clear();
	
   	System.out.println("After name.clear() HashSet Size is: "+names.size());
	

	
		
		
		
	}
	
}
	
