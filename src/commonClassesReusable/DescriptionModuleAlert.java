package commonClassesReusable;

import org.openqa.selenium.JavascriptExecutor;

public class DescriptionModuleAlert extends BrowserSelection {
	
	public static void DescriptionAlert(String description) throws InterruptedException
	
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;

		
		//	jse.executeScript("alert('logging');").toString().wait(3000);
		try
		{
			jse.executeScript("setTimeout(function(){alert('Hello' + description)},5000)");
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			log1.info("reached");
		
			log1.info(e.fillInStackTrace());
			
		}
		if(isAlertPresent.checkAlertPresent())
		{
			isAlertPresent.acceptAlert();
		}
		
	}

}
