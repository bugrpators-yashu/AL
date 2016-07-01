package componentDefinition;

public interface SupplierModuleComponents {
	
	//Xpaths for supplier module
	
	public String id_procurement_tab="af49d677-801e-4b12-ac39-96b46d1ade32";
	
	public String id_procurement_headertest_check="spnProcurementPlanSummary";
	public String xpath_supplier_tab="//*[@id='2a0e4e7e-4b48-4a69-9013-5bd55c4c8073']";
			
			//"//*[@id='wrap']/div/div/ul/li[5]/ul/li[5]/a[@id='2a0e4e7e-4b48-4a69-9013-5bd55c4c8073']";
	public String id_AddSupplier_link="btnAddSupplier";
	public String xpath_supplier_headertest_check="//*[@id='divSupplierSummary']/div[1]/h2/table/tbody/tr/td[1]/span";
	
	public String id_Supplier_name_field="txtSupplierNameGeneral";
	public String id_supplierCode_field="txtSupplierCodeGeneral";
	public String id_supplierType_DDL="ddlSupplierTypeGeneral";
	public String id_supplierStatus_DDL="ddlStatusGeneral";
	
	public String id_supplierCurrency_DDl="ddlCurrencyGeneral";
	public String id_supplierCarrier_checkbox="chkCarrier";
	public String id_supplier_save_button="btnSaveGeneral";
	
	
	public String id_supplierCode="txtSupplierCodeGeneral";
	public String id_supplierUpdateButton="btnSaveGeneral";
	
	
	public String xpath_supplieritemCrossIcon="//*[@id='btnCrossSupplier']/img";
	public String xpath_supplierCrossIcon="//*[@id='add_supplier']/div/div/div[1]/h2/a/img";
	
	
	//Xpaths for LOCATION TAB
	
	public String id_supplier_location_Tab="aSupplierLocationsTab";
	public String id_supplier_AddSupplierLocation_link="ancAddSupplierLocation";
	public String id_supplier_locationSearch_field ="txtSearchModel";
	
	public String id_searchButton="btnSearchModel";
	public String xpath_supplier_selectlocationLink ="//*[@id='tblLocationModel']/tbody/tr[1]/td[2]/a";
	
	//Xpaths for CONTACT TAB
	
	public String id_contactTab="aSupplierContactsTab";
	public String id_addContactLink="ancAddContactSupplierContact";
	public String id_contactSearchField="txtSearchContact";
	public String id_contactSearchButton="btnSearchContact";
	public String xpath_contactSearchButton="//*[@id='tblContactSearch']/tbody/tr/td[8]/a";
	
	//Xpath for Pricing tab
	
	public String id_pricingTab = "aSupplierCatalogsTab";
	public String id_AddPricingLink = "btnAddSupplierContract";
	public String id_primaryContactDDL = "ddlPrimaryContact";
	public String xpath_pricingSaveButton = "//*[@id='btnSaveRfxGeneralSupplier1']/img";
	
	
	
	//Xpath for Item tab
	
	
	
	public String id_supplierSummary_keywordSearchField="txtKeywordSearchSupplier";
	public String id_supplierSummary_typeDDL="ddlSupplierTypeSummary";
	public String id_supplierStatusSumamryDDl="ddlSupplierStatusSummary";
	public String id_supplierSearchButton="btnSearchSupplier";
	
	
	
	
	
	
	
	
	public String id_item_tab="anchorItemSupplier";
	public String id_AddItemLink="spnProcurementRfxSuppliersItemsAddItem";
	public String id_ItemTab_resourceCategory_DDL="ddlContractResourceCategory";
	public String id_Search_button="btnSearchResourceType";
	public String xpath_pricing_ItemTab_itemCheckbox="//*[@id='tblExistingProfile']/tr[1]/td[1]/input";
	public String id_SelectresourceTypeDDL="ddlContractResourceType";
	public String id_resourceTypeUnitDDl="ddlUnitSupplier";
	public String id_resourceType_existingProfileDDl="ddlProfilesSupplier";
	public String id_resourceTypeItemname_field="txtItemNameSupplier";
	public String id_resourceTypeItemCodeField="txtItemCodeSupplier";
	//public String xpath_addItemDetail_plusIcon="//*[@id='4d35a0f2-657f-4536-864f-142dc2ea43f3']/td[1]/a/img";
	
	public String xpath_addItemDetail_plusIcon="//*[@id='tbodySupplierItem']/tr[1]/td/a/img";
	public String id_rateTypeDDL="ddlContractRateType";
	
	public String id_Quantity_field="txtQuantitySupplier";
	public String xpath_itemquantity_Check="//*[@id='tbodySupplierItem']/tr[2]/td[3]";
	public String xpath_item_leadtime_days="//*[@id='4d35a0f2-657f-4536-864f-142dc2ea43f3']/td[10]";
	
	
	public String id_freight_feild="txtFreight";
	public String id_detailItemSaveButton="btnSaveSupplierItemDetail";
	
	public String xpath_itemEditIcon="//*[@id='tbodySupplierItem']/tr[2]/td[1]/a[1]/img";
	public String id_itemTab_resourceType_saveButton="btnSaveSupplier";
	public String xpath_pricingProfileCrossIcon="//*[@id='btnCrossSupplier']/img";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Variables and data for supplier Module
	
	public String suppliernameField = "Add_Supplier_name";
	
	
	
	
	

}
