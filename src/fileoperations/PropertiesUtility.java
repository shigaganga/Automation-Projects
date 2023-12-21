package fileoperations;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertiesUtility {
		
		
		public static String readDataFromPropertyFile(String path,String key) {
			File file=new File(path);
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
			
			String data=propFile.getProperty(key,"b.gmail.com");
			try {
				fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return data;
		}
		
		
		public static void writeDataToPropertyFile(String path,String key,String value) {
			Properties propFile=new Properties();
			propFile.setProperty(key, value);
			FileOutputStream fo=null;
			File file=new File(path);
			try {
				fo=new FileOutputStream(file);
				propFile.store(fo,"adding new property with value");
				fo.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public static int getSize(String path) {
			File file=new File(path);
			FileInputStream fi=null;
			Properties propFile=new Properties();
			int size=0;
			
			try {
				fi=new FileInputStream(file);
				propFile.load(fi);
				size=propFile.size();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return size;
		}


}