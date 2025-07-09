import java.io.*;
class p82WritingFileUsingByteStream{
	
	public static void main(String args[])throws Exception{
		FileOutputStream fos = new FileOutputStream("p82WritingFileUsingByteStream.txt");
		
		fos.write((int)'h');
		
		fos.close();
	}
}