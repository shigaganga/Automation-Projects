//Q15. Given a string print the unique words of the string.

package JavaHackathon;

import java.util.Scanner;

public class UniqueQ15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UniqueWord();
	}
public static void UniqueWord() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	String[] words=str.split("\\W");
	int count;
	System.out.println("unique words are: ");
	for(int i=0;i<words.length;i++) {
		count = 1;
		for(int j=i+1;j<words.length;j++) {
			if(words[i].equalsIgnoreCase(words[j])) {
				count++;
				words[j]="";//no need to print
			}
		}
		if(count==1) {
			System.out.println(words[i]);
	}
	}}}

