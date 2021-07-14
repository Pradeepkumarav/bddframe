Feature: Adding products

Background: User is Logged In
	Given User Launch browser
	When  user opens url "http://demowebshop.tricentis.com/"
	And   click on sign in buttin
	And  I a enter Username as "pradeep7725@gmail.com" and Password as "pradeep@123"
	And  click on login button
	Then  user can view dashboard
	
  Scenario: Adding computers to the shipping cart
   When user click on computers menu and click on desktop icon
   Then desktop items will apear
   When click on reqired desktop
   And  select the checkbox of the feature
   And  add to the cart
   Then selected item will display in shopping cart
   
   Scenario: Adding Adding another computer
   When user click on computers menu and click on desktop icon
   Then desktop items will apear
   When  click on the another desktop
   And  select features of another desktop
   



   
