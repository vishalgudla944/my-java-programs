import java.util.*;
class p96ArraySortingEx
{
	public static void main(String ar[])
	{
		int marks[] = {99,68,67,37,42,38};
		System.out.println("Before Sorting:");
		for(int i=0; i<marks.length;i++)
		{
			System.out.print(marks[i]+"\t");
		}	
		
		
	   Arrays.sort(marks);
	   
	   //we can also give --> Arrays.sort(marks,2,5)
	   //Which sort the array from index 2 to 5
		
		System.out.println("\nAfter Sorting:");
		for(int i=0; i<marks.length;i++)
		{
			System.out.print(marks[i]+"\t");
		}
		
		
		
	}
}