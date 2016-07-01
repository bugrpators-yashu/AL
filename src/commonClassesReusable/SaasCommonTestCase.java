package commonClassesReusable;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SaasCommonTestCase extends BrowserSelection {

	
	public static void Login_Saas() throws InterruptedException, IOException {
		try {

			driver.get("http://toolsqa.com/selenium-webdriver/install-testng/");
			ByID.SendKeys_After_Clearing_Previous_data_Using_ID(
					ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Saas_txtbox_Username"),
					"Enter Saas Username",
					ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Saas_Username"));
			ByID.SendKeys_After_Clearing_Previous_data_Using_ID(
					ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Saas_txtbox_Password"),
					"Enter Saas Password",
					ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Saas_Password"));
			ByID.Click_Using_ID(
					ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Saas_Button_Login"),
					" Click on Login Button");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void Subscribes_Company_user() throws IOException, InterruptedException {
		try {
			ByLinkText.Click_Using_LinkText(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData(
					"linktext_SubscriberCompanyUser"), "click Subscriber Company/user ");
			ByID.Click_Using_ID(ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData(
					"id_Subcribe_Button_AddNewCompanyUser"), "click on Add new company");
			ByID.SendKeys_After_Clearing_Previous_data_Using_ID(
					ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_FirstName"),
					"Enter FirstNAme ", ReadDataFromPropertiesFile
							.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_FirstName"));
			ByID.SendKeys_After_Clearing_Previous_data_Using_ID(
					ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_LastName"),
					"Enter LastName", ReadDataFromPropertiesFile
							.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_LastName"));
			ByID.SendKeys_After_Clearing_Previous_data_Using_ID(
					ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_Email"),
					"Enter Email",
					ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_Email"));
			ByID.SendKeys_After_Clearing_Previous_data_Using_ID(
					ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData(
							"id_Subcriber_txtbox_EmailPassword"),
					"Enter Email Password",
					ReadDataFromPropertiesFile.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_Email"));
			ByID.SendKeys_After_Clearing_Previous_data_Using_ID(
					ReadDataFromPropertiesFile
							.testReadDataFromPropertiesFile_saasData("id_Subcriber_txtbox_EmailConfirmPassword"),
					"Enter Email confirm Password", ReadDataFromPropertiesFile
							.testReadDataFromPropertiesFile_saasData("value_Subcriber_txtbox_EmailConfirmPassword"));

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
