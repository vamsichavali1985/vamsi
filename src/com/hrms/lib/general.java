package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import com.hrms.utility.Log;
public class general extends Global {
	
	public void openapplication() {
	     System.setProperty("webdriver.gecko.driver","F:\\Testing 2020\\Browser Drivers\\geckodriver-v0.28.0-win64\\geckodriver.exe");
	     driver = new FirefoxDriver();
	     driver.navigate().to(url);
	     System.out.println("Application is opened");
	     Log.info("Application is opened");
	     Reporter.log("Application opened");
    	 }         
	public void closeappication() {
	     driver.close();
	     System.out.println("Application is closed");
	     Log.info("Application is closed");
	     Reporter.log("Application closed");
		 }
    public void login() throws Exception {
    	 driver.findElement(By.name(txt_loginname)).sendKeys(un);
    	 driver.findElement(By.name(txt_password)).sendKeys(pw);
    	 driver.findElement(By.name(btn_login)).click();
    	 System.out.println("login completed");
    	 Thread.sleep(4000);
    	 Log.info("login completed");
	     Reporter.log("login completed");
         }
    public void logout() throws InterruptedException {
    	 driver.findElement(By.linkText("Logout")).click();
    	 System.out.println("logout completed");
    	 Thread.sleep(3000);
    	 Log.info("logout completed");
	     Reporter.log("logout completed");
         }
    public void addemp() throws InterruptedException {
    	 driver.switchTo().frame("rightMenu");
    	 driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//*[@name='txtEmpLastName']")).sendKeys("nanda");
    	 driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("kumar");
    	 driver.findElement(By.xpath("//*[@name='txtEmpMiddleName']")).sendKeys("gopal");
    	 driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
    	 Thread.sleep(2000L);
    	 System.out.println("New Employee Added");
    	 Log.info("New Employee Added");
	     Reporter.log("New Employee Added");
    	 driver.switchTo().defaultContent();
         }
    public void delemp() throws InterruptedException {
    	driver.switchTo().frame("rightMenu");
    	driver.findElement(By.name("chkLocID[]")).click();
    	Thread.sleep(9000);    	
    	driver.findElement(By.xpath("//*[@id='standardView']/div[4]/div[1]/input[2]")).click();
        Thread.sleep(2000L);
   	    System.out.println("Employee Deleted");
   	    Log.info("Employee Deleted");
	    Reporter.log("Employee Deleted");
   	    driver.switchTo().defaultContent();
   	    }
}










