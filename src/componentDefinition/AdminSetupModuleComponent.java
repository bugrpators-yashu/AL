package componentDefinition;

public interface AdminSetupModuleComponent {
	
	public String ID_SetupTab = "lnk0Setup";
	public String Xpath_AccountType_SubTab = "//*[@class='clsRedirectMenu'][contains(.,'Account Type')]";
	public String Xpath_ChartOfAccount= "//*[@class='clsRedirectMenu'][contains(.,'Chart of Accounts')]";
	public String Xpath_ChargeCode = "//*[@class='clsRedirectMenu'][text()='Charge Code']";
	public String Xpath_ChargeCodePreferences = "//*[@class='clsRedirectMenu'][text()='Charge Code Preferences']";
	public String Xpath_TrashBin = "//*[@class='text'][contains(.,'Trash Bin')]";
	public String Xpath_TrashBin_ChargeCode = "//*[@class='open active']//ul//li//a[text()='Charge Code']";
	public String Xpath_AllocationOrder = "//*[@class='clsRedirectMenu'][text()='Allocation Order']";
	public String Xpath_ManageUserTab = "//*[@class='clsRedirectMenu'][contains(.,'Manage Users')]";
	public String Xpath_UserTab = "//*[@class='text'][contains(.,'Users')]";
	public String Xpath_TrashBin_ManageUsers = "//*[@class='open active']//a[text()='Manage Users']";
	public String Xpath_ManageUserRoles = "//*[@class='clsRedirectMenu'][contains(.,'Manage User Roles')]";
	public String Xpath_TrashBin_ManageUserRoles = "//*[@id='null']//a[text()='Manage User Roles']";
	public String Xpath_TrashBin_Category = "//*[@class='open active']//a[text()='Category']";
	public String Xpath_TrashBin_Priority = "//*[@class='open active']//a[text()='Priority']";
	public String Xpath_TrashBin_Severity = "//*[@id='null']//a[text()='Severity']";
	public String Xpath_TrashBin_EventTypes = "//*[@class='open active']//li//a[contains(.,'Event Types')]";
	
	public String Xpath_MaintenanceSubTab  = "//*[@class='text'][contains(.,'Maintenance')]";
	public String Xpath_Category_Maintenance = "//*[@id='maintenance']//li[contains(.,'Category')]";
	public String Xpath_Priority_Maintenance = "//*[@id='maintenance']//li[contains(.,'Priority')]";
	public String Xpath_Severity_Maintenance = "//*[@id='maintenance']//li[contains(.,'Severity')]";
	public String Xpath_Events = "//*[@class='text'][contains(.,'Events')]";
	public String Xpath_EventTypes = "//*[@id='Event']//li//a[contains(.,'Event Types')]";
	
	public String ID_GlobalSearch = "txtGlobalSearch";
	
	//public String Xpath_SearchIconInGrid="//*[@id='gbox_tblGrid']//td[@id='search_tblGrid']";
	
	
	// Accounting Tab Xpaths
			//Account Type
		public String Xpath_Accounting_Tab= "//*[@class='text'][contains(.,'Accounting')]";
		public String Xpath_SelectActionValue = "//*[@id='gbox_tblGrid']//tr[@id='1']//td[6]//Select";
		public String Xpath_EditChartOfAccountSection = "//*[@id='divFormChartOfAccount'][@style='display: block;']";
		
			//Chart Of Account xpath
		public String ID_AddChartOfAccount= "btnAddChartOfAccount";
		public String ID_AccountType_Dropdown = "AccountTypeID";
		public String ID_ChartAccountCode_TextField = "ChartAccountCode";
		public String ID_AccountName_TextField = "ChartAccountName";
		public String ID_ReportingCode_DropDown = "ReportingCodeID";
		public String ID_SubAccountOf_DropDown = "SubAccountTypeID";
		public String ID_Status_DropDown = "IsActive";
		public String ID_SaveButton_ChartOfAccount = "btnSaveChartOfAccounts";
		public String ID_Cancel= "btnCancel";
		public String ID_Grid = "gbox_tblGrid";
		public String ID_StatusFilter = "ddlStatusFilter";
		public String ID_FindIcon= "search_tblGrid";
		public String ID_FindIcon_ThirdTextField= "jqg1";
		public String ID_Find = "fbox_tblGrid_search";
		
