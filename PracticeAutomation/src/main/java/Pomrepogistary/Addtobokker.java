package Pomrepogistary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtobokker {

	WebDriver driver;
	public Addtobokker(WebDriver driver)
	{	
	PageFactory.initElements(driver, this);
	}
    
	
	public WebElement getShopbutton() {
		return shopbutton;
	}

	public WebElement getHomebutton() {
		return homebutton;
	}

	public WebElement getAddtobasket() {
		return Addtobasket;
	}

	public WebElement getCarticon() {
		return carticon;
	}


	@FindBy(xpath="//li[@id='menu-item-40']")
	private WebElement shopbutton;
	
	@FindBy(xpath="//h4[text()='Refine By >']")
	private WebElement welcometext;
		
	public WebElement getWelcometext() {
		return welcometext;
	}


	@FindBy(xpath="//a[text()='Home']")
	private WebElement homebutton;
	
	@FindBy(xpath="//h3[text()='Selenium Ruby']")
	private WebElement Addtobasket;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement carticon;
	
	@FindBy(xpath="//li[@id='wpmenucartli']")
	private WebElement item;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getItem() {
		return item;
	}

	
	

}
