package Practise;
import java.util.Scanner;
public class RemoveWhitespace {
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string that you want to remove white spaces");
	String str=sc.nextLine();//String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
                        //built in method to remove white space//trim() removes end and
                        //begining white space	
	char chararray[]=str.toCharArray();
	String stringwithoutspace=" ";
	for(int i=0;i<chararray.length;i++) {
		if((chararray[i]!=' ')&&(chararray[i]!='\t')) {
			stringwithoutspace= stringwithoutspace+chararray[i];
		}

	}
	System.out.println("inputsring without space= "+stringwithoutspace);
	sc.close();
	}		
	
}
