package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AddBookToCart{
	
	public WebDriver driver;
	//public String Base_URL = "https://www.amazon.com/";
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchInputBox;
	
	@FindBy(css =".nav-input")
	WebElement searchButton;
	
	@FindBy(css =".a-size-medium.s-inline.s-access-title.a-text-normal")
	WebElement bookLink;
	
	@FindBy(id = "add-to-cart-button")
	WebElement addCartButton;
	
	
	public AddBookToCart(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void open_amazon()
	{
		driver.get("http://amazon.com");
	}
	
	public void search_book_on_amazon()
	{
		searchInputBox.sendKeys("Spider man book");
		searchButton.click();
	}
	
	public void add_book_to_cart()
	{
		bookLink.click();
	}
	
	public void verify_book_added_to_cart()
	{
		addCartButton.click();
		String actualValue= driver.findElement(By.cssSelector(".a-size-medium.a-text-bold")).getText();
		System.out.println("Name Of the Book:"+actualValue);
		Assert.assertEquals("Added to Cart", actualValue);
	}
	
}
