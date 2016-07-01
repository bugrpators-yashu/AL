package componentDefinition;

public interface ReportSummaryModuleComponents {
	
	public String id_ReportsSettings_link="btnReportsSettings";
	public String id_AddReports_link="aAddReport";
	public String id_ReportTitle_field="txtReportTitle";
	public String id_Report_ModuleDDl="ddlRightReportModules";
	public String id_Report_TypeDDL="ddlReportType";
	public String id_AccessTab_selectedCompanies_radioButton="rdSelectedCompany";
	public String id_searchCompanies_field="txtAcessReportKeywordSearch";
	public String id_company_searchButton="btnAcessReportKeywordSearch";
	public String xpath_accessTab_companyCheckBox="//*[@id='tbodyAccessReport']/tr[1]/td[2]/input";
	public String id_AccessTab_applyButton="btnAccessApply";
	
	public String id_AccessTab_saveButton="btnReportTabSave";
	public String id_reportFilesTab="aReportsFiles";
	public String id_reportFilesTab_AddFile_link="ancAddReport";
	public String id_reportFilesTab_BrowseButton="dynamicFilePhotos";
	public String id_title_field="dynamictitle";
	public String id_primaryCheckbox="dynamiccheckbox";
	public String xpath_reportFilesTab_saveIcon="//*[@id='dynamicrow']/td[1]/a[1]/img";
	public String id_report_keyword_searchField="txtReportKeywordSearch";
	public String id_report_keyword_searchButon="btnMainReportSearch";
	public String xpath_reportTitle_textCheck="//*[@id='tblMainReportGrid']/tr[1]/td[2]";
	public String xpath_reports_CrossIcon="//*[@id='divReportsSettings']/div/div/div[1]/h2/a/img";
	
	public String id_TopSettingsDDl="aSettings";
	public String xpath_company_DDl="//*[@id='ulCompaniesListInRgtDiv']/li[6]";
	public String id_CC_editSettingsLink="btnEditCommandCenterType";
	public String id_editSettings_report_tab="aCommandCenterSystemSettingsReports";
	public String id_CC_reportsTab_keywordSearch_field="txtCommandCenterReportName";
	public String id_ReportsTab_keywordSearch_button="aCommandCenterReportSearch";
	public String xpath_CC_reportTitle_TextCheck="//*[@id='tbodyCommandCenterEditSettingReport']/tr/td[4]";
	public String xpath_CC_reportTab_reportEditIcon="//*[@id='tbodyCommandCenterEditSettingReport']/tr/td[3]/a/img";
	public String id_CC_ccKeyword_search_field="txtCommandCenterReport";
	public String id_CC_ccKeyword_SearchButton="btnCommandCenterReport";
	public String xpath_CC_checkBox="//*[@id='tbodyCommandCenterReport']/tr/td[2]/input";
	public String id_CC_Access_ApplyButton="btnCommandCenterReportApply";
	public String id_CC_Access_SaveButton="btnCommandCenterEditSettingReportSave";
	public String id_CC_crossIcon="imgCommandCenterSettingTab";
	
	//ORG Chart module report
	public String id_OrgChart_editSettingLink="btnEditOrganisationGroup";
	public String id__org_ReportsTab="aOrganizationalReport";
	public String id_ORG_SearchKeywordField="txtGroupReportName";
	public String id_Org_keywordSearchButton="aGroupReportSearch";
	public String xpath_org_Searchedreport_textCheck="//*[@id='tbodyGroupReports']/tr/td[4]";
	public String xpath_org_reportEditIcon="//*[@id='tbodyGroupReports']/tr/td[3]/a/img";
	public String id_org_SearchGroupField="txtGroupSearch";
	public String id_Org_group_searchButton="btnGroupSearch";
	public String xpath_Org_group_checkBox="//*[@id='tbodyAllGroups']/tr/td[2]/input";
	public String id_OrgAccess_ApplyButton="btnGroupReportingApply";
	public String id_OrgAccess_saveButton="btnOrganizationalChartEditSettingReportSave";
	public String xpath_Org_CrossIcon="//*[@id='edit_settings']/div/div/div[1]/h2/a/img";
	
	//Org ->Role report module
	
	public String id_orgChart_keywordSearchField="txtOrganisationKeyword";
	public String id_orgChart_grpStructureDDl="ddlOrganisationGroupStructure";
	public String id_orgChartSummary_searchButton="btnOrganisationSearch";
	public String xpath_org_ChartSummary_group="//*[@id='tbodyOrganizationalSummary']/tr/td[2]/a";
	public String id_org_reportsTab="aOrganizationalRoleReport";
	public String id_ORG_keywordSearchField="txtRoleReportingName";
	public String id_Org_keyword_SearchButton="aRoleSearch";
	public String xpath_Org_groupReport_TextCheck="//*[@id='tbodyRolesReport']/tr/td[4]";
	public String xpath_grpProfile_ReportEditIcon="//*[@id='tbodyRolesReport']/tr/td[3]/a/img";
	public String id_GrpRoleSearch_field="txtReportingRolesName";
	public String id_roleSearchButton="aReportingRolesNameSearch";
	public String xpath_GrpProfile_role_checkBox="//*[@id='tbodyReportingRole']/tr/td[2]/input";
	public String id_grpProfile_ApplyButton="btnReportingRoleApply";
	public String id_grpProfile_SaveButton="btnRoleReportingSave";
	public String xpath_grpProfile_crossIcon="//*[@id='asd']/img";
	
	//Report Summary module
	
	public String id_ReportSummary_keywordSearchField="txtReportingKeyword";
	public String id_reportModuleDDl="ddlReportingModule";
	public String xpath_reportSummary_reportTextCheck="//*[@id='tbodyReportingSummary']/tr[1]/td[1]";
	public String id_reportSummary_searchButton="ancReportSearch";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

	
	
	//Variables and Data for Reporting Summary tab
	
	
	public static String reportTitleField="Enter_Report_Title";
	public static String ModuleDDL="Select_module";
	public static String browserReportFile= "Browse_Report_File";
	public static String formTitleField="Enter_Form_title";
}
