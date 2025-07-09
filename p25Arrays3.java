import java.io.*;
import java.util.*;
class p25Arrays3{
	
	public static void main(String args[]) throws Exception
	{
		
		int arr[] = new int[5],i;
		
		for(i=0;i<5;i++){
			System.out.println("Enter value for index "+i+":");
			Scanner k = new Scanner(System.in);
			arr[i] = k.nextInt();
			
			}
			
			for(i=0;i<5;i++){
				
				System.out.println("Index is: "+i+" Value is: "+arr[i]);
			}
		
		
		
	}
	
}