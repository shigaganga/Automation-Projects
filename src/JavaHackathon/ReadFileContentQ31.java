//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
package JavaHackathon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileContentQ31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File myfile=new File("C:\\Users\\shiga\\java-workspace\\JavaBasics\\Data\\Mydata.txt"); // or single /
		 FileInputStream fis=null;
		 try {
			fis=new FileInputStream(myfile);
			int ch;
			
			while((ch=fis.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
		 
	 }
	 

	}


