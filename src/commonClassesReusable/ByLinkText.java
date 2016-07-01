package commonClassesReusable;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class ByLinkText extends BrowserSelection
{

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void Click_Using_LinkText(String finallinkText, String screenshotname) throws IOException, InterruptedException 
	{
		try
		{
		dynamicwait.WaitUntilElement(By.linkText(finallinkText));
		WebElement clickfn = driver.findElement(By.linkText(finallinkText));
		Jexecutor.highlightElement(clickfn);
		clickfn.click();
		AssertandScreenshot.checkerroralertcomesandaccept(screenshotname);
		AssertandScreenshot.GenerateScreenshot(screenshotname);
		System.out.println(screenshotname);
		log1.info(screenshotname);
		}
		catch(Exception e1)
		{
			System.out.println("Not able to Click on " + screenshotname);
			log1.info("Not able to Click on " + screenshotname);
			AssertandScreenshot.ForcefulGenerateScreenshot("Not_able_to_Perform" + screenshotname);
			throw new java.lang.RuntimeException("Test Case failed as Not able to Click on  " + screenshotname);
		}

	}
	
	public static void SendKeys_Without_Clearing_Previous_data_Using_LinkText(String finallinkText, String screenshotname, String entersomething) throws IOException, InterruptedException 
	{
		try
		{
		dynamicwait.WaitUntilElement(By.linkText(finallinkText));
		WebElement sendkeysfn = driver.findElement(By.linkText(finallinkText));
		Jexecutor.highlightElement(sendkeysfn);
		sendkeysfn.sendKeys(entersomething);
		AssertandScreenshot.checkerroralertcomesandaccept(screenshotname);
		AssertandScreenshot.GenerateScreenshot(screenshotname);
		System.out.println(screenshotname);
		log1.info(screenshotname);
		}
		catch(Exception e1)
		{
			System.out.println("Not able to " + screenshotname);
			log1.info("Not able to " + screenshotname);
			AssertandScreenshot.ForcefulGenerateScreenshot("Not_able_to_" + screenshotname);
			throw new java.lang.RuntimeException("Test Case failed as Not able to  " + screenshotname);
		}

	}
	
	public static Boolean GetAttribute_Using_LinkText(String finallinkText, String screenshotname, String searchstring) throws IOException, InterruptedException 
	{
		Boolean temp1 = false;
		String comparestring = null;
		try
		{
		dynamicwait.WaitUntilElement(By.linkText(finallinkText));
		WebElement sendkeysfn = driver.findElement(By.linkText(finallinkText));
		Jexecutor.highlightElement(sendkeysfn);
		comparestring = sendkeysfn.getAttribute("title");
		if(searchstring.equals(comparestring))
		{
			temp1 = true;
		}
		AssertandScreenshot.checkerroralertcomesandaccept(screenshotname);
		AssertandScreenshot.GenerateScreenshot(screenshotname);
		System.out.println(screenshotname);
		log1.info(screenshotname);
		}
		catch(Exception e1)
		{
			System.out.println("Not able to " + screenshotname);
			log1.info("Not able to " + screenshotname);
			AssertandScreenshot.ForcefulGenerateScreenshot("Not_able_to_" + screenshotname);
			throw new java.lang.RuntimeException("Test Case failed as Not able to  " + screenshotname);
		}
		return temp1;

	}
	
	public static void SendKeys_After_Clearing_Previous_data_Using_LinkText(String finallinkText, String screenshotname, String entersomething) throws IOException, InterruptedException 
	{
		try
		{
		dynamicwait.WaitUntilElement(By.linkText(finallinkText));
		WebElement sendkeysfn = driver.findElement(By.linkText(finallinkText));
		Jexecutor.highlightElement(sendkeysfn);
		sendkeysfn.clear();
		sendkeysfn.sendKeys(entersomething);
		AssertandScreenshot.checkerroralertcomesandaccept(screenshotname);
		AssertandScreenshot.GenerateScreenshot(screenshotname);
		System.out.println(screenshotname);
		log1.info(screenshotname);
		}
		catch(Exception e1)
		{
			System.out.println("Not able to " + screenshotname);
			log1.info("Not able to " + screenshotname);
			AssertandScreenshot.ForcefulGenerateScreenshot("Not_able_to_" + screenshotname);
			throw new java.lang.RuntimeException("Test Case failed as Not able to  " + screenshotname);
		}

	}
	
	public static String GetText_Using_LinkText(String finallinkText, String screenshotname) throws IOException, InterruptedException 
	{
		String textvalue = null;
		try
		{
		dynamicwait.WaitUntilElement(By.linkText(finallinkText));
		WebElement sendkeysfn = driver.findElement(By.linkText(finallinkText));
		Jexecutor.highlightElement(sendkeysfn);
		textvalue = sendkeysfn.getText();
		AssertandScreenshot.checkerroralertcomesandaccept(screenshotname);
		AssertandScreenshot.GenerateScreenshot(screenshotname);
		System.out.println(screenshotname);
		log1.info(screenshotname);
		}
		catch(Exception e1)
		{
			System.out.println("Not able to " + screenshotname);
			log1.info("Not able to " + screenshotname);
			AssertandScreenshot.ForcefulGenerateScreenshot("Not_able_to_" + screenshotname);
			throw new java.lang.RuntimeException("Test Case failed as Not able to  " + screenshotname);
		}
		return textvalue;

	}
	
	public static Boolean IsDisplayed_After_Clearing_Previous_data_Using_LinkText(String finallinkText, String screenshotname, String entersomething) throws IOException, InterruptedException 
	{
		Boolean temp;
		try
		{
		WebElement sendkeysfn = driver.findElement(By.linkText(finallinkText));
		Jexecutor.highlightElement(sendkeysfn);
		temp = sendkeysfn.isDisplayed();
		AssertandScreenshot.checkerroralertcomesandaccept(screenshotname);
		AssertandScreenshot.GenerateScreenshot(screenshotname);
		System.out.println(screenshotname);
		log1.info(screenshotname);
		}
		catch(Exception e1)
		{
			System.out.println("Not able to " + screenshotname);
			log1.info("Not able to " + screenshotname);
			AssertandScreenshot.ForcefulGenerateScreenshot("Not_able_to_" + screenshotname);
			throw new java.lang.RuntimeException("Test Case failed as Not able to  " + screenshotname);
		}
		return temp;

	}
	
	public static void Submit_Using_LinkText(String finallinkText, String screenshotname) throws IOException, InterruptedException 
	{
		try
		{
		dynamicwait.WaitUntilElement(By.linkText(finallinkText));
		WebElement clickfn = driver.findElement(By.linkText(finallinkText));
		Jexecutor.highlightElement(clickfn);
		clickfn.submit();
		AssertandScreenshot.checkerroralertcomesandaccept(screenshotname);
		AssertandScreenshot.GenerateScreenshot(screenshotname);
		System.out.println(screenshotname);
		log1.info(screenshotname);
		}
		catch(Exception e1)
		{
			System.out.println("Not able to Submit " + screenshotname);
			log1.info("Not able to Submit " + screenshotname);
			AssertandScreenshot.ForcefulGenerateScreenshot("Not_able_to_Perform" + screenshotname);
			throw new java.lang.RuntimeException("Test Case failed as Not able to Submit  " + screenshotname);
		}

	}
	
	public static boolean Dropdown_Select(String finalxpath, String screenshotname, String ddl_value) throws IOException, InterruptedException  
	{  
	  try  
	  {  
	      Dropdown_Select_Using_LinkText(finalxpath,screenshotname,Integer.parseInt(ddl_value));
	  }  
	  catch(NumberFormatException nfe)  
	  {
		 Dropdown_Select_Using_LinkText(finalxpath,screenshotname,(ddl_value));  
	    return false;  
	  }  
	  return true;  
	}
	
	
	public static void Dropdown_Select_Using_LinkText(String finallinkText, String screenshotname, String dropdown_value) throws IOException, InterruptedException 
	{
		try
		{
		dynamicwait.WaitUntilElement(By.linkText(finallinkText));
		WebElement clickfn = driver.findElement(By.linkText(finallinkText));
		Jexecutor.highlightElement(clickfn);
		Select select = new Select(driver.findElement(By.linkText(finallinkText)));
		select.selectByValue(dropdown_value);
		AssertandScreenshot.checkerroralertcomesandaccept(screenshotname);
		AssertandScreenshot.GenerateScreenshot(screenshotname);
		System.out.println(screenshotname);
		log1.info(screenshotname);
		}
		catch(Exception e1)
		{
			System.out.println("Not able to Select value from dropdown " + screenshotname);
			log1.info("Not able to Select value from dropdown " + screenshotname);
			AssertandScreenshot.ForcefulGenerateScreenshot("Not_able_to_select_value_from_dropdown " + screenshotname);
			throw new java.lang.RuntimeException("Test Case failed as Not able to Select Value from dropdown  " + screenshotname);
		}

	}
	
	public static void Dropdown_Select_Using_LinkText(String finalxpath, String screenshotname, int index_value) throws IOException, InterruptedException 
	{
		try
		{
		dynamicwait.WaitUntilElement(By.linkText(finalxpath));
		WebElement clickfn = driver.findElement(By.linkText(finalxpath));
		Jexecutor.highlightElement(clickfn);
		Select select = new Select(driver.findElement(By.linkText(finalxpath)));
		select.selectByIndex(index_value);
		AssertandScreenshot.checkerroralertcomesandaccept(screenshotname);
		AssertandScreenshot.GenerateScreenshot(screenshotname);
		System.out.println(screenshotname);
		log1.info(screenshotname);
		}
		catch(Exception e1)
		{
			System.out.println("Not able to Select value from dropdown " + screenshotname);
			log1.info("Not able to Select value from dropdown " + screenshotname);
			AssertandScreenshot.ForcefulGenerateScreenshot("Not_able_to_select_value_from_dropdown " + screenshotname);
			throw new java.lang.RuntimeException("Test Case failed as Not able to Select Value from dropdown  " + screenshotname);
		}

	}
	public static void testForcefully_Checkbox_checked(String finalid, String screenshotname ) throws IOException, InterruptedException
	{
		Boolean check;
		
		try
		{
		dynamicwait.WaitUntilElement(By.id(finalid));
		WebElement clickfn = driver.findElement(By.id(finalid));
		Jexecutor.highlightElement(clickfn);
		check = clickfn.isSelected();
		AssertandScreenshot.checkerroralertcomesandaccept(screenshotname);
		AssertandScreenshot.GenerateScreenshot(screenshotname);
		System.out.println(screenshotname);
		log1.info(screenshotname);
		
		if(check == false)
		{
			clickfn.click();
		}
		}
		catch(Exception e1)
		{
			System.out.println("Not able to Check " + screenshotname);
			log1.info("Not able to Check " + screenshotname);
			AssertandScreenshot.ForcefulGenerateScreenshot("Not_able_to_Check" + screenshotname);
			throw new java.lang.RuntimeException("Test Case failed as Not able to Check the  " + screenshotname);
		}

	}
	
	public static void testForcefully_Uncheckbox_checked(String finalid, String screenshotname ) throws IOException, InterruptedException
	{
		Boolean check;
		
		try
		{
		dynamicwait.WaitUntilElement(By.id(finalid));
		WebElement clickfn = driver.findElement(By.id(finalid));
		Jexecutor.highlightElement(clickfn);
		check = clickfn.isSelected();
		AssertandScreenshot.checkerroralertcomesandaccept(screenshotname);
		AssertandScreenshot.GenerateScreenshot(screenshotname);
		System.out.println(screenshotname);
		log1.info(screenshotname);
		
		if(check == true)
		{
			clickfn.click();
		}
		}
		catch(Exception e1)
		{
			System.out.println("Not able to uncheck " + screenshotname);
			log1.info("Not able to uncheck " + screenshotname);
			AssertandScreenshot.ForcefulGenerateScreenshot("Not_able_to_uncheck" + screenshotname);
			throw new java.lang.RuntimeException("Test Case failed as Not able to uncheck the  " + screenshotname);
		}

	}
	
	
	

}
