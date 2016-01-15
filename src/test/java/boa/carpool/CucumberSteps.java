package boa.carpool;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase{
	Ride ride;
	String actionbutton;
	@Given("^employee enter all data correctly$")
	public void employee_enter_all_data_correctly() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride = new Ride();
		ride.setName("Naveen");
		
	}

	@When("^click on Submit$")
	public void click_on_Submit() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		actionbutton="Submit";
	}

	@Then("^System display message \"([^\"]*)\"$")
	public void System_display_message(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RideBLL rideBLL= new RideBLL();
		assertEquals(arg1, rideBLL.validate(ride));
	}

	@Given("^employee enter Name as \"([^\"]*)\", email as \"([^\"]*)\", Phone no is \"([^\"]*)\" and orgin is \"([^\"]*)\" and Destination is \"([^\"]*)\" and Time will be \"([^\"]*)\"$")
	public void employee_enter_Name_as_email_as_Phone_no_is_and_orgin_is_and_Destination_is_and_Time_will_be(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^employee is logged In on portal$")
	public void employee_is_logged_In_on_portal() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^data should on top on next page$")
	public void data_should_on_top_on_next_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}



}
