class p46StringBuffer1{
	public static void main(String args[]){
		
		StringBuffer str = new StringBuffer();
		
		System.out.println("StringBuffer value: "+str);
		System.out.println("HashCode is: "+str.hashCode());
		
		//append
		
		str.append(10);
		
		System.out.println("StringBuffer value: "+str);
		System.out.println("HashCode is: "+str.hashCode());
		
		str.append("HELLO");
		
		System.out.println("StringBuffer value: "+str);
		
		
		//insert
		
		str.insert(1,"XNX"); //1 means Index , "X" means Value to be changed
		System.out.println("StringBuffer value: "+str);
		
		
		//delete
		
		str.delete(1,4);
		System.out.println("StringBuffer value: "+str);
	  
	  //String toString() helps to convert StringBuffer to normal String
	 
	  //Finding_Length
	  
	  System.out.println("StringBuffer Length is: "+str.length());
	  
	  //IndexOf

      System.out.println("IndexOf: "+str.indexOf("L"));	
	  
	  //lastIndexOf
	  
	  System.out.println("IndexOf: "+str.lastIndexOf("L"));	
		
	//reverse
	 
	  System.out.println("Reverse: "+str.reverse());

   //replace
         
	 System.out.println("Replace: "+str.replace(1,5,"OOOO"));
		
	}
	
	
}