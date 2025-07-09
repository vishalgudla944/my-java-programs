import java.io.*;

class p81ReadingFileUsingByteStream{
	public static void main(String args[]) throws Exception{
	FileInputStream fis = new FileInputStream("p81ReadingFileUsingByteStream.txt");
	   // TO PRINT SINGLE CHAR System.out.print((char)fis.read());
	int c;
	while ((c=fis.read())!= -1){
		
		System.out.print((char)c);
	}
	   
	   
	}
}