package element_libary;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genaric_libary.Baseclass;

public class Test_crossss extends Baseclass {
	
	@Test
	public void create() {
	System.out.println("created");	
	Reporter.log("created successful");
	}
	
	@Test
	public void login() {
		System.out.println("login");	
		Reporter.log("login successful");
		}
	
	@Test
	public void edit() {
		System.out.println("edit");	
		Reporter.log("edit successful");
		}
	
	@Test
	public void add() {
		System.out.println("add");	
		Reporter.log("add successful");
		}
	
	@Test
	public void delet() {
		System.out.println("delet");	
		Reporter.log("delet successful");
		}



}
