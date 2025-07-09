import java.util.*;
class p98StringTokenizer
{
	
	public static void main(String ar[])
	{
	String s = "Hello guys, Welcome to java class";
	StringTokenizer st = new StringTokenizer(s);
	System.out.println("Token Count: "+st.countTokens());
	
    // nextElement return object
	
	/*
	while(st.hasMoreElements())
	{
		 System.out.println(st.nextElement() + "$");
		
	}
	
		*/
		
			
	//nextToken returs String
	
	while( st.hasMoreTokens())
	{
		
		
		 System.out.println(st.nextToken() + "#");
		
	}
	}
	
	

	
}