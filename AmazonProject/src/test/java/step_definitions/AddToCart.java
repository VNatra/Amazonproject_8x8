package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddBookToCart;

public class AddToCart{

	WebDriver driver;
	AddBookToCart Book;
	
	public AddToCart()
	{
		driver = BaseClass.driver;
		Book = new AddBookToCart(driver);
	}
	
	@Given("^I am on Amazon$")
	public void I_Open_Amazon()
	{
		Book.open_amazon();
	}
	
	@When("^I search Spider Man book on Amazon$")
	public void Search_Book_On_Amazon()
	{
		Book.search_book_on_amazon();
	}
	
	@And("^I add book to the cart$")
	public void Add_Book_To_Cart()
	{
		Book.add_book_to_cart();
	}
	  
	@Then("^I should see the book is added to the cart$")
	public void Verify_Book_Is_Added_To_Cart()
	{
		Book.verify_book_added_to_cart();
	}
	
}
