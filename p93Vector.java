import java.util.*;
class p93Vector
{
	public static void main(String ar[])
	{
		
		Vector<String> list = new Vector<String>(5,3);
		
		//It will dynamically grow its capacity 
		//after it reached to 5, it increase 5+3 = 8;
		//after reached to 8, it will increase 8+3 = 11; so on..
		
		System.out.println("List capacity: "+list.capacity());
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
	
		System.out.println("List capacity after 5 elements: "+list.capacity());
		
		list.add("f");
		
		System.out.println("List capacity after inserting 6th element: "+list.capacity());
		System.out.println("  -->Dynamically Increased its capacity<--  ");
		
		System.out.println("First Element: "+list.firstElement() );
		System.out.println("First Element: "+list.lastElement() );
		
		Enumeration<String> en = list.elements();
		while(en.hasMoreElements())
		{
			System.out.println("Hello " + en.nextElement());
			
		}
		System.out.println(list);
		
	}
	
	
}