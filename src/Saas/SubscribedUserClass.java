package Saas;

import java.io.IOException;

import org.testng.Assert;

import commonClassesReusable.ByID;
import commonClassesReusable.ByLinkText;
import commonClassesReusable.ByXpath;
import commonClassesReusable.ReadDataFromPropertiesFile;

public class SubscribedUserClass {
	public void Subscribes_Company_user()throws IOException, InterruptedException {
		try{
			ByLinkText.Click_Using_LinkText(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("linktext_SubscriberCompanyUser"), "click Subscriber Company/user ");
			ByID.Click_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcribe_Button_AddNewCompanyUser"),"click on Add new company");
		    ByID.SendKeys_After_Clearing_Previous_data_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_FirstName"), "Enter FirstNAme ", ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_FirstName"));
		    ByID.SendKeys_After_Clearing_Previous_data_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_LastName"), "Enter LastName", ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_LastName"));
		    ByID.SendKeys_After_Clearing_Previous_data_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_Email"), "Enter Email", ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_Email"));
		    ByID.SendKeys_After_Clearing_Previous_data_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_EmailPassword"), "Enter Email Password", ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_Email"));
		    ByID.SendKeys_After_Clearing_Previous_data_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_EmailConfirmPassword"), "Enter Email confirm Password", ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_EmailConfirmPassword"));
		    ByID.SendKeys_After_Clearing_Previous_data_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_CompanyName"), "Enter Company name", ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_CompanyName"));
		    ByID.SendKeys_After_Clearing_Previous_data_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_Phone"), "Enter Phone", ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_Phone"));
		    ByID.Dropdown_Select_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_Select_SubscriptionPlan"), "Select Subcription Plan", ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_Select_SubscriptionPlan"));
		    ByID.Dropdown_Select_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_Select_DefaultCurrency"), "Select Default Currency", ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_Select_DefaultCurrency"));
		    ByID.SendKeys_After_Clearing_Previous_data_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_DomainName"), "Enter Domain name", ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_DomainName"));
			 
		    String txt1= ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_RegisterDomainName"), "");
		    String txt2= ByXpath.GetText_Using_Xpath(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("xpath_Subcriber_RegisterEmail"), "");
			Assert.assertTrue(txt1==ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_DomainName")&&txt2==ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_Email"));
		    System.out.println("Pass-new company or user created");
		}
		 catch (Exception e) {
				System.out.println(e);
		 }
	}
}
