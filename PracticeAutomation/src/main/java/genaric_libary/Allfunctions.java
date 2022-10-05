package genaric_libary;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Allfunctions {   	
	
	
		public void select(WebElement element, String visibleText) {
			Select sel = new Select(element);
			sel.selectByVisibleText(visibleText);
			
		}
		
		public void select(WebElement element, int index) {
			Select sel = new Select(element);
			sel.selectByIndex(index);
			
		}
		
		
		public void waitforElementToBeClickable(WebDriver driver , WebElement element) {
			 WebDriverWait wait = new WebDriverWait(driver, Constant.explicitlyWaitWiat);
			 wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
		
		public void waitforElementToVisibale(WebDriver driver , WebElement element) {
			 WebDriverWait wait = new WebDriverWait(driver, Constant.explicitlyWaitWiat);
			 wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public void waitForElemnetContainsText(WebDriver driver , WebElement element , String text) {
			 WebDriverWait wait = new WebDriverWait(driver, Constant.explicitlyWaitWiat);
			 wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		}	
			
		
		public void waitForHTMLDOM(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Constant.implicitywait, TimeUnit.SECONDS);
			
		}
		
		
		public void waitforElement( WebElement element) throws Throwable {
			  int count = 0;
		        while(count < 40) {
				   try {
					   element.isDisplayed();
				     break;
				   }catch (Throwable e) {
					Thread.sleep(500);
					count++;
				   }
		        }
		}
		
		public void waitAndClick(WebDriver driver , String xpath) throws Throwable {
			  int count = 0;
		        while(count < 40) {
				   try {
					   driver.findElement(By.xpath(xpath)).click();
				     break;
				   }catch (Throwable e) {
					 Thread.sleep(500);
					 count++;
				   }
		        }
		}
		
		
		public void swicthToWindow(WebDriver driver , String partailWindowTitle) {
			  /*get all window session ID*/
			   Set<String> set = driver.getWindowHandles();
			   Iterator<String> it = set.iterator();
			    
			   while(it.hasNext()) {
				   String winID = it.next();
				   driver.switchTo().window(winID);
				   String actTitle = driver.getTitle();
				   if(actTitle.contains(partailWindowTitle)) {
					   System.out.println("swicthed to actual winow");
					   break;
				   }
			   }
		}
		
		public void alertOK(WebDriver driver) {
			
			driver.switchTo().alert().accept();
		}
		
		
	   public void alertCancel(WebDriver driver) {
			
			driver.switchTo().alert().dismiss();
		}
		
		
		public void moveToExpectedElemnet(WebDriver driver , WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
		}
		
		public void swictToFrame(WebDriver driver , int index) {
			driver.switchTo().frame(index);
		}
		
	   public void swictToFrame(WebDriver driver , WebElement element) {
		   driver.switchTo().frame(element);
		}
	   
	   public void swictToFrame(WebDriver driver , String id, String name) {
		   WebElement fwb;
		     if(id!=null) {
		    	 driver.switchTo().frame(id);
		     }else {
		    	 driver.switchTo().frame(name);
		     }
		   
		}  	
	
}
