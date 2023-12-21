
package fileoperations;
// 3rd part library, external lib, external dependancies, external jar
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperationTest {
	 public void readTextFromFileUSingInputStream() {
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
	 
	 public void readTextFromFileUSingInputStream1() throws IOException {
		 File myfile=new File("C:\\Users\\shiga\\java-workspace\\JavaBasics\\Data\\Mydata.txt"); // or single /
		 FileInputStream fis=new FileInputStream(myfile);
			int ch;
			while((ch=fis.read())!=-1) {
				System.out.print((char)ch);
			}
			fis.close();
		
		 
		 
	 }
	 
	 public void writeDataFileUsingOutputStream() throws IOException {
		String curDirPath= System.getProperty("user.dir");
		File myfile=new File(curDirPath+"\\Data\\mynewfile.txt");
		FileOutputStream fos=new FileOutputStream(myfile);
		String data="i am writing hhjhgc chjcgfhj \n fjhgzfshdjg";
		char[] chardata= data.toCharArray();
		for(char c:chardata) {
			fos.write(c);
		}
		fos.close();
		System.out.println("completed");
	 }
	 
	 public void readDataFromFileUSingReader() throws IOException {
		 File myfile=new File(System.getProperty("user.dir")+"/Data/mynewfile.txt");
		 FileReader fr=new FileReader(myfile);
		 int ch;
		 while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
			}
		 
		 fr.close();
	 }
	 
	 public void writeFileByFileWriter() throws IOException {
		 File myfile=new File(System.getProperty("user.dir")+"/Data/mynew.txt");
		 FileWriter fw=new FileWriter(myfile);
		 fw.write("i am writing stright");
		 fw.close();
	 }
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOperationTest ob=new FileOperationTest();
		//ob.readTextFromFileUSingInputStream();
		ob.writeDataFileUsingOutputStream();
		//ob.readDataFromFileUSingReader();
		//ob.writeFileByFileWriter();
		
		
	}}