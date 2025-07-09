import java.io.*;
class p19Input_Output2
{
	public static void main(String args[] ) throws Exception
	{
		//connecting keyboard to inputstream
		InputStreamReader i = new InputStreamReader(Sys  tem.in);
		
		//Connecting InputStream to BufferedReader
		
		BufferedReader b = new BufferedReader(i);
		
		//reading Single Character
		System.out.println("Enter Any Character:");
		
		
		char c = (char) b.read();
		
        System.out.println("Enterd charater is:"+c);

        //we can also write like this
		//System.out.println("Enterd charater is:"+ (char) b.read());

		
		
	}
}