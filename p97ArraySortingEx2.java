import java.util.*;
class p97ArraySortingEx2
{
	public static void main(String ar[])
	{
		
		int marks[] = {99,68,67,37,42,38};
		int marks1[] = {99,68,67,37,42,38};
		int marks2[] = {99,68,67,37,42,38};

		
		System.out.println("Before sorting: ");
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+"\t");
			
		}
		
		Arrays.sort(marks);
		
		System.out.println("\nAfter sorting: ");

		
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(marks[i]+"\t");
			
		}
		
		
		//Findig a values index
		System.out.println("\n67 is found at index: "+Arrays.binarySearch(marks,67));
		
		//we get negitive values if element is not there in array
		
		System.out.println("1 is found at index: "+Arrays.binarySearch(marks,12));

		//Findig equals 
		System.out.println("marks == marks1: "+Arrays.equals(marks,marks1));
		
		//It will get false because we sorted marks[] array
		//lets check with marks1 and marks2
		
				System.out.println("marks2 == marks1: "+Arrays.equals(marks2,marks1));

		
		
		
		
		
	}
}