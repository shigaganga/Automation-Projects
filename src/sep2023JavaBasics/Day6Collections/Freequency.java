package sep2023JavaBasics.Day6Collections;

public class Freequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static void stringFreequency() {
	port java.util.HashMap;

	public class FindFrequencyExample3{
		
	    public static void main(String args[])
	    {
		    // given string
		    String str = "java program";
			
		    // hashmap to store the frequency of each character.
		    // here, characters are stored as key and frequency as value.
		    HashMap<Character,Integer> map = new HashMap<>();
			
		    // traverse through each character in the string
		    for(int i= 0 ; i< str.length() ; i++) 
		    {
		    	  // store each character in ch
		         Character ch=str.charAt(i);
		         
	                 // if ch is not equal to ' '
		         if(ch != ' ') 
		         {
		        	 //check whether the hashmap contains the character or not
		        	 // if the character is already present in the hashmap
		        	 if(map.containsKey(ch)) 
			         {
		        	    // fetch the character's frequency
			            int count = map.get(ch);
			            // increase the count by 1 and update it.
			            map.put(ch,count+1);
			         } 
		        	 // if the character is not present in the hashmap
			         else 
			         {
			        	 // set its frequency to 1.
			        	 map.put(ch,1);
			         }
		         }
		         
		    }

	            System.out.println("Given string = " + str);

		    // print the character along with its frequency
		    // in the same order as the characters appear in the string.
		    for(int i = 0; i < str.length(); i++)
	            {           
	                   // Print only if the character is not printed before
	                   // and ignore the spaces.
	                   if(str.charAt(i) != ' ' && map.get(str.charAt(i)) != -1)
	                   {
	                        // print the character and frequency
	                        System.out.println(str.charAt(i) + " - " + map.get(str.charAt(i)));
	                        // set value to -1 to avoid printing visited characters
	                        map.put(str.charAt(i), -1);
	                   }           
	            }		
	    }
	}

}
}
