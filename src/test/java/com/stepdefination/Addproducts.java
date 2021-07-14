package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.ImmutableBiMap.Builder;

public class Addproducts {
	public static WebDriver driver;
	public Addproducts(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	@CacheLookup
	WebElement signin;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement email1;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement password2;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	@CacheLookup
	WebElement login;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	@CacheLookup
	WebElement text;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
	@CacheLookup
	WebElement computersmenu;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a")
	@CacheLookup
	WebElement desktop;
	
	@FindBy(id="products-orderby")
	@CacheLookup
	WebElement position;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")
	@CacheLookup
	WebElement desktoptext;
	
	@FindBy(id="products-pagesize")
	@CacheLookup
	WebElement sortby;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img")
	@CacheLookup
	WebElement addtocart;
	
	@FindBy(name="product_attribute_72_5_18")
	@CacheLookup
	WebElement processer;
	
	@FindBy(name="product_attribute_72_6_19")
	@CacheLookup
	WebElement RAM;
	
	@FindBy(name="product_attribute_72_3_20")
	@CacheLookup
	WebElement HDD;
	
	@FindBy(id="add-to-cart-button-72")
	@CacheLookup
	WebElement addingtocart;
	
	@FindBy(xpath="//*[@id=\"topcartlink\"]/a/span[1]")
	@CacheLookup
	WebElement shippingcart;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[1]/h1")
	@CacheLookup
	WebElement textshippingcart;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[1]/a/img")
	@CacheLookup
	WebElement anotherdesktop;
	
	@FindBy(id="product_attribute_16_6_5")
	@CacheLookup
	WebElement Ramdesktop;
	
	@FindBy(xpath="//*[@id=\"product_attribute_16_3_6_19\"]")
	@CacheLookup
	WebElement anotherdesktopHDD;
	
	@FindBy(xpath="//*[@id=\"product_attribute_16_4_7_21\"]")
	@CacheLookup
	WebElement anotherdesktopOS;
	
	@FindBy(xpath="//*[@id=\"product_attribute_16_8_8_24\"]")
	@CacheLookup
	WebElement anotherdesktopsoftware;
	
	
	
	 
	
	
  
	 public void clickononsignin()
	   {
	   	signin.click();
	   }
	   
	 public void sendemail(String email2)
	   {
	   email1.sendKeys(email2);
	   }
	
	 public void sendpossword(String possword)
	   {
	   	password2.sendKeys(possword);
	   }
	 public void clickonlogin()
	   {
	   	login.click();
	   }
	 
	 public void gettext()
	   {
	        String text1=text.getText();
	        System.out.println("verifying text is>>>>>"+text1);
	        
	        Assert.assertEquals("pradeep7725@gmail.com", text1);
	        System.out.println("user can view dashboard");
	        }
	 
	
	 public void  clickondesktop()
	 {
		 Actions builder1 =new Actions(driver);
		 builder1.moveToElement(computersmenu).build().perform();
		 desktop.click();
	 }
	 public void viewdesktpos()
	   {
		 String textdesktop=desktoptext.getText();
	        Assert.assertEquals("Desktops",textdesktop);
	        System.out.println("user entered desktop view");
	   }
	
	 public void filterposition()
	 {
		 Select objSelect =new Select(position);
		 objSelect.selectByVisibleText("Name: A to Z");
		 
		 Select objSelect1 =new Select(sortby);
		 objSelect1.selectByVisibleText("4");
     }
	 
	 public void clickonanotherdesktop()
	   {
	   	anotherdesktop.click();
	   }
	 public void addanotherdeskfeature()
	   {
	
	   	JavascriptExecutor js2 = (JavascriptExecutor) driver;
		  js2.executeScript("window.scrollBy(0, 250)", "");
		 
		   anotherdesktopHDD.click();
		   anotherdesktopsoftware.click();
		   anotherdesktopOS.click();
		   		
	   }
	 
	 
	 
	 public void clickonaddtocart()
	   {
	   	addtocart.click();
	   	JavascriptExecutor js2 = (JavascriptExecutor) driver;
		  js2.executeScript("window.scrollBy(0, 250)", "");
	   }
	 public void selectfeature()
	 {
		processer.click();
		RAM.click();
		HDD.click();
		 
		
     }
	 public void addingtothecart()
	 {
	   addingtocart.click();
	   JavascriptExecutor js2 = (JavascriptExecutor) driver;
		  js2.executeScript("window.scrollBy(0, -250)", "");
		  shippingcart.click();
		 
      }
	 public void displayinshippingcart()
	 {
		
		 String text2=textshippingcart.getText();
		 System.out.println("verifying text is>>>>>"+text2);
	     Assert.assertEquals("Shopping cart", text2);
	     System.out.println("selected items displayed in shipping cart");
	 
	 }
	 

}
