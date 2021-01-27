package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.general;

public class TC001 {
	//public static void main ( String args[]) {
		@Test		
		public void tc001() throws Exception {	
	    DOMConfigurator.configure("log4j.xml");
		general obj = new general();
		obj.openapplication();
		obj.login();
		obj.logout();
		obj.closeappication();
		}
}
