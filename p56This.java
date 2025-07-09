class Example{
	
	String channel;
	Example(){
		
		channel = "telugu web guru";
		
	}
	Example(String channel){
		 
		 //Here parametric String name also channel
		 //so, below channel = channel take nearst channel value
		 //the nearst channel  available is in parameter
         //its value is NULL so output become null
         //Because of this 'INSTANCE VARIABLE HIDING' happend
         //to overcome this situation we use 'this' keyword
         //which represent current object varibles or insatnce varible 		 
		 
	   	
		   this.channel = channel; //here this.channel --> String channel and channel --> Example (String channel)
		
	}
	
	
}


class p56This{
	public static void main(String args[]){
		
		Example e = new Example();
		System.out.println("Channel value in object e is "+e.channel);
		
		Example e2 = new Example("Siddhu");
		System.out.println("Channel value in object e is "+e2.channel);
	}
	
}