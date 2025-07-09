class p35String6{
	
	public static void main(String args[]){
		
		String s1 = "Hello My Name is Vishal";
		String s2 = "hello my name is vishal";

		System.out.println("Both strings are Equal?(Consider Case Senstivity) --> "+s1.equals(s2));
		// Now,Checking Equal or not by using equalsIgnoreCase
		//It Does not consider weather it is upper or lower
		//It only Consider the characters
	
     	System.out.println("Both strings are Equal? (Don't Consider Case Senstivity) --> "+s1.equalsIgnoreCase(s2));
		
		//NOTE: Like comparing Integers with '==' is not possible in Strings
		//Becasue while comparing two String with '=='
		//It will Compare the memory Locations of Strings not the Actual Characters.
		
	}
	
	
	
}