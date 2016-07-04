package Saas;



import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClassesReusable.GetCurrentWorkingDir;



public class PlanClass {
//comment
//comment2sdf
//comment2
	@Test
	public void beforeSuite() {
		System.out.println("Current dir: "+GetCurrentWorkingDir.getWorkingDirLocation());
		
	}

	

}
