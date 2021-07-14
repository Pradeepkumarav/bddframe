package com.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {
WebDriver driver;
@Given("User is on Home Page")
public void user_is_on_Home_Page() {
	System.setProperty("webdriver.chrome.driver","C:\\selenium file\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.navigate().to("http://demowebshop.tricentis.com/"); 
    System.out.println("user_is_on_Home_Page");
}

@When("User Navigate to LogIn Page")
public void user_Navigate_to_LogIn_Page() {
	 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	  System.out.println("user_Navigate_to_LogIn_Page");
}

@When("User enters UserName and Password")
public void user_enters_UserName_and_Password() {
	driver.findElement(By.name("Email")).sendKeys("pradeep7725@gmail.com");
	  driver.findElement(By.name("Password")).sendKeys("pradeep@123");
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	  System.out.println("user_enters_UserName_and_Password");
}
@Then("Message displayed Login Successfully")
public void message_displayed_Login_Successfully() {
	  System.out.println("message_displayed_Login_Successfully");
}

@When("User Logout from the Application")
public void user_Logout_from_the_Application() {
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	  System.out.println("user_Logout_from_the_Application");
}

@Then("Message displayed Logout Successfully")
public void message_displayed_Logout_Successfully() {
	  System.out.println("message_displayed_Logout_Successfully");
}
}
