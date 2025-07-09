import java.io.*;

class p21Input_Output4
{
	public static void main(String args[]) throws Exception
	{
		
		InputStreamReader a = new InputStreamReader(System.in);
		
		BufferedReader b = new BufferedReader(a);
		
		System.out.println("Enter First Number:");
		
		int firstnum =  Integer.parseInt (b.readLine());
	
		System.out.println("Enter Second Number:");
		
		int secondnum =  Integer.parseInt ( b.readLine());
		 
		int result=firstnum+secondnum;
		
		System.out.println("Result is :"+result);
	}
}