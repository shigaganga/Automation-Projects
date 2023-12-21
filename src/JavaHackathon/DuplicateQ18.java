//Q18. WJP to display duplicate character in string

package JavaHackathon;

import java.util.Scanner;

public class DuplicateQ18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
duplicate();
	}
	public static void duplicate() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		char[] array=str.toCharArray();
		System.out.println("The duplicates elements are");
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println(array[j]);		
			break;
				}
			}
		}
	}

}
