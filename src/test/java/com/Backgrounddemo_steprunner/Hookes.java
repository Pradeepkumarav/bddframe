package com.Backgrounddemo_steprunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookes {
	public static WebDriver driver;
	 @Before
	    public void beforeScenario(){
		 System.setProperty("webdriver.chrome.driver","C:\\selenium file\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.navigate().to("http://demowebshop.tricentis.com/"); 
	      System.out.println("start opening browser");
	    } 
	 
	 @After
	    public void afterScenario(){
	        System.out.println("closing the browser");
	    }

}
