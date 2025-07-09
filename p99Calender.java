import java.util.*;
class p99Calender
{
	public static void main(String ar[])
	{
		
	   Calendar cal = Calendar.getInstance();
	   
	   //Here we did not used new to create Calendar obj
	   //Becase It is Abstract Class
	   
	  System.out.println(cal);
	   System.out.println(cal.getTime());
	     System.out.println(cal.getTimeZone());
		  System.out.println(cal.getTimeZone().getID());
	        System.out.println("YEAR: "+ cal.get(Calendar.YEAR));
			 System.out.println("DAY_OF_WEEK_IN_MONTH: "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));

			   
			   cal.set(2025, 07, 13);
			  System.out.println(cal.getTime());
	   
	   
		
		
		
	}
	
	
	
}