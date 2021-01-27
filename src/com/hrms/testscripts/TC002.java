package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.general;

public class TC002 {

	@Test		
	public void tc002() throws Exception {	
    DOMConfigurator.configure("log4j.xml");
	general obj = new general();
	obj.openapplication();
	obj.login();
	obj.addemp();
	obj.logout();
	obj.closeappication();
}
}
