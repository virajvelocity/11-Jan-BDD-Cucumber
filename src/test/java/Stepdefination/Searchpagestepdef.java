package Stepdefination;

import java.util.ArrayList;

import org.testng.Assert;

import Pages.Searchpage;
import QA.Driverfactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchpagestepdef 
{
  //step definition Class
	
	Searchpage Sp=new Searchpage(Driverfactory.getdriver());  //driver
	
	
	@When("user searches {string}")   //MacBook
	public void user_searches(String Searchproduct) 
	{
		Sp.enterproductnameinserach(Searchproduct);  //MacBook
		Sp.clickasearchbutton();
	    
	}

	@Then("user should be able to see {string}, {string} and {string}")// MacBook  //MacBook Air  //MacBook Pro
	public void user_should_be_able_to_see_and(String ExpectedProduct1, String ExpectedProduct2, String ExpectedProduct3) 
	{
		ArrayList<String> Products=Sp.verifysearchedproduct();  //MacBook  ////MacBook Air  //MacBook Pro
		
		         String  ActualProduct1=Products.get(0);  //MacBook
		         String  ActualProduct2=Products.get(1);  //MacBook Air  
		         String  ActualProduct3=Products.get(2);  //MacBook Pro
		         
		Assert.assertEquals(ActualProduct1, ExpectedProduct1);
		
		Assert.assertEquals(ActualProduct2, ExpectedProduct2);       
		  
		Assert.assertEquals(ActualProduct3, ExpectedProduct3);   
		
	}

	
	
	
	
	
	
	
	
	
}
