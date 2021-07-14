package com.Backgrounddemo_step;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefination {
	public static WebDriver driver;
	
	By username =By.name("Email");
	By possword =By.name("Password");
	By Login =By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	

	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
	   WebElement signin=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	  signin.click();
		  String text=driver.getTitle();
		  
		  Assert.assertEquals("Demo Web Shop. Login", text);
		  System.out.println("its in login page");    
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() {
		driver.findElement(username).sendKeys("pradeep7725@gmail.com");
		driver.findElement(possword).sendKeys("pradeep@123");
	    driver.findElement(Login).click();
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		
		  String text1=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		  
		  Assert.assertEquals("pradeep7725@gmail.com", text1);
		  System.out.println("its logged succcesfully");    
		
		
	   
	}

	@Given("User search for Lenovo Laptop")
	public void user_search_for_Lenovo_Laptop() {
		 Actions builder1 =new Actions(driver);
	      builder1.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"))).build().perform(); 
	      driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a")).click();
	      Select objSelect =new Select(driver.findElement(By.id("products-orderby")));
		  objSelect.selectByVisibleText("Name: A to Z");
		  Select Select =new Select(driver.findElement(By.id("products-pagesize")));
		  Select.selectByVisibleText("4");
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img")).click();  
	    
	}

	@When("Add the first laptop that appears in the search result to the basket")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		  js2.executeScript("window.scrollBy(0, 250)", "");
		  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-72\"]")).click();
	    
	}

	@Then("User basket should display with added item")
	public void user_basket_should_display_with_added_item() {
	    
	}

	@Given("User navigate for Lenovo Laptop")
	public void user_navigate_for_Lenovo_Laptop() {
	    
	}

	@When("Add the laptop to the basket")
	public void add_the_laptop_to_the_basket() {
	    

}}
