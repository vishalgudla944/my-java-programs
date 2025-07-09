import java.io.*;
class p76Files{
	
	public static void main(String args[]){
		
		
		
		File f = new File("vis.txt");
	
		System.out.println("exists(): "+f.exists());
		
		if(f.exists() == true)
		{
		System.out.println("canRead(): "+f.canRead());
		System.out.println("canWrite(): "+f.canWrite());
		System.out.println("lastModified(): "+f.lastModified());
		f.delete();
		System.out.println("exists(): "+f.exists());
		
		}
		
	}
}