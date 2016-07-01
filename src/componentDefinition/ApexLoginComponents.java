package componentDefinition;

public interface ApexLoginComponents {
	
	//Xpaths for Login in Apexlink website (www.apexlink.seasiaconsulting.com)
	
	public String id_apex_username_field= "txtUsername";
	public String id_apex_password_field="txtPassword";
	public String id_login_button="btnLogin";
	public String id_Login_RememberMe="remember";
	public String xpath_Logout="//*[@id='btnLogOut']";
	
	//Variables and data for apex admin login screen
	
	public static String apex_login_username="UName1";
	public static String apex_login_password="PWord1";
	public static String apexURL="URL";

}

