package com.automation.tests.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jUtility {
	private Logger myLog=null;
	private static Log4jUtility ob=null;
	
	
	private Log4jUtility() {
		
	}
	
	public static Log4jUtility getInstance() {
		if(ob==null) {
			ob=new Log4jUtility();
		}
		return ob;
	}
	
	public Logger getLogger() {
		if(myLog==null)
			myLog=LogManager.getLogger(Log4jUtility.class);
		
		return myLog;
	}
	

}
