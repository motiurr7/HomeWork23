package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // PageFactory class help to instantiate WebElement
	}
	// 1st way: Most common way to write the WebElement (@FindBy), you must know how to do that
	
	@FindBy(xpath = "//a[@class= 'nav-logo-link nav-progressive-attribute']")
	WebElement logo;
	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The logo is displayed: " + flag);
		return flag;
	}
	
	

	@FindBy(xpath = "//a[@id='nav-hamburger-menu']" )
	WebElement allButton;
	public void allClicked() throws InterruptedException {
		Thread.sleep(5000);
		allButton.click();
		Thread.sleep(5000);
	}
	
	
	@FindBy (xpath = "//span[@id='glow-ingress-line2']")
	WebElement address;
	public void addressField() {
		address.click(); 
	}
	

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchButton;
	public void searchButton() throws InterruptedException {
		searchButton.click();
		Thread.sleep(5000);
	}

	@FindBy(how = How.XPATH, using ="//span[@class='nav-cart-count nav-cart-0 nav-progressive-attribute nav-progressive-content']")
	WebElement cartButton;
	public void cartButton() throws InterruptedException {
		Thread.sleep(5000);
		cartButton.click();
		Thread.sleep(5000);
	}
	
	
	
	
}
