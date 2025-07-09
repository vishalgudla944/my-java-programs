class p42String12{
	public static void main(String args[]){
		String s1 = "    Hello World     ";
 		
		//Lets Remove the Spaces at the Beginning and End using trim()
		//It cannot remove spaces between the characters 
		//Becasue every space is considered as a character which present b/w characters of a String.
        
		System.out.println("Orginal String:"+s1); 		
		System.out.println("s1.trim Result is:"+s1.trim());
	}
	
	
}