package commonClassesReusable;
import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class LoginWithDifferentUser extends BrowserSelection {

	
	public static void DifferentUserLogin() throws IOException, InterruptedException
	{
		
		driver.get(ReadDataFromPropertiesFile.readProperty_CommonData("URL"));
		ByID.SendKeys_After_Clearing_Previous_data_Using_ID(
				ReadDataFromPropertiesFile.readProperty_CommonData("username_id"), "enter text in username",
				ReadDataFromPropertiesFile.readProperty_CommonData("Username"));
		ByID.SendKeys_After_Clearing_Previous_data_Using_ID(
				ReadDataFromPropertiesFile.readProperty_CommonData("password_id"), "enter text in password",
				ReadDataFromPropertiesFile.readProperty_CommonData("Password"));
		ByID.Click_Using_ID(ReadDataFromPropertiesFile.readProperty_CommonData("LoginButton_id"),
				"click on login button");
	}
		
	}
	
	
	

