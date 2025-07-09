import java.util.*;
class p94HashMap
{
   public static void main(String ar[])
   {
	   HashMap<String, String> map = new HashMap <String, String>();
        
		System.out.println("Is Hashmap empty? "+map.isEmpty());
		
		map.put("fl","Telugu");
		map.put("sl","English");
		map.put("tl","Hindi");
		
		System.out.println("Is Hashmap empty after map.put()? "+map.isEmpty());

       if(map.isEmpty())
	   {
		   System.out.println("Hashmap is empty");
	   }
	   
	   else
	   {
		   System.out.println("Size of Hashmap is: "+ map.size());
	   }
	   
	   System.out.println("keySet() : "+map.keySet());
	   
	   System.out.println("Values are : "+map.values());
	   
	   System.out.println("Key and values using entrySet : "+map.entrySet());
	   
	   System.out.println("Value of key fl is : "+map.get("fl"));
	   
	   System.out.println("containsKey(fl) "+map.containsKey("fl"));
	   
	   	   System.out.println("containsValue(English) : "+map.containsValue("English"));

   
   
	   
	   
	   
   }
	
	
}