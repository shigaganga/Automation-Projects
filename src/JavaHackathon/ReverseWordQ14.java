//Q14. Given a string print the reverse of the words string.(Input:  Java Code Output: Code Java)
package JavaHackathon;

import java.util.Scanner;

public class ReverseWordQ14 {

	public static void main(String[] args) {
		reverse();// TODO Auto-generated method stub

	}
public static void reverse() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	String[] words=str.split("\\s");
	String reverseStr="";
for(int i=words.length-1;i>=0;i--) {
	reverseStr=reverseStr+words[i]+" ";
			
}
System.out.println(reverseStr);
}
}
