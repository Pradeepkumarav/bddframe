package com.addproducts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.stepdefination.Addproducts;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addproductsitems {
	public WebDriver driver;
	public Addproducts lp;



@Given("User Launch browser")
public void user_Launch_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\selenium file\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	 lp=new Addproducts(driver);
	 
    
}

@When("user opens url {string}")
public void user_opens_url(String url) {
    driver.get(url);
}

@When("click on sign in buttin")
public void click_on_sign_in_buttin() {
	lp.clickononsignin();
}

@When("I a enter Username as {string} and Password as {string}")
public void i_a_enter_Username_as_and_Password_as(String username, String password) {
	
    lp.sendemail(username);
    lp.sendpossword(password);
}

@When("click on login button")
public void click_on_login_button() {
	lp.clickonlogin();
    
}
 

@Then("user can view dashboard")
public void user_can_view_dashboard() {
	lp.gettext();
    
}

@When("user click on computers menu and click on desktop icon")
public void user_click_on_computers_menu_and_click_on_desktop_icon() {
	lp.clickondesktop();
}


@Then("desktop items will apear")
public void desktop_items_will_apear() {
	lp.viewdesktpos();
	lp.filterposition();	
   
}

@When("click on reqired desktop")
public void click_on_reqired_desktop() {
	lp.clickonaddtocart();
   
}

@When("click on the another desktop")
public void click_on_the_another_desktop() {
	lp.clickonanotherdesktop();
   
}

@When("select features of another desktop")
public void select_features_of_another_desktop() {
	lp.addanotherdeskfeature();
   
}


@When("select the checkbox of the feature")
public void select_the_checkbox_of_the_feature() {
	lp.selectfeature();
  
}

@When("add to the cart")
public void add_to_the_cart() {
	lp.addingtothecart();
   
}

@Then("selected item will display in shopping cart")
public void selected_item_will_display_in_shopping_cart()
{
	lp.displayinshippingcart();
}

}
