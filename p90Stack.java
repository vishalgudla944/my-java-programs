//program to implement stack in java

import java.util.*;
class p90Stack
{
	public static void main(String ar[])
	{
		
		Stack<Integer> marks = new Stack<Integer>();
		
		marks.push(98);
		marks.push(85);
		marks.push(92);
		marks.push(77);
		marks.push(65);
		
		//stack follows Ones oreder
		//Means it will start index from 1 and counts from Last Element
		System.out.println("Initial stack values: " + marks);
		
		if(marks.empty())
            System.out.println("Stack is empty");
       else
            System.out.println("Top Element is: "+ marks.peek());
        
        System.out.println("Element 85 is present is: "+marks.search(85));
  
        
        marks.pop();
		System.out.println("After pop values: " + marks);
 		
	 System.out.println("Top Element after pop is: "+ marks.peek());
	 
	 
		
	}
	
	
}