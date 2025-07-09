import java.io.*;
class p20Input_Output3
{
	public static void main(String args[]) throws Exception
	{
		
		//Read input for a string
	    //connecting keyboard to inputstream
		
		InputStreamReader i = new InputStreamReader(System.in);
		
		//Connecting InputStream to BufferedReader
		BufferedReader r = new BufferedReader(i);
		
		String name = r.readLine();
		
		System.out.println("Hello "+name+", Welcome Java Program");
		
		
		
	}
}