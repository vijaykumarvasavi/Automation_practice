package Pomrepogistary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtoaddress {
	
	WebDriver driver;
	
	public Addtoaddress(WebDriver driver)
	{	
	PageFactory.initElements(driver, this);
	}	     
	
	@FindBy(xpath="//a[contains(@class,'checkout-button')]")
	private WebElement checkoutBtn;
	
	@FindBy(xpath="//input[@id='billing_first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='billing_last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='billing_email']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@id='billing_phone']")
	private WebElement phonenum;
	
	@FindBy(xpath="//input[@id='billing_address_1']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='billing_city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='billing_postcode']")
	private WebElement pincode;
	
	@FindBy(xpath="//*[@id='s2id_billing_country']")
	private WebElement country;
	
	@FindBy(xpath="//*[@id='s2id_billing_state']")
	private WebElement state;
	
	
	
	
	public WebElement getState() {
		return state;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPhonenum() {
		return phonenum;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPincode() {
		return pincode;
	}


	
	
	

}
