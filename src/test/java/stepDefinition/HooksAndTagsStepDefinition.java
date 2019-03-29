/*
 * @Before & @after are called Global hooks. For them no need to do anything in feature file. They will be executed before & after each scenario. 
 * in case of scenario outline they will be executed after each test data. 
 * 
 * Local / Taged Hooks - applicable for specified scenarios
 * 
 */

package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class HooksAndTagsStepDefinition {

	// Defined 2 global hooks
	
		
	@Before(order=1)
	public void setup() {
		System.out.println("I am in before 1 class");
	}

	@After (order=1)
	public void teardown() {
		System.out.println("I am in after 1  class");
	}

	
	@Before(order=0)
	public void asetup1() {
		System.out.println("I am in before 2 class");
	}

	@After(order=0)
	public void ateardown1() {
		System.out.println("I am in after 2 class");
	}


	//Local / Tagged Hooks - applicable for specified scenarios
	@Before("@MyTag")
	public void setupForFirstSceanrio() {
		System.out.println("I am in before class for scenario with tag MyTag.");
	}

	@After("@MyTag")
	public void teardownForFirstSceanrio() {
		System.out.println("I am in after class for scenario with tag MyTag.");
	}

	@Given("^dummy step$")
	public void dummy_step() {
		System.out.println("My Dummy step.");
	}


}
