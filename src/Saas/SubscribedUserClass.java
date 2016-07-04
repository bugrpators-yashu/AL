package Saas;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClassesReusable.ByID;
import commonClassesReusable.ByLinkText;
import commonClassesReusable.ByXpath;
import commonClassesReusable.ReadDataFromPropertiesFile;

public class SubscribedUserClass extends SaasCommonTestCase {
	
@BeforeTest
	public static void login()throws IOException, InterruptedException {
		SaasCommonTestCase.LoginSaas();
	    System.out.println("Pass-Login successfully");
		
	}
@BeforeMethod
 public static void SubcriberCompanyPage()throws IOException, InterruptedException {
	ByLinkText.Click_Using_LinkText(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("linktext_SubscriberCompanyUser"), "click Subscriber Company/user ");

}
@Test(priority=10)
  public static void TC_0022()throws IOException, InterruptedException {

	  SaasCommonTestCase.Subscribes_ADD_Company_user("www","FreePlan","Select");
	  String txt3= ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_statusActiveOrDeactive"), "");
	  Assert.assertTrue(txt3.equals(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("status_FreePlan_Subscriber")),"Status is not displaying Active");
	  System.out.println("Pass-Status is displaying Active");
}
@Test(priority=1)
public static void TC_0023()throws IOException, InterruptedException {
	
	 SaasCommonTestCase.Subscribes_ADD_Company_user("rr","First Plan","Select");
	 String txt3= ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_statusActiveOrDeactive"), "");
	 Assert.assertTrue(txt3.equals(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("status_Paid_Subscriber")),"Status is not displaying Pending Payment");
	 System.out.println("Pass-Status is displaying Pending Payment");	
	
}
@Test(priority=2)
public static void TC_0030()throws IOException, InterruptedException {
	
	SaasCommonTestCase.Subscribes_ADD_Company_user("ee","FreePlan","Select");
	String winHandleBefore = driver.getWindowHandle();
	ByXpath.Dropdown_Select_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"),"select Go to site ","Go to Site");
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	 	}
	String txt1=driver.getTitle();
	Assert.assertEquals(txt1,"Login","User not able to redirected to the company's website");
	System.out.println("Pass-User able to redirected to the company's website");
	driver.close();
	driver.switchTo().window(winHandleBefore);
	
}
@Test(priority=3)
public static void TC_0031()throws IOException, InterruptedException {
	
	ByXpath.Dropdown_Select_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"),"select Go to site ","DeActivate");
	ByXpath.Click_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subscriber_StatusChangeDeactivate_popup"),"click on yes button popup");

	String gettxt=ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_statusActiveOrDeactive"), "");
	Assert.assertEquals(gettxt,"InActive","status record is not changed to InActive");
	System.out.println("Pass-Status record is changed to InActive");
	
	
}
@Test(priority=4)
public static void TC_0033()throws IOException, InterruptedException {
	
	String gettxt=ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_statusActiveOrDeactive"), "");
	if (gettxt.equals("InActive")) {
		ByXpath.Dropdown_Select_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"),"select Activate ","Activate");
		ByXpath.Click_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subscriber_StatusChangeDeactivate_popup"),"click on yes button popup");
		String gettxt1=ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_statusActiveOrDeactive"), "");
		Assert.assertTrue(gettxt1.equals("Active"),"status not changed to Active");
		System.out.println("Pass-status changed to Active");
		String gettxt2=ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"), "");
	    Assert.assertTrue(gettxt2.contains("Go to Site"),"user not able to access website");
	    System.out.println("Pass- user able to access website");
	
	}
	else if (gettxt.equals("Active")) {
		ByXpath.Dropdown_Select_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"),"select DeActivate ","DeActivate");
		ByXpath.Click_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subscriber_StatusChangeDeactivate_popup"),"click on yes button popup");
		
		ByXpath.Dropdown_Select_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"),"select Activate ","Activate");
		ByXpath.Click_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subscriber_StatusChangeDeactivate_popup"),"click on yes button popup");
		String gettxt1=ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_statusActiveOrDeactive"), "");
		Assert.assertTrue(gettxt1.equals("Active"),"status not changed to Active");
		System.out.println("Pass-status changed to Active");
		String gettxt2=ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"), "");
	    Assert.assertTrue(gettxt2.contains("Go to Site"),"user not able to access website");
	    System.out.println("Pass- user able to access website");
	}
	else if (gettxt.equals("Pending Payment")){
		
		System.out.println("not displaying Active/inActive status");
	}		
		
	}
	@Test(priority=5)
	public static void TC_0034()throws IOException, InterruptedException {
		
		String gettxt=ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_statusActiveOrDeactive"), "");
		if (gettxt.equals("InActive")) {
			ByXpath.Dropdown_Select_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"),"select Activate ","Activate");
			ByXpath.Click_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subscriber_StatusChangeDeactivate_popup"),"click on yes button popup");
			String winHandleBefore = driver.getWindowHandle();
			ByXpath.Dropdown_Select_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"),"select Go to site ","Go to Site");
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			 	}
			String txt1=driver.getTitle();
			Assert.assertEquals(txt1,"Login","User not able to redirected to the company's website");
			System.out.println("Pass-User able to redirected to the company's website");
			driver.close();
			driver.switchTo().window(winHandleBefore);
			
		}
		else if (gettxt.equals("Active")) {
			ByXpath.Dropdown_Select_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"),"select DeActivate ","DeActivate");
			ByXpath.Click_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subscriber_StatusChangeDeactivate_popup"),"click on yes button popup");
			
			ByXpath.Dropdown_Select_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"),"select Activate ","Activate");
			ByXpath.Click_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subscriber_StatusChangeDeactivate_popup"),"click on yes button popup");
			String winHandleBefore = driver.getWindowHandle();
			ByXpath.Dropdown_Select_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_ActionGrid_select_Active/Deactive/GoToSite"),"select Go to site ","Go to Site");
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			 	}
			String txt1=driver.getTitle();
			Assert.assertEquals(txt1,"Login","User not able to redirected to the company's website");
			System.out.println("Pass-User able to redirected to the company's website");
			driver.close();
			driver.switchTo().window(winHandleBefore);
			
		}
		else if (gettxt.equals("Pending Payment")){
			
			System.out.println("not displaying Active/inActive status");
		}		
		
		
		
	}

	@Test(priority=0)
	public static void TC_0037()throws IOException, InterruptedException {
		
		ByID.Dropdown_Select(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subscriber_Select_companyStatusFilter"),"select any value from company statusfilter", "Active");
		List gettxt=ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subscriber_Status_Column11"), "");
		
		
		
	}





}