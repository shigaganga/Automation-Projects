package Practise;
import java.util.Scanner;
public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string that you want to find the duplicates");
String str=sc.nextLine();
char chararray[]=str.toCharArray();
int count=0;
for(int i=0;i<chararray.length;i++) {
	for(int j=1;j<(chararray.length-1);j++) {
		if(chararray[i]==chararray[j]) {
			System.out.println(chararray[i]+"has duplicates");
			count=count+1;
			
		}
		System.out.println(chararray[i]+"has"+count+" duplicates");
		
}}

sc.close();
	}

}
