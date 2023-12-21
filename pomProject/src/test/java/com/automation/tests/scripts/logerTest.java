package com.automation.tests.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger myLog=LogManager.getLogger(logerTest.class);
		myLog.info("browser has been lanched");
		myLog.warn("printing warning meassages");
		myLog.debug("printing debug messages");
		myLog.error("printing error");
		myLog.fatal("priting fatal messages");
		myLog.info("completed");

	}

}