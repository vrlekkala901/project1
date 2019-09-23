import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import vidya.project1.uipage;

public class uistep {
	
	@Given("^launch the url$")
	public void launch_the_url() throws Throwable {
uipage UI = new uipage();
	    
		UI.Testing();
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^search item value$")
	public void search_item_value() throws Throwable {
		System.out.println("hello world");
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("^search result should be displayed$")
	public void search_result_should_be_displayed() throws Throwable {
		System.out.println("hello world");
	    // Write code here that turns the phrase above into concrete actions
	
	}



}