		public String Class_CancelButton_Yes = "msgButton";
		public String Xpath_CancelButton_No = "//*[@class='msgButton inverse'][@value='No']";
		
		
		public String Xpath_AddNewChartOfAccountSection = "//*[@id='divFormChartOfAccount'][@style='display: none;']";
		public String Xpath_GetInactivateStatus = "//following-sibling::td[6][contains(.,'";
		public String Xpath_FindIcon_Cross = "//*[@id='searchhdfbox_tblGrid']/a/span";
		public String Xpath_GetText = "//*[@id='gbox_tblGrid']//td[contains(.,'";
	
		public String componentDefinition_GridValue_Xpath_1= "//*[@text()='jeet']";
	
		public String ClosingBracket = "')]";
		public String ClosingBracket2 = "]";
		public String ClosingBracket3 = "']";
								
		public String Xpath_ActionDropdown = "//following-sibling::td//Select";
		
		public String componentDefinition_ChartOfAccount_GetTextFromPopUp_Xpath= "html/body/div[20]/p/div/div/p";
	
	//	public String chartOfAccount_EditRecord_Xpath2 = "')]//following-sibling::td//select";
															
		
		
	// Property Type
		public String Value_PropertyType = "property_type";
		
		
		//Chart Of Account Data
		public String Value_Edit  = "Edit_Option";
		public String Value_AccountType= "Account_Type";
		public String Value_AccountCode= "Account_Code";
		public String Value_AccountName = "Account_Name";
		public String Value_Account_Name1 = "Account_Name1";
		public String Value_AccountCode1 = "Account_Code1";
		public String Value_AccountName1 = "Account_Name1";
		public String Value_ReportingCode = "Reporting_Code";
		public String Value_SubAccountOf = "Select";
		public String Value_Active = "Active";
		public String Value_Status_Deactivate = "Status_Deactivate";
		public String Value_Activate = "Activate";
		
		public String componentDefinition_GridValue_VisibleText= "Properties_AccountName";
		public String componentDefinition_ChartAccountName1_TextField_value = "Properties_AccountName1";
		
		
		// Charge Code Xpaths
		
		
		public String ID_AddChargeCode = "btnAddChargeCode";
		public String ID_CancelButton_ChargeCode = "btnCancelChargeCode";
		public String ID_ChargeCode = "ChargeCode";
		public String ID_Description = "Description";
		public String ID_CreditAccount = "CreditAccount";
		public String ID_Debit = "DebitAccount";
		public String ID_SaveChargeCode = "btnSaveChargeCode";
		public String ID_GridChargeCode = "tblGridChargeCode";
		
		public String Class_ChargeCode_AddChargeCodeSection = "form-outer";
		public String ChargeCode_ListOfChargeCode_Grid_ID="gbox_tblGridChargeCode";
		
		public String Xpath_HiddenAddChargeCodeSection = "//*[@id='divAddChargeCode'][@style='display: none;']";
		public String Xpath_GetText_ChargeCodeGrid = "//*[@id='gbox_tblGridChargeCode']//td[contains(.,'";
		public String Xpath_TrashBin_Restore = "//following-sibling::td//a";
		public String Xpath_EditChargeCodeSection = "//*[@id='divAddChargeCode'][@style='display: block;']";
		
		// Charge Code Data
		
		public String value_ChargeCodeData= "Properties_ChargeCode_Value";
		public String Value_ChargeCode = "Charge_Code";
		public String Value_ChargeCode2 = "Charge_Code2";
		public String Value_ChargeCodeDescription = "Charge_Code_Description";
		public String Value_ChargeCode1 = "Charge_Code1";
		public String Value_ChargeCodeDescription1 = "Charge_Code_Description1";
		public String Value_Delete = "Status_Delete";
		
		
		// Charge Code Preferences Xpaths
			
		public String ID_AddChargeCodePreferencesButton = "btnShowAddChargeCodePreference";
		
		public String Xpath_ChargeCodePreferencesSectiongetvisisbleOnClickingAddChargeCodePreferences = "//*[@id='formChargeCodePreference'][@style='display: none;']";
		
		public String ID_ChargeCodePreferences_PropertyRadioButton = "selectProperty";
		public String ID_ChargeCodePreferences_UnitRadioButton = "selectUnit";
		public String ID_ChargeCodePreferences_ChargeCodeDropdown = "chargeCodeForProperty";
		public String ID_ChargeCodePreferences_FrequencyDropdown = "frequencyForProperty";
		public String ID_ChargeCodePreferences_TypeDropdown = "typeForProperty";
		public String ID_ChargeCodePreferences_CancelButton = "btnResetChargeCodePreference";
		public String ID_ChargeCodePreferences_SaveButton = "btnSaveChargeCodePreference";
		public String ID_ChargeCodePreferences_Status = "ddlStatusChargeCodePreferenceSearch";
		
		public String Xpath_ChargeCodePreferencesGrid = "//*[@id='tblGridChargeCodePreference']";
		public String Xpath_UsingContains = "//td[contains(.,'";
		public String Xpath_UsingText = "//td[text()='";
		public String Xpath_ChargeCodePreferencesGrid_ApplicableColumn = "//*[@id='gview_tblGridChargeCodePreference']//td[";
		public String Xpath_UnitSection = "//*[@id='showUnitChargeCode'][@style='display: block;']";
		
		public String ID_ChargeCodePreferences_SelectChargeCodeForUnit = "chargeCodeForUnit";
		public String Class_ChargeCodePreferences_SelectUnitType = "ms-choice";
		public String ID_ChargeCodePreferences_FrequencyForUnit = "frequencyForUnit";
		
		public String Xpath_ChargeCodePreferences_SelectUnitType = "//*[@class='ms-drop bottom']//ul//bii";
		public String ID_ChargeCodePreferences_ApplicableToDropdown = "ddlChargeCodePreferenceApplicableStatus";
		public String ChargeCodePreferences_ApplicableToDropdown_SelectUnit_Value1 = "//option[@value='Unit']";
		public String ChargeCodePreferences_ApplicableToDropdown_SelectUnit_Value2 = "']";
		
		public String ChargeCodePreferences_Grid_VerifyUnitInGrid_VisibleText1 = "//parent::tr//td[3][contains(.,'";
		public String ChargeCodePreferences_Grid_VerifyUnitInGrid_VisibleText2 = "')]";
		public String ID_FrequencyDropdown_Filter = "ddlSearchFrequency";
		
		public String Grid_ChargeCodePreferences_Frequency = "//parent::tr/td[4]";
		public String Xpath_ChargeCodePreferences_Status_Filter = "//parent::tr//td[5]";
		
		
		// Charge Code Preferences Data
		public String Value_Frequency = "Frequency";
		public String Value_Type = "Type";
		public String Value_Applicable_Column = "Applicable_Column";
		public String Value_Frequency_Column = "Frequency_Column";
		public String Value_Status_Column = "Status_Column";
		public String ChargeCodePreferences_FrequencyDropdownValue_M = "FrequencyDropdownValue_M";
		public String ChargeCodePreferences_TypeDropdownValue_CPU = "TypeDropdownValue_CPU";
		public String Value_ApplicableToDropdown = "ApplicableTo";
		public String FrequencyDropdown_SelectOptionByValue= "FrequencyDropdown_VisibleText_Monthly";
		public String Value_Property = "Property";
		public String Value_Frequency_monthly = "Frequency_monthly";
		public String Value_Status_active = "Status_active";
		
		
		//Allocation Order
		
		public String Xpath_AllocationOrderTab = "//*[@id='accounting']/li[6]/a";
		
		public String ID_AllocationOrderGrid = "tblHeadsInGroup";
		public String ID_AllocationOrder_SaveButton = "btnSaveAllocationOrder";
		public String ID_AllocationOrder_CancelButton = "btnCancelAllocationOrder";
		
		//User Tab
		
		
		//Manage User
		
	
		public String Xpath_RoleType_Checklist = "//*[@class='ms-drop bottom']//bii[contains(.,'";
		public String Xpath_ManageUsersGrid = "//*[@id='tblGrid']";
		public String Xpath_TD_ManageUsersGrid = "//td[";
		public String Xpath_TD = "//td";
		public String Xpath_SelectAllRole = "//*[@class='ms-drop bottom']//bii//label";
		//public String XpathbyClass_RoleType_Checklist = "span//button[@class='ms-choice']";
		public String Xpath_Trashbin_ManageUserGrid = "//*[@id='gview_tblGridManageUser']";
		
		//public String Xpath_SelectRoleTypeChecklist1= "bii[contains(.,'"; 
	//	public String Xpath_SelectRoleTypeChecklist2 ="')]";
		//public String Xpath_SelectRoleTypeChecklist3 = "//preceding-sibling::input[@value='";
		//public String Xpath_SelectRoleTypeChecklist4 = "']";
		//public String Xpath_SelectRoleType_FindAllCheckBoxes = "//*[@id='divTop']//parent::bii//input[@type='checkbox']";
		
		public String Xpath_StatusDropdown = "//*[@id='ddlStatusFilter']";
		public String Xpath_DefaultStatus = "//option[@selected='selected']";
		
		public String Xpath_GridManageUsersListing_Status1 = "//following-sibling::tr//td[";
		public String Xpath_GridManageUsersListing_Status2 = "]";
		public String Xpath_SelectStatusInactiveFromDropdown = "//option[contains(.,'";
		public String ID_AddNewUser= "btnAddNewUser"; 
		public String ID_Email = "txtEmail";
		public String ID_ddlUser = "ddlUser";
		public String ID_Dropdown_Role = "ddlRole";
		public String ID_WorkPhone = "txtWorkPhone";
		public String ID_HomePhone = "txtHomePhone";
		public String ID_txtFax = "txtFax";
		
		public String Xpath_HiddenNewUserSection = "//*[@id='divAddUpdate'][@style='display: none;']";
		
		public String Xpath_Dropdown_Role_option ="//option[@value='";
		public String Xpath_NewUserSection = "//*[@id='divAddUpdate'][@style='display: block;']";
		//public String Xpath_NewUserSection = "//following-sibling::div[@class='form-outer']";
		public String ID_Status_NewUser = "ddlStatus";
		public String Xpath_TableData_ActionDropdown_UserListingGrid ="//select";
		public String Xpath_GetTextUsingFollowingSibling_ManageUserGrid = "//following-sibling::td[contains(.,'";
		public String Xpath_GetTextUsingPrecedingSibling_ManageUserGrid = "//preceding-sibling::td[contains(.,'";
		public String Xpath_tableData3 = "//parent::tr//td[";
		
		public String ID_Save_ManageUser = "btnAddUser";
		public String Xpath_Data = "//following-sibling::td[";
		public String Xpath_Data2 = "[contains(.,'";
		
		
	
		//Manage User Data
		public String Value_Manager = "Manager";
		public String Value_RoleType_manager = "RoleType_manager";
		public String Value_RoleColumn = "RoleColumn";
		public String Value_StatusColumn = "StatusColumn";
		public String Value_FirstName = "First_Name";
		public String Value_Edit_First_Name = "Edit_First_Name";
		public String Value_LastName = "Last_Name";
		public String Value_WorkPhone = "Work_Phone";
		public String Value_HomePhone = "Home_Phone";
		public String Value_Fax = "Fax";
		public String Value_Attribute_value = "Attribute_value";
		
		public String RoleTypeChecklist_Manager_CheckboxValue = "RoleType_Manager_CheckboxValue";
		public String Value_PropertyManager = "Property_Manager";
		public String Value_RoleType_propertymanager = "RoleType_propertymanager";
		
		public String RoleTypeChecklist_PropertyManager_CheckboxValue = "RoleType_PropertyManager_CheckboxValue";
		public String Status_ManageUsersListingGrid = "Status_ManageUserListing";
		//public String Status_active1 = "Status_active";
		public String Value_InActive = "InActive";
		public String Value_Status_inactive = "Status_inactive";
		
		public String Style_NewUserSection ="Style_NewUserForm";
		public String Action_DeActivate = "DeActivate";
		public String TDNumber_ActionColumn= "ActionColumn_UserListingGrid";
		//public String Name_UserListingGrid = "Name_UserListingGrid";
		public String Value_Email = "Email";
		public String Action_Edit = "Edit";
		public String UserListingGrid_tableData = "Td_UserListingGrid";

		public String Xpath_getTextFromPopup = "//*[@class='toast-container toast-position-middle-center']//following-sibling::p";
		
		// Manager User Role Xpaths
	
		public String ID_AddRoleButton = "btnAddRoles";
		public String ID_RoleName = "RoleName";
		public String ID_SaveUserRole = "btnSaveUserRole";
		
		public String Xpath_Accordian = "//*[@class='accordian']//h2[text()='";
		public String Xpath_Accordian_Checkbox = "//*[@id='body-1']//td//label[text()='";
		public String Xpath_ManageUserGrid = "//*[@id='tblUserGrid']";
		public String Xpath_TrashBin_ManageUserGrid = "//*[@id='gview_tblUserGrid']";
		public String Xpath_SetupAccordian="//*[@id='divMainBody']/div[1]/div[2]/form/div/div[2]/div[2]/ul[1]/li[1]";
		
		public String Xpath_CompareRoleWith = "//*[@class='check-outer comaprerole']//div//label";
		public String Xpath_Setup_SubTab = "//*[@class='text'][text()='";
		
		
		//Maintenance
		//public String Xpath_Setup_Maintenance_CategorySubTab = "//a[Text()='Category']";
		public String ID_AddCategory = "btnAddCategory";
		public String ID_ddlCategoryStatusFilter = "ddlCategoryStatusFilter";
		public String ID_SaveCategory = "btnSaveCategory";
		public String Xpath_AddCategorySection = "//*[@class='addCategory'][@style='display: none;']";
		public String Xpath_CategoryGrid = "//*[@id='gbox_tblGrid']";
		public String Xpath_Trashbin_CategoryGrid = "//*[@id='gview_tblGridCategory']";
		
		public String Xpath_ErrorMsg1 = "//*[@class='form-data-lt']//div[@class='errorMsg']";
		public String Xpath_ErrorMsg2 = "//*[@class='form-data-rt']//div[@class='errorMsg']";
		public String ID_MaintenanceCategory ="MaintenanceCategoryName";
		public String ID_Description_Category = "MaintenanceCategoryDescription";
		public String ID_Cancel_MaintenanceCategory = "btnResetCategory";
		
		
		public String ID_AddPriority = "btnAddPriority";
		public String ID_PriorityStatusFilter = "ddlPriorityStatusFilter";
		public String ID_Maintenance_PriorityName = "MaintenancePriorityName";
		public String ID_Maintenance_PriorityDescription = "MaintenancePriorityDescription";
		public String ID_Cancel_Priority = "btnResetPriority";
		public String ID_Save_Priority = "btnSavePriority";
		
		public String Xpath_HiddenAddPrioritySection = "//*[@class='addPriority'][@style='display: none;']";
		public String Xpath_AddPrioritySection = "//*[@class='addPriority'][@style='display: block;']";
		//public String Xpath_PriorityPopup = "//*[@class='toast-container toast-position-middle-center']//p//div//div//p";
		public String Xpath_TrashBin_PriorityGrid = "//*[@id='gview_tblGridPriority']";
		
		public String  Value_Priority = "Priority";
		public String  Value_Edit_Priority = "Edit_Priority";
		public String  Value_PriorityDescription = "Priority_Description";
		
		
		public String Value_Category = "Category";
		public String Value_Edit_Category = "Edit_Category";
		public String Value_Category_small = "Category_small";
		public String Value_CategoryDescription = "Category_Description";
		
		
		//public String Maintenance_Subtab_Severity = "SetUp_Maintenance_Severity";
	//	public String Maintenance_Subtab_Category = "SetUp_Maintenance_Category";
		
		
		public String ID_AddSeverity = "btnMaintenanceSeverity";
		public String ID_SeverityName = "MaintenanceSeverityName";
		public String ID_SeverityDescription = "MaintenanceDescription";
		public String ID_SaveSeverity = "btnSaveMaintenanceSeverity";
		
		public String Xpath_AddSeveritySection = "//*[@id='divFormMaintenanceSeverity'][@style='display: block;']";
		public String Xpath_HiddenAddSeveritySection = "//*[@id='divFormMaintenanceSeverity'][@style='display: none;']";
		public String Xpath_Trashbin_SeverityGrid = "//*[@id='gview_tblGridSeverity']";
		
		public String Value_Severity = "Severity";
		public String Value_SeverityDescription = "Severity_Description";
		
		public String ID_AddEventTypes = "btnAddNewEventType";
		public String ID_EventType = "EventType";
		public String ID_EventDescription = "EventDescription";
		public String ID_SaveEventType = "btnAddEventType";
		
		public String Xpath_Trashbin_EventTypesGrid = "//*[@id='gview_tblGridEventTypes']";
		
		
		public String Value_EventType = "Event_Type";
		public String Value_EventDescription = "Event_Type_Description";
}


