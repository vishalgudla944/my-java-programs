import java.util.*;
class p92ArrayList
{
	
	public static void main(String ar[])
	{
		
		ArrayList list = new ArrayList();
		list.add("Vishal");
		list.add("Ramesh");
		list.add(0,"Siddhu");
		list.add(1,"Suresh");
		
		System.out.println(list);
		
		System.out.println("Is list contains Suresh? "+list.contains("Suresh"));
	
		System.out.println("Elemet at index 3  is: "+list.get(3));
		
		//retriving and applying operation using listIterator
		
		listIterator li = list.listIterator();
		while(li.hasNext())
		{
			String s = li.next();
			
			System.out.println("Hello "+s+" Welcome to the class");
			
		}		
		
	}
	
}