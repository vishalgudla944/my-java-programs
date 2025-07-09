import java.io.*;
class p26Arrays4{
	
	public static void main(String args[]) throws Exception
	 {
		
		int arr[]=new int[5],i;
		
		InputStreamReader a = new InputStreamReader(System.in);

        BufferedReader b = new BufferedReader(a);
		
		for(i=0;i<5;i++)
		{
            
			 arr[i] = Integer.parseInt(b.readLine());
			
		  
		}
		for(i=0;i<5;i++){
			
				System.out.println("Index is: "+i+" Value is: "+arr[i]);
		
		}
		
		
		
	}
	
	
}



