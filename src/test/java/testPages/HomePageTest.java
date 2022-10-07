package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	private org.openqa.selenium.Dimension dimension;
	@Test(enabled = false)
	public void logoTest() throws InterruptedException {
		homePage.logoDisplayed();
		Thread.sleep(3000);
	}

	@Test(enabled = false)
	public void allButtonTest() throws InterruptedException {
		homePage.allClicked();

	}

	@Test(enabled = false)
	public void addressTest() throws InterruptedException {
		homePage.addressField();
	}

	@Test(enabled = false)
	public void searchTest() throws InterruptedException {
		homePage.searchButton();
	}

	@Test(enabled = false)
	public void cartTest() throws InterruptedException {
		homePage.cartButton();
	}

	// LOGO TEST

	@Test(enabled = false)
	public void logoTestclic() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")).click();
	}

	@Test(enabled = false)
	public void logoTestclic02() throws InterruptedException {
		driver.findElement(By.id("nav-logo-sprites")).click();
	}

	@Test(enabled = false)
	public void logoTestclic03() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")).isDisplayed();
	}

	// GET TITLE
	@Test(enabled = false)
	public void use_of_getTitle_method() {
		System.out.println("The title of the page is " + driver.getTitle());
	}

	// GET URL
	@Test(enabled = false)
	public void getURL() throws InterruptedException {
		// driver.findElement(By.id("nav-logo-sprites")).click();
		// Thread.sleep(20);
		System.out.println(driver.getCurrentUrl());
	}

	// LOGIN EMAIL

	@Test(enabled = false)
	public void loginButtonTest01() {
		driver.get(
				"https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"))
				.isEnabled();
	}

	@Test(enabled = false)
	public void testtext01() {
		WebElement textTest = driver.findElement(By.xpath("//span[text()='Sign in']"));
		System.out.println("The text for the Web Element" + textTest.getText());
	}

	@Test(enabled = false)
	public void Selected_method() {
		driver.get("https://www.statefarm.com/");
		driver.findElement(By.cssSelector("div.-oneX-util-menu-icon.-oneX-util-menu-icon-search")).isSelected();
	}

	@Test(enabled = false)
	public void get_attribute() {
		String value1 = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).getAttribute("id");
		String value2 = driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")).getAttribute("class");
		System.out.println("The value of the span Attribut is : " + value1);
		System.out.println("The value of the span Attribut is : " + value2);
	}

	@Test(enabled = false)
	public void sendKeysAndclear() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).clear();

		// driver.findElement(By.className("nav-input
		// nav-progressive-attribute")).clear();
	}

	@Test(enabled = false)
	public void searchCSS() {
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();
	}
	
	@Test(enabled = false)
	public void navigationmethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().to("https://www.statefarm.com/");

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);

	}

	@Test(enabled = true)
	public void setASpecificSizeOfWindow() throws InterruptedException {
		Dimension dimension = new Dimension(700, 400);
		driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://www.statefarm.com/");
		Thread.sleep(4000);
		System.out.println("This size of the screen is " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		System.out.println("This size of the screen is " + driver.manage().window().getSize());
		Thread.sleep(4000);
		driver.manage().window().setSize(dimension);
		Thread.sleep(4000);
		System.out.println("This size of the screen is " + driver.manage().window().getSize());

	}

}
