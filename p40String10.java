class p40String10{
	public static void main(String args[]){
		
		String s1 = "Welcome My name is JAVA";
		
		//Substring Helps to print the specific substring in the string.
		//s1.substring(5) Means it will print the characters from the 5th index to the last.
		//For example the S1 is 'Welcome My name is JAVA' so it will take the 5th index means 'm'.
		
		System.out.println("Original String: "+s1);
		System.out.println("Output of s1.substring(5): "+s1.substring(5));
		
        //There is another way to print the substring from a specific range.
        //Like  s1.substring(5,12) here 5,12 are example range we can write anything within the Range of the String
        //It will print the characters from the 5th index position and until before 12th index exposition.
		//H Here initial range is inclusive and last range exclusive means 5 is inclusive, 12 is exclusive. 
        //Means Means from index (5 to 12 - 1)
        
		System.out.println("Output of s1.substring(5,12): "+s1.substring(5,12));
  		
		 
		
		
		
		
		
	}
	
	
}