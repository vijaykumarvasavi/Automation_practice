package element_libary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pomrepogistary.Addtobokker;
import genaric_libary.Baseclass;

public class Testdata extends Baseclass {

	
	@Test
	  public void carttobooker( ) throws Exception {
		
		Addtobokker ad = new Addtobokker(driver);
		
		ad.getShopbutton().click();
		Thread.sleep(4000);
		
		WebElement text = ad.getWelcometext();
		String text2 = text.getText();
		System.out.println(text2);
		
		ad.getHomebutton().click();
		Thread.sleep(4000);
		
		ad.getAddtobasket().click();
		Thread.sleep(4000);
		
		
		
		
		
		ad.getCarticon().click();
		Thread.sleep(4000);
		
		ad.getItem().click();
		Thread.sleep(4000);
		
		System.out.println("Add to bokker");		
		
	}
	
	
	
	

	

}
