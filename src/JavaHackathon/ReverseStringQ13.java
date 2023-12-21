//Q13. Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)
package JavaHackathon;

public class ReverseStringQ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReverseStringQ13 obj=new ReverseStringQ13();
obj.reverse();
		
	}
	public void reverse() {
		String str="Java code output";
		System.out.println("Given string is: "+str);
		//String str1=str.replaceAll("\\s", "");
		//System.out.println(str1);//replace all white spaces
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String is: "+rev);
	}

}
