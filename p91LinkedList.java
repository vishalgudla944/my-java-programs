import java.util.*;
class p91LinkedList
{
public static void main(String ar[])
{
	
	
	LinkedList<String> list = new LinkedList<String>();
	 
	//It follows 0 indexing elements index starts from 0 
	list.add("Ramesh");
	list.add("Suresh");
	list.add(1,"Sateesh"); 
	//Value will changed to index 1 But because of below oprations It will change it index position
	//If we remove below opration we will get exact output
	
	System.out.println(list);
	
	list.addLast("Rajesh");
	list.addFirst("Vishal");
	
	System.out.println(list);
	
	System.out.println("Is list contains Suresh? "+ list.contains("Suresh"));
	
	System.out.println("First element by using getFirst(): "+ list.getFirst());
	System.out.println("Last element by using getLast(): "+ list.getLast());
	System.out.println("Elemet at index 1 by using get(1): "+list.get(1));
	System.out.println("Size of list by using size(): "+list.size());
	
	
	//retriving data using for each loop and performing some operations
			System.out.println("\nUsing for each loop:");

	for (String n : list)
	{
		System.out.println("Hello "+ n + ", Welcome to Java Class");
		
	}
	
	
	System.out.println("\nlist is : "+list);
	
	System.out.println("\nAfter remove() --> It will remove Head Element means 'Vishal' ");
	list.remove();
	System.out.println(list);
	
	System.out.println("\nAfter remove(2) --> It will remove Element at index 2 means 'Suresh' ");
	list.remove(2);
	
    System.out.println(list);
}
	
	
	
}