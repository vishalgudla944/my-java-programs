import java.io.*;
import java.util.*;
class p22Input_Output5
{
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		
		int firstnum = s.nextInt();
		
		System.out.println("Enter Second Number:");

        int secondnum = s.nextInt();
		
	    int result = firstnum + secondnum;
		
		System.out.println("Addition is:"+result);
		
		
	}
}