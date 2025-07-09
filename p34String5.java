class p34String5{
	public static void main(String args[]){
		
		String s1 = "Hello My Name is Vishal";
		String s2 = "hello my name is vishal";
		System.out.println("Comparision is:"+s1.compareTo(s2));
		
		/* 
    We know
   If OUTPUT is:0 then Strings are Equal.
   If OUTPUT is +ve the String1 > String2.
   If OUTPUT is -ve the String1 < String2.
   Here we got s1<s2 Because of it's Alphabet case
   lets compare without case.
		*/
		
     System.out.println("Comparision By Ignoring Alphabet CASE:"+s1.compareToIgnoreCase(s2));
	 
	 //Now we can understad how compareToIgnoreCase works
	 //It Don't Consider weather its Upper or Lower case its only compare the letters
	 //And Print the result.
		
	}
}