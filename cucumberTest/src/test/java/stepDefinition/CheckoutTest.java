package stepDefinition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutTest {

	@Given("^the user browses the site amazon\\.com$")
	public void the_user_browses_the_site_amazon_com() throws Throwable {

		System.out.println("the user browses the site amazon");
	}

	@When("^the user searches for (.*)$")
	public void search(String keyword) throws Throwable {

		System.out.println("the user searches for " + keyword);
	}

	@Then("^the current page will be the search result page$")
	public void the_current_page_will_be_the_search_result_page() throws Throwable {

		System.out.println("the current page will be the search result page");
	}

	@When("^the user adds the first product in the search result to the cart$")
	public void the_user_adds_the_first_product_in_the_search_result_to_the_cart() throws Throwable {

		System.out.println("the user adds the first product in the search result to the cart");
	}

	@Then("^the shopping cart has the added product$")
	public void the_shopping_cart_has_the_added_product() throws Throwable {

		System.out.println("the shopping cart has the added product");
	}
}
