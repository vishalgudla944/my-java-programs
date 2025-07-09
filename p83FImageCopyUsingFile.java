import java.io.*;
class p83FImageCopyUsingFile{
	public  static void main(String args[]) throws Exception{
      
      //open pic.jpg  file in readmode	  
      FileInputStream fis = new FileInputStream("pic.jpg");
      
	  //open a new file with write mode
     FileOutputStream fos = new FileOutputStream("pic_copy.jpg");
     
     //perform copy operation
      
      int ch;
      while((ch=fis.read())!= -1){
		  
		  fos.write(ch);
	  }	 

 //close streams	  
 	 fis.close();
	 fos.close();
	 
		
	}
}