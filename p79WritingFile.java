import java.io.*;
class p79WritingFile{
	public static void main(String args[]) throws Exception{
		
	//opening file
    //If there is no given file Like p79WritingFile.txt it will create new file
    	
		
	FileWriter fw = new FileWriter("p79WritingFile.txt");
     
	fw.write((int)'v'); 
	//fw.write only write single character
    //We should  ASCII value of character
	//so we Converted to 'v' to its ASCII value by using (int) conversion
	fw.close();
	
 		
	}
	
}