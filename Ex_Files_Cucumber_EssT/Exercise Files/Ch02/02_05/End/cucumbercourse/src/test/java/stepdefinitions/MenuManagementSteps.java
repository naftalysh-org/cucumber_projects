package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuManagementSteps {

	@Given("I have a menu item with name {string} and price {int}")
	public void i_have_a_menu_item_with_name_and_price(String newMenuItemName,Integer price) {
		RestaurantMenuItem NewMenuItem;
		NewMenuItem = RestaurantMenuItem(newMenuItemName, "", price);
	}

	@When("I add that menu item")
	public void i_add_that_menu_item() {
			// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("Menu Item with name {string} should be added")
	public void menu_Item_with_name_should_be_added(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}
	
}
