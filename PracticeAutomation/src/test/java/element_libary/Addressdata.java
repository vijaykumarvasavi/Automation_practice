   package element_libary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Pomrepogistary.Addtoaddress;
import Pomrepogistary.Addtobokker;
import genaric_libary.Allfunctions;
import genaric_libary.Baseclass;
import genaric_libary.Datafilehandiling;
import genaric_libary.Excelfilehandling;

public class Addressdata extends Baseclass {
	
	@Test
	public void Enterdetails( ) throws Throwable {
		
		
		Addtobokker ad = new Addtobokker(driver);		
		Addtoaddress res = new Addtoaddress(driver);
		Datafilehandiling da = new Datafilehandiling();
		Allfunctions all = new Allfunctions();
		
		Excelfilehandling ex = new Excelfilehandling();
		
		String FIRSTNAME = ex.getExcelData("Sheet1", 1, 0);
		String LASTNAME = ex.getExcelData("Sheet1", 1, 1);
		String EMAILID = ex.getExcelData("Sheet1", 1, 2);
	//	Double PHONENUM = ex.getExcelData1("Sheet1", 1, 3);
		String COUNTRY = ex.getExcelData("Sheet1", 1, 4);
		String ADDRESS = ex.getExcelData("Sheet1", 1, 5);
		String CITY = ex.getExcelData("Sheet1", 1, 6);
		String STATE = ex.getExcelData("Sheet1", 1, 7);
	//	Double ZIPCODE = ex.getExcelData1("Sheet1", 1, 8);
		String PHONENUM = da.getdatafile("Phonenum");
		String ZIPCODE = da.getdatafile("Zipcode");
		
	
		System.out.println(FIRSTNAME);
		System.out.println(LASTNAME);
		System.out.println(EMAILID);
		System.out.println(PHONENUM);
		System.out.println(COUNTRY);
		System.out.println(ADDRESS);
		System.out.println(CITY);
		System.out.println(STATE);
		System.out.println(ZIPCODE);
		
		
				
		ad.getShopbutton().click();
		Thread.sleep(4000);
		
		ad.getHomebutton().click();
		Thread.sleep(4000);
		
		ad.getAddtobasket().click();
		Thread.sleep(4000);
		
		ad.getCarticon().click();
		Thread.sleep(4000);
		
		ad.getItem().click();
		Thread.sleep(4000);
				
		res.getCheckoutBtn().click();
		Thread.sleep(2000);
				
		res.getFirstname().sendKeys(FIRSTNAME);
		Thread.sleep(2000);
		
		res.getLastname().sendKeys(LASTNAME);
     	Thread.sleep(2000);
		
		res.getEmailid().sendKeys(EMAILID);
		Thread.sleep(2000);
		
		res.getPhonenum().sendKeys(PHONENUM);
		Thread.sleep(2000);
		
//		WebElement COUN = res.getCountry();
//		
//		Select se = new Select(COUN);
//		se.selectByVisibleText(COUNTRY);		 
				
		res.getAddress().sendKeys(ADDRESS);
		Thread.sleep(2000);
		
		res.getCity().sendKeys(CITY);
		Thread.sleep(2000);
		
//        WebElement STA = res.getCountry();
//		
//		Select ST = new Select(STA);
//		se.selectByVisibleText(STATE);
		
		res.getPincode().sendKeys(ZIPCODE);
		Thread.sleep(2000);
		
		
		
		//Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		
		
	}
	

}
  