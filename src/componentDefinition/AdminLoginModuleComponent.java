package componentDefinition;

public interface AdminLoginModuleComponent {

	
	//Apexlink Admin Login Xpath
	public String componentDefinition_apex_adminLogin_Username_Id = "txtUsername";
	public String componentDefinition_apex_adminLogin_Password_Id = "txtPassword";
	public String componentDefinition_apex_adminLogin_LoginButton= "btnLogin";
	
	//Apexlink Valid Admin Login Data
		public String apexadminURlLink="ApexAdminURL";
		public String componentDefinition_apex_adminLogin_Username_value ="Properties_adminUsername";
		public String componentDefinition_apex_adminLogin_Password_value ="Properties_adminPassword";

	// Apexlink Deactivated Admin Login Data
		public String apex_adminLogin_Deactivated_Username_value ="Deactivated_AdminUsername";
		public String apex_adminLogin_Deactivated_Password_value ="Deactivated_AdminPassword";
		
	
		//Admin Logout Xpath
				public String componentDefinition_apex_adminLogout_Xpath= "//*[@id='btnLogOut']";
}
