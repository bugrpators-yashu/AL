package componentDefinition;

public interface ProjectMissionModuleComponents {
	
	public static String id_project_tab="62d6db8f-05e8-47c6-bb68-47d72041cd97";
	public static String id_editSettingLink="editSettings";
	
	
		
		public String xpath_Program_tab = "//*[@id='wrap']/div/div/ul/li[2]";
		public String xpath_Program_Project_tab = "//*[@id='wrap']/div/div/ul/li[2]/ul/li[2]";
		public String id_MissionTab="75adfb4b-cb7e-4263-8503-ccbfab9b6ba4";
		//public String xpath_Program_Mission_tab = "//*[@id='wrap']/div/div/ul/li[2]/ul/li[5]";
		public String id_program_projectTab="62d6db8f-05e8-47c6-bb68-47d72041cd97";
		
		//Xpath for Project >> Edit Settings
		
		public String id_ProjectMission_Project_EditSettings_link = "editSettings";
		public String id_ProjectMission_Project_EditSettings_AddProjectTypelink = "Addnewprojecttype";
		public String id_ProjectMission_Project_EditSettings_AddProjectType_ProjectType_textbox = "txtprojecttype";
		public String id_ProjectMission_Project_EditSettings_AddProjectType_SystemType_ddl = "ddlsystemtype";
		public String id_ProjectMission_Project_EditSettings_AddProjectType_Process_ddl = "ddlprocess";
		public String id_ProjectMission_EditSettings_SupportingMissionCheckbox = "chkSupportingMissions";
		public String id_ProjectMission_Project_EditSettings_AddProjectType_Save_button = "btnsaveprojecttype";
		public String xpath_ProjectMission_Project_EditSettings_Close_button = "//*[@id='edit_settings']/div/div/div[1]/h2/a/img";
		
		
		//Xpath for Project >> Add Project
		
		public String id_ProjectMission_Project_AddProject_link = "aOpenAddProject";
		public String xpath_ProjectMission_Project_AddProject_Close_button = "//*[@id='closeMainProject']/img";
		
		
		//Xpath for Project >> Add Project >> General Tab
		
		public String id_ProjectMission_Project_AddProject_General_Name_textbox = "txtProjectName";
		public String id_ProjectMission_Project_AddProject_General_OrganisationalUnit_ddl = "ddlOrganizationalUnit";
		public String id_ProjectMission_Project_AddProject_General_Program_ddl = "ddlProjectProgram";
		public String id_ProjectMission_Project_AddProject_General_Type_ddl = "ddlSelectProgramType";
		
		
		
		
		public String id_ProjectMission_Project_AddProject_General_StartDate_textbox = "txtStartDate";
		public String xpath_ProjectMission_Project_AddProject_General_StartDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
		public String xpath_ProjectMission_Project_AddProject_General_StartDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
		
		public String id_ProjectMission_Project_AddProject_General_StartTime_textbox = "txtStartTime";
		public String xpath_ProjectMission_Project_AddProject_General_StartTime_Now_button = "//*[@id='ui-datepicker-div']/div[3]/button[1]";
		public String xpath_ProjectMission_Project_AddProject_General_StartTime_Done_button = "//*[@id='ui-datepicker-div']/div[3]/button[2]";
		
		public String id_ProjectMission_Project_AddProject_General_EndDate_textbox = "txtEndDate";
		public String xpath_ProjectMission_Project_AddProject_General_EndDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
		public String xpath_ProjectMission_Project_AddProject_General_EndDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
		
		public String id_ProjectMission_Project_AddProject_General_EndTime_textbox = "txtEndTime";
		public String xpath_ProjectMission_Project_AddProject_General_EndTime_Hour = "//*[@id='ui-timepicker-div-txtEndTime']/dl/dd[2]/div[2]/table/tbody/tr/td[6]";
		public String xpath_ProjectMission_Project_AddProject_General_EndTime_Minute = "//*[@id='ui-timepicker-div-txtEndTime']/dl/dd[3]/div[2]/table/tbody/tr/td[6]";
		public String xpath_ProjectMission_Project_AddProject_General_EndTime_Done_button = "//*[@id='ui-datepicker-div']/div[3]/button[2]";
		
		public String id_ProjectMission_Project_AddProject_General_Save_button = "hrefAddUpdateProject";
		
		public String id_ProjectMission_Project_AddProject_General_AddContact_link = "hrefAddNewProjectContact";
		public String id_ProjectMission_Project_AddProject_General_AddContact_ContactSearch_textbox = "txtSearchContact";
		public String id_ProjectMission_Project_AddProject_General_AddContact_ContactSearch_button = "btnSearchContact";
		public String xpath_ProjectMission_Project_AddProject_General_AddContact_ContactSearch_Select_button = "//*[@id='tblContactSearch']/tbody/tr/td[8]/a";
		public String id_ProjectMission_Project_AddProject_General_AddContact_RoleType_ddl = "ddlRoleTypeProjGeneral";
		public String xpath_ProjectMission_Project_AddProject_General_AddContact_Save_button = "//*[@id='ancSaveProGenContact']/img";
		
		public String id_ProjectMission_Project_AddProject_General_AddLocation_link = "hrefAddNewProjectlocation";
		public String id_ProjectMission_Project_AddProject_General_AddLocation_LocationSearch_textbox = "txtSearchModel";
		public String id_ProjectMission_Project_AddProject_General_AddLocation_LocationSearch_button = "btnSearchModel";
		public String xpath_ProjectMission_Project_AddProject_General_AddLocation_LocationSearch_Select_button = "//*[@id='tblLocationModel']/tbody/tr/td[2]/a";
		public String id_ProjectMission_Project_AddProject_General_AddLocation_Stage_ddl = "ddlProjGeneralstage";
		public String xpath_ProjectMission_Project_AddProject_General_AddLocation_Save_button = "//*[@id='ancSaveProGenLocation']/img";
		
		
		//Xpath for Project >> Add Project >> Activity Log Tab
		
		public String id_ProjectMission_Project_AddProject_ActivityLog_tab = "tabProjectActivityLog";
		public String id_ProjectMission_Project_AddProject_ActivityLog_Submit_button = "aUpdatedStatusActivityLog";
		public String xpath_ProjectMission_Project_AddProject_ActivityLog_NextStatus_radiobutton = "//*[@id='divNextStatus']/p/span/input";
		public String id_ProjectMission_Project_AddProject_ActivityLog_NextStatus_Submit_button = "btnProcurementActivityLogStatus";
		
		
		//Xpath for Project >> Add Project >> Projects Tab
		
		public String id_ProjectMission_Project_AddProject_Projects_tab = "tabProjectProfile";
		public String id_ProjectMission_Project_AddProject_Projects_AddSupportingProject_link = "addnewaddprojectprofile";
		
		
		
		//Define Project >> Edit Settings Variables
		
		public String ProjectMissionProjectEditSettingsAddProjectTypeProjectType = "ProjectMissionEditSettingsProjectType";
		
		
		//Define Project >> Add Project Variables
		
		public String ProjectMissionProjectAddProjectGeneralName = "ProjectMissionAddProjectGeneralName";
		
		
		
		//Xpath for Mission >> Edit Settings
		
		public String id_ProjectMission_Mission_EditSettings_link = "editSettings";
		public String id_ProjectMission_Mission_EditSettings_AddMissionTypelink = "Addnewprojecttype";
		public String id_ProjectMission_Mission_EditSettings_AddMissionType_MissionType_textbox = "txtprojecttype";
		public String id_ProjectMission_Mission_EditSettings_AddMissionType_SystemType_ddl = "ddlsystemtype";
		public String id_ProjectMission_Mission_EditSettings_AddMissionType_Process_ddl = "ddlprocess";
		public String id_ProjectMission_Mission_EditSettings_AddMissionType_Save_button = "btnsaveprojecttype";
		public String xpath_ProjectMission_Mission_EditSettings_Close_button = "//*[@id='edit_settings']/div/div/div[1]/h2/a/img";
			
		
		//Xpath for Mission >> Add Mission
		
		public String id_ProjectMission_Mission_AddMission_link = "aOpenAddProject";
		public String xpath_ProjectMission_Mission_AddMission_Close_button = "//*[@id='closeMainProject']/img";
		
		
		//Xpath for Mission >> Add Mission >> General Tab
		
		public String id_ProjectMission_Mission_AddMission_General_Name_textbox = "txtProjectName";
		public String id_ProjectMission_Mission_AddMission_General_OrganisationalUnit_ddl = "ddlOrganizationalUnit";
		public String id_ProjectMission_Mission_AddMission_General_Program_ddl = "ddlProjectProgram";
		public String id_ProjectMission_Mission_AddMission_General_Type_ddl = "ddlSelectProgramType";
			
		public String id_ProjectMission_Mission_AddMission_General_StartDate_textbox = "txtStartDate";
		public String xpath_ProjectMission_Mission_AddMission_General_StartDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
		public String xpath_ProjectMission_Mission_AddMission_General_StartDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
			
		public String id_ProjectMission_Mission_AddMission_General_StartTime_textbox = "txtStartTime";
		public String xpath_ProjectMission_Mission_AddMission_General_StartTime_Now_button = "//*[@id='ui-datepicker-div']/div[3]/button[1]";
		public String xpath_ProjectMission_Mission_AddMission_General_StartTime_Done_button = "//*[@id='ui-datepicker-div']/div[3]/button[2]";
			
		public String id_ProjectMission_Mission_AddMission_General_EndDate_textbox = "txtEndDate";
		public String xpath_ProjectMission_Mission_AddMission_General_EndDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
		public String xpath_ProjectMission_Mission_AddMission_General_EndDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
			
		public String id_ProjectMission_Mission_AddMission_General_EndTime_textbox = "txtEndTime";
		public String xpath_ProjectMission_Mission_AddMission_General_EndTime_Hour = "//*[@id='ui-timepicker-div-txtEndTime']/dl/dd[2]/div[2]/table/tbody/tr/td[6]";
		public String xpath_ProjectMission_Mission_AddMission_General_EndTime_Minute = "//*[@id='ui-timepicker-div-txtEndTime']/dl/dd[3]/div[2]/table/tbody/tr/td[6]";
		public String xpath_ProjectMission_Mission_AddMission_General_EndTime_Done_button = "//*[@id='ui-datepicker-div']/div[3]/button[2]";
			
		public String id_ProjectMission_Mission_AddMission_General_Save_button = "hrefAddUpdateProject";
			
		public String id_ProjectMission_Mission_AddMission_General_AddContact_link = "hrefAddNewProjectContact";
		public String id_ProjectMission_Mission_AddMission_General_AddContact_ContactSearch_textbox = "txtSearchContact";
		public String id_ProjectMission_Mission_AddMission_General_AddContact_ContactSearch_button = "btnSearchContact";
		public String xpath_ProjectMission_Mission_AddMission_General_AddContact_ContactSearch_Select_button = "//*[@id='tblContactSearch']/tbody/tr/td[8]/a";
		public String id_ProjectMission_Mission_AddMission_General_AddContact_RoleType_ddl = "ddlRoleTypeProjGeneral";
		public String xpath_ProjectMission_Mission_AddMission_General_AddContact_Save_button = "//*[@id='ancSaveProGenContact']/img";
		
		public String id_ProjectMission_Mission_AddMission_General_AddLocation_link = "hrefAddNewProjectlocation";
		public String id_ProjectMission_Mission_AddMission_General_AddLocation_LocationSearch_textbox = "txtSearchModel";
		public String id_ProjectMission_Mission_AddMission_General_AddLocation_LocationSearch_button = "btnSearchModel";
		public String xpath_ProjectMission_Mission_AddMission_General_AddLocation_LocationSearch_Select_button = "//*[@id='tblLocationModel']/tbody/tr/td[2]/a";
		public String id_ProjectMission_Mission_AddMission_General_AddLocation_Stage_ddl = "ddlProjGeneralstage";
		public String xpath_ProjectMission_Mission_AddMission_General_AddLocation_Save_button = "//*[@id='ancSaveProGenLocation']/img";
		
		
		//Xpath for Mission >> Add Mission >> Activity Log Tab
		
		public String id_ProjectMission_Mission_AddMission_ActivityLog_tab = "tabProjectActivityLog";
		public String id_ProjectMission_Mission_AddMission_ActivityLog_Submit_button = "aUpdatedStatusActivityLog";
		public String xpath_ProjectMission_Mission_AddMission_ActivityLog_NextStatus_radiobutton = "//*[@id='divNextStatus']/p/span/input";
		public String id_ProjectMission_Mission_AddMission_ActivityLog_NextStatus_Submit_button = "btnProcurementActivityLogStatus";
		
		
		//Xpath for Mission >> Add Mission >> Supporting Mission Tab
		
		public String id_ProjectMission_Mission_AddMission_SupportingMission_tab = "tabProjectProfile";
		public String id_ProjectMission_Mission_AddMission_SupportingMission_AddSupportingMission_link = "addnewaddprojectprofile";
			
			
		
		
		
		//Define Mission >> Edit Settings Variables
		
		public String ProjectMissionMissionEditSettingsAddMissionTypeMissionType = "ProjectMissionEditSettingsMissionType";
			
			
		//Define Mission >> Add Mission Variables
			
		public String ProjectMissionMissionAddMissionGeneralName = "ProjectMissionAddMissionGeneralName";
		public String ProjectMissionMissionAddSupportingMissionGeneralName = "Enter_SupportingMission_name";
		
	}



