package componentDefinition;

public interface ApexCompanySetupComponents {
	
	//Xpaths for Company Setup page
	
	public String xpath_apex_CompanySetup_Tab= ".//*[@id='ulLeftMenu']/li/ul/li[1]/a/span[3]";
	public String classname_apex_AccountSetup_Subtab= "clsRedirectMenu";
	public String id_apex_CompanyName= "txtCompanyName";
	public String id_apex_CompanyWebsite= "txtWebsite";
	public String id_apex_FirstName="txtFirstName";
	public String id_apex_LastName="txtLastName";
	public String id_apex_CompanyPhoto="flPhoto";
	public String id_apex_Zipcode="txtZip";
	public String id_apex_Address1="txtAddress";
	public String id_apex_Address2="txtAddress2";
	public String id_apex_TaxId="txtTaxID";
	public String id_apex_TaxPayerName="txtTaxPayerName";
	public String id_apex_AccountAdminName="txtAccountAdminName";
	public String id_apex_AccountAdminEmailAddress="txtEmail";
	public String id_apex_1099TransmissionControlcode="txtTransmissionControlcode";
	public String id_apex_ContactName1099="txtContactNamefor1099";
	public String id_apex_ApplicationFees="txtApplicationFees";
	public String id_apex_RentAmount="txtRentAmount";
	public String id_apex_DepositeAccount="txtDepositeAccount";
	public String id_apex_Currency="ddlCurrency";
	public String id_apex_Savebutton="btnSave";
	public String id_apex_CancelButton="btnCancelCompany";
	
	
	//Variables and data for CompanySetup
	
	public static String apex_Correct_CompanyName="AlphaNum1";
	public static String apex_Correct_Website="Email1";
	public static String apex_Correct_FName="FName1";
	public static String apex_Correct_LName="LName1";
	public static String apex_Correct_ZipCode="Zip3";
	public static String apex_Correct_Address1="AddressI1";
	public static String apex_Correct_Address2="AddressII2";
	public static String apex_Correct_TaxId="Num1";
	public static String apex_Correct_TaxPayerName="FName1";
	public static String apex_Correct_AccountAdminName="FName1";
	public static String apex_Correct_AccountAdminEmail="Email1";
	public static String apex_Correct_1099ControlCode="Num1";
	public static String apex_Correct_ContactName1099="FName1";
	public static String apex_Correct_ApplicationFees="Num1";
	public static String apex_Correct_RentAmount="Num1";
	public static String apex_Correct_DepositeAccount="Num1";

}
