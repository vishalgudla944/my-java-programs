class p75CmdLnArgmnts2{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("addition of args[0]+args[1] is: "+ (a+b) );
		
		//If we don't int a = Integer.parseInt(args[0]); and
		//int b = Integer.parseInt (args[1]); 
		//we get cocatnation of two number if enetred are 10,20 Output is: 1020

	}
}