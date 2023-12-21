package fileoperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File(System.getProperty("user.dir")+"/data/data.properties");
		FileInputStream fi=null;
		Properties propFile=new Properties();
		
		try {
			fi=new FileInputStream(file);
			propFile.load(fi);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String data=propFile.getProperty("data.username1","b.gmail.com");
		System.out.println(data);
		propFile.setProperty("age", "10");
		FileOutputStream fo=null;
		try {
			fo=new FileOutputStream(file);
		
			propFile.store(fo,"adding new property with value");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fi.close();
			fo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("num of proprties="+propFile.size());
		
		
		

	}

}