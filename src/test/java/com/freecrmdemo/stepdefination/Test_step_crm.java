package com.freecrmdemo.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_step_crm {
	 static WebDriver driver;
	 By username =By.name("email");
	 By possword =By.name("password");
	 By Login =By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]");
//	@FindBy(how=How.NAME,using="email")
//	WebElement username;
//	
//	@FindBy(name="password")
//	WebElement password;
//	
//	@FindBy(xpath="//*[@id=\\\"ui\\\"]/div/div/form/div/div[3]")
//	WebElement clickbutton;
//	
	


@Given("user navigates to testmeapp")
public void user_navigates_to_testmeapp() {
	System.setProperty("webdriver.chrome.driver","C:\\selenium file\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.navigate().to("https://ui.cogmento.com/"); 
    
}

@When("I enter Username as {string} and Password as {string}")
public void i_enter_Username_as_and_Password_as(String username1, String possword1) {
	
	
	driver.findElement(username).sendKeys(username1);
	driver.findElement(possword).sendKeys(possword1);
	driver.findElement(Login).click();
}

@Then("login should be unsuccessful")
public void login_should_be_unsuccessful() {
    
}

}
