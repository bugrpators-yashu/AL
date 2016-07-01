package componentDefinition;

public interface ApexPropertiesModuleComponent {
	
	//General Accordian
	public String ID_PropertiesTab = "lnk0Properties";
	public String ID_AddNewProperty = "btnNewProperty";
	public String Xpath_GeneralTabVisibility = "//*[@id='openGeneralInfo'][@style='display: block; font-size: 13px;']";
	
	//Fill General Accordian
	public String ID_PropertyName = "PropertyName";
	public String ID_PropertyLegalName = "PropertyLegalName";
	public String ID_Zip = "Zip";
	public String ID_PropertyAddress1 = "PropertyAddress1";
	public String ID_PropertyType = "PropertyTypeID";
	public String ID_SaveAndNextGeneralAccordian = "btnAddContinueProperty";
	public String ID_SaveGeneralAccordian = "btnAddProperty";
	
	public String Xpath_PropertyType = "//*[@id='ui-id-1']//li//a[text()='";
	
	public String Value_PropertyName = "Property_Name";
	public String Value_Zip = "Zip";
	public String Value_Address1 = "Address1";
	
	//Fill Link Owners Accordian
	public String Xpath_LinkOwnersAccordianVisibily = "//*[@id='openLinkOwners'][@style='font-size: 13px; display: block;']";
	//public String Xpath_NetIncomeChecked = "//*[@value='Net Income'][@checked='checked']";
	public String Xpath_NetIncome = "//*[@value='Net Income']";
	public String Xpath_Flat = "//*[@value='Flat']";
	
	public String Class_NewOwnersTabVisibility = "tabs-outer";
	
	
	
	public String ID_CreateNewOwnerLink = "ancCreateNewOwner";
	public String ID_address1 = "address1";
	public String ID_txtEmail = "txtEmail_1";
	public String ID_SaveOwner = "btnSaveOwner";
	public String ID_OwnerLandlord = "Owner";
	public String ID_PercentOwned = "PercentOwned";
	public String ID_PlusIconLinkOwner = "imgAddOwner";
	public String ID_VendorPayer = "Vendor";
	public String ID_FiscalYear = "Fiscal";
	public String ID_CancelLinkOwner= "btnCancelPropertyOwner";
	public String ID_UpdateLinkOwner = "btnSavePropertyOwner";
	public String ID_SaveAndNextLinkOwner = "btnSavecontinuePropertyOwner";
	public String ID_PhoneNumber1 = "Number1";
	
	public String Value_First_Name = "First_Name";
	public String Value_Last_Name = "Last_Name";
	public String Value_Mobile = "Mobile";
	public String Value_Email_FirstPart = "Email_FirstPart";
	public String Value_Email_SecondPart= "Email_SecondPart";
	public String Value_PercentOwned = "PercentOwned";
	public String Value_VendorPayer = "VendorPayer";
	public String Value_FiscalYear_April = "FiscalYear_April";
	public String Value_Property_Name1 = "Property_Name1";
	
	//Bank Accounts
	
	public String Xpath_BankAccountsVisibility = "//*[@id='openLinkBankAccount'][@style='font-size: 13px; display: list-item;']";
	
	public String ID_BankAccountAccordian = "Tab3";
	public String ID_AccountNameDDL = "ddlAccountName1";
	public String ID_AccountTypeDDL = "ddlAccountType1";
	public String ID_BankName_= "txtBankName1";
	public String ID_BankRouting = "txtBankRouting1";
	public String ID_BankAccount = "txtBankAccount1";
	public String ID_DefaultSecurityDDL = "ddlSecurityAccount1";
	public String ID_ReserveAccount = "txtReserveAccount1";
	public String ID_DescriptionBankAccount = "txtBankDescription1";
	public String ID_CancelBankAccount = "btnCancelBankInfo";
	public String ID_SaveBankAccount = "btnSaveBankInfo";
	public String ID_SaveAndNextBankAccount = "btnSaveBankContinueInfo";
	
	public String Value_AccountType = "Account_Type";
	public String Value_BankName = "BankName";
	public String Value_BankAccount = "BankAccount";
	
	// Late Fee Management
	
	public String Xpath_LateFeeManagementAccordianVisibility = "//*[@id='openLinkLatefee'][@style='font-size: 13px; display: list-item;']";
	public String Xpath_OneTimeFlatFeechecked = "//*[@id='rdbOneTimeFlatFee'][@checked ='checked']";
	public String Xpath_ApplyDailyFlatFeechecked = "//*[@id='rdbDailyFlatFee'][@checked ='checked']";
	
	public String ID_LateFeeAccordian = "Tab4";
	public String ID_ApplyOneTimeCheckBox = "chkApplyOneTime";
	public String ID_ApplyDailyCheckBox = "chkApplyDaily";
	public String ID_OneTimeOutStdBal = "rdbOneTimeOutStdBalc";
	public String ID_OneTimeMonthlyRent = "rdbOneTimeMonthlyRent";
	public String ID_OneTimeFlatFee = "rdbOneTimeFlatFee";
	public String ID_DailyFlatFee = "rdbDailyFlatFee";
	public String ID_DailyOutStdBalc = "rdbDailyOutStdBalc";
	public String ID_DailyMonthlyRent = "rdbDailyMonthlyRent";
	
	
	public String ID_OneTimeFlatFeeTB = "txtOneTimeFlatFee";
	public String ID_OneTimeOutStdTB = "txtOneTimeOutStdBalc";
	public String ID_OneTimeMonthlyRentBal = "txtOneTimeMonthlyRent";
	public String ID_SaveLateFee = "btnSaveLateFee";
	public String ID_SaveAndNextLateFee = "btnSaveContinueLateFee";
	public String ID_CancelLateFee = "btnCancelLateFee";
	
	//Management Fee
	
	public String Xpath_ManagementFeesAccordianVisibility = "//*[@id='openLinkManagementfee'][@style='font-size: 13px; display: list-item;']";
	
}
