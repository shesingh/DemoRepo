package stepDefinition;


import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactsAndDealsStepDefinition {


	@Given("^User is already on FreeCRM login page$")
	public void user_is_already_on_FreeCRM_login_page() {

System.out.println("user is on CRM ogin page");
	}

	@When("^Page title is Free CRM$")
	public void page_title_is_Free_CRM()  {
		System.out.println("Title verified");
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2)  {
		System.out.println("NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button()  {
		System.out.println("Click Login button");
	}

	@Then("^User in on homepage$")
	public void user_in_on_homepage()  {
		System.out.println("User is on home page");

	}

	@Then("^User moves to new contacts$")
	public void user_moves_to_new_contacts()  {
		System.out.println("User click new contact");
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String arg1, String arg2, String arg3)  {
		System.out.println("Noooooooooooooooooooooooooooooooo");

	}

	@Then("^User closes the browser$")
	public void user_closes_the_browser()  {
		System.out.println("User close the browser");
	}


	// 3 new steps required for deal feature file
	/*
	 *Working with data table with List object
	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)  {
		List<List<String>> credentialData = credentials.raw();
		//get(0).get(0) means index is [0,0] which is user name & get(0).get(1) means index is [0,1] which is password
		System.out.println(credentialData.get(0).get(0));
		System.out.println(credentialData.get(0).get(1));

	}*/


	//Working with data table with Maps object
	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)  {
		for(Map<String, String> credentialData : credentials.asMaps(String.class, String.class)) {
			System.out.println(credentialData.get("username"));
			System.out.println(credentialData.get("password"));
		}	  	  
	}


	@Then("^User moves to new deal page$")
	public void user_moves_to_new_deal_page()  {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User clicks on new deal");

	}

	@Then("^User enters title and amount and commision$")
	public void user_enters_title_and_amount_and_commision(DataTable deal)  {
		
		
		for(Map<String, String> dealData : deal.asMaps(String.class, String.class)) {
			System.out.println(dealData.get("title"));
			System.out.println(dealData.get("amount"));
			System.out.println(dealData.get("commision"));
		}
		
		
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}










}
