package sep2023JavaBasics.Day5;

public class EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

public class EvenNumberException {
 

public static class OddNumberException extends Exception {
 
 public OddNumberException (String message) {
  super(message);
}
}
 
public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  Scanner a = new Scanner(System.in);
  
  while (true)
  try {
      System.out.println("Enter an even number:");

   int inputnumber = a.nextInt();
   
   if (inputnumber % 2 != 0) {
    throw new OddNumberException("You entered an odd number. Please enter even number."); 
   }
   else {
    System.out.println("Number is even");
    break;
   }
    
   
   } catch (OddNumberException e) {
    System.out.println(e.getMessage());
    System.out.println();
   }
  } 
  
  
 }

	}

}
