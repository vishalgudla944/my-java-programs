import java.io.*;
class p77ReadingFile{
	public static void main(String args[]) throws Exception {
		
		//open file
		FileReader fr = new FileReader("p77ReadingFile.txt"); 
		//here we can create any txt file with any name, i've gave p77ReadingFile.txt for my clarity
		//Not mandatory to have program name to txt file  
		int ch; 
		
		
		//printing charaters in the file 
		while((ch = fr.read()) != -1 )
		{
			System.out.print((char)ch);

		}
	}
		
	