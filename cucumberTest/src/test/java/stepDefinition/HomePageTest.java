package stepDefinition;
import org.apache.log4j.Logger;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageTest {

	private static org.apache.log4j.Logger log = Logger.getLogger(CheckoutTest.class);

	@When("^the user cliks on signin$")
	public void the_user_cliks_on_signin() throws Throwable {
		System.out.println("the user cliks on signin");
		log.info("the user cliks on signin");

	}

	@Then("^the current page will be the signin page$")
	public void the_current_page_will_be_the_signin_page() throws Throwable {
		System.out.println("the current page will be the signin page");
		log.info("the current page will be the signin page");

	}
}
