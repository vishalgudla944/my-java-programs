import java.io.*;

class p80WritingFile2{
	public static void main(String args[]) throws Exception{
		

	FileWriter fw =  new FileWriter("p80WritingFile2.txt",true);
	
	//true helps to write info in append mode
	//Means previosly written data won't delete
	//if we don't write true in FileWriter fw =  new FileWriter("p80WritingFile2.txt",true);
    //previosly witten text will be deleted only newly written text will bo shown.
	
	BufferedWriter bw = new BufferedWriter(fw);
	
	//Writer using Character array
	
	char c[] = {'w','e', 'l', 'c', 'o', 'm', 'e' };
	 
	//Synatx--> 	write(char[] cbuf, int off, int len)
	
   bw.write(c,3,4) ;
   
    //3 is offset means, from where to start writing, 4 is length means upto how many character should write
   //now write the characters using string
   String s =" Ganesh";
   bw.write(s,0,s.length());
   bw.close();
   fw.close();
   
	
		
	}
}