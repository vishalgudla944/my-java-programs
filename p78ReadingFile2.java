import java.io.*;
class p78ReadingFile2{
	public static void main(String args[])throws Exception{
		
		//reading file using FileReader
		
		FileReader fr = new FileReader("p78ReadingFile2.txt");
		
		//printing file contents using BufferedReader 
		
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		
		while ((s = br.readLine())!= null){
			
			System.out.println(s);
		}
		
		
	}
	
	
}