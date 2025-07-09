class p43String13{
	public static void main(String args[]){
		
		
       String s1 = "Hello guy welcome to our class";
	   
	   //Lets split the given string according to delimiter
	   //delimiter means A specific charater or space
	   //It will trim According to given delimiter
	   
	   String res[] = s1.split(" "); 
	   
	   //here delimiter is space " " 
	   //SO, it will split for every space
       //we can also use specific character like 'e'
	   //It will splict accodring to the given character
	   
	   System.out.println("Length of res[] is:"+res.length);
	   
	   //Stores Every splitted substring in String res array
	   
	   for(int i=0;i<res.length;i++){
		   
		   System.out.println(res[i]);
	   }
	   
	   
	   
		
		
	}
	
	
}