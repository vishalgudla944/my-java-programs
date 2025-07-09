//program to implement syncronization in thread

class tickentbooking
{
	boolean booked = false;
	
	//public synchronized void bookticket(String name)
	//We can write like above to apply syncronization to whole method
	
	//now we syncronizing some block code whic present in the method
		public  void bookticket(String name)

	{
		synchronized(this)
		{
		if(booked == false)
	{
		System.out.println(name+" selected the seat");
		
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e){}
		
		System.out.println(name+" Completed the paymet");
		
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e){}
		
		System.out.println(name+" get ticket");
        
		booked = true;
		
	}
	else
	{
		System.out.println("Sorry "+name+" This seat is already booked");
	}
	
	}
	
	try
		{
			Thread.sleep(1000);
		}
		catch (Exception e){}
	
	System.out.println(name+" booked bus ticket");
	
	}
	
}


class threadclass extends Thread
{
	
	tickentbooking tkt;
	String name;
	
	threadclass(tickentbooking obj,String s)
	{
		tkt = obj;
		name = s;
		
	}
	public void run()
	{
		
		tkt.bookticket(name);
		
	}
	
	
}


class p10MultiThreading8
{
	public static void main(String ar[])
	{
		
		tickentbooking seat7 = new tickentbooking();
		
		threadclass santosh = new threadclass(seat7,"santosh");
		
		Thread san = new Thread (santosh);
		san.start();
		
		

		
		threadclass suresh = new threadclass(seat7,"suresh");
		
		Thread sur = new Thread (suresh);
		sur.start();
		
		
		
	}
	
}