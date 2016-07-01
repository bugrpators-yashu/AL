package componentDefinition;

public interface ProcurementModuleComponents {
	
	public String xpath_Procurement_tab = "//*[@id='wrap']/div/div/ul/li[5]";
	
	
	//Xpath for Procurement Summary >> Procurement Plans
	
	public String id_Procurement_ProcurementPlanSummary_SelectStatus_ddl = "ddlProcurementStatus";
	public String id_Procurement_ProcurementPlanSummary_KeywordSearch_textbox = "txtSearchProcurement";
	public String id_Procurement_ProcurementPlanSummary_FromDate_textbox = "txtFromDateProcurement";
	public String xpath_Procurement_ProcurementPlanSummary_FromDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
	public String xpath_Procurement_ProcurementPlanSummary_FromDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
	public String id_Procurement_ProcurementPlanSummary_ToDate_textbox = "txtToDate";
	public String xpath_Procurement_ProcurementPlanSummary_ToDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
	public String xpath_Procurement_ProcurementPlanSummary_ToDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
	public String id_Procurement_ProcurementPlanSummary_Search_button = "hrefSearchProcurement";
	public String id_Procurement_ProcurementPlanSummary_SelectAction_ddl = "ddlprocurementAction";
	public String id_Procurement_ProcurementPlanSummary_ProcurementPlans_tab = "liProcurementTab";
		
	public String xpath_Procurement_ProcurementPlanSummary_CreatedPlans_link = "//*[@id='tbodyProcurements']/tr[1]/td[4]/a";
	public String xpath_Procurement_ProcurementPlanSummary_CreatedPlans_checkbox = "//*[@id='tbodyProcurements']/tr[1]/td[3]/input";
		
	
	//Xpath for Procurement >> Edit Settings
	
	public String id_Procurement_EditSettings_link = "lnkBtnEditSettingPlanType";
	public String id_Procurement_EditSettings_AddPlanType_link = "btnProcPlanAddPlanType";
	public String id_Procurement_EditSettings_AddPlanType_ProcurementPlanType_textbox = "txtProcurementEditSettings";
	public String id_Procurement_EditSettings_AddPlanType_Active_checkbox = "txtProcurementEditSettingsActive";
	public String xpath_Procurement_EditSettings_AddPlanType_Save_button = "//*[@id='tblProcurementplanEditSettings']/tr/td[1]/a[1]/img";
	public String xpath_Procurement_EditSettings_close_button = "//*[@id='CloseProcPlanEditSettingPopUp']/img";
	
	
	//Xpath for Procurement Summary >> Consolidated Plans
	
	public String id_Procurement_ProcurementPlanSummary_ConsolidatedPlans_tab = "liConsolidatedTab";
	public String id_Procurement_ProcurementPlanSummary_ConsolidatedPlans_FromDate_textbox = "txtConsolidateSummaryFromDate";
	public String xpath_Procurement_ProcurementPlanSummary_ConsolidatedPlans_FromDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
	public String xpath_Procurement_ProcurementPlanSummary_ConsolidatedPlans_FromDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
	public String id_Procurement_ProcurementPlanSummary_ConsolidatedPlans_ToDate_textbox = "txtConsolidateSummaryToDate";
	public String xpath_Procurement_ProcurementPlanSummary_ConsolidatedPlans_ToDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
	public String xpath_Procurement_ProcurementPlanSummary_ConsolidatedPlans_ToDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
	public String id_Procurement_ProcurementPlanSummary_ConsolidatedPlans_Search_button = "btnConsolidateSummarySearchButton";
	
	
	//Xpath for Procurement >> Create Procurement Plan
	
	public String id_Procurement_CreateProcurementPlan_link = "btnCreateProcurementPlan";
	public String xpath_Procurement_CreateProcurementPlan_DeleteLocation_button = "//*[@id='tbodyProcGenLocations']/tr/td[1]/a/img";
	
	
	//Xpath for Procurement >> Create Procurement Plan >> General Tab
	
	public String id_Procurement_CreateProcurementPlan_RequestingUnitType_ddl = "ddlProcRequestorTypeunit";
	public String id_Procurement_CreateProcurementPlan_RequestingUnit_ddl = "ddlProcurementGeneralRequester";
	public String id_Procurement_CreateProcurementPlan_PlanOwner_radiobutton = "rbRequestionUnitProcurementPlanGeneralTab";
	public String id_Procurement_CreateProcurementPlan_PlanOwner_SelectProgram_radiobutton = "rbProgramProcurementPlanGeneralTab";
	public String id_Procurement_CreateProcurementPlan_PlanOwner_SelectProgram_ddl = "ddlProgramProcurementPlanGeneralTab";
	public String id_Procurement_CreateProcurementPlan_PlanOwner_SelectProject_radiobutton = "rbProjectProcurementPlanGeneralTab";
	public String id_Procurement_CreateProcurementPlan_PlanOwner_SelectProject_ddl = "ddlProjectProcurementPlanGeneralTab";
	public String id_Procurement_CreateProcurementPlan_PlanType_ddl = "ddlProcurementGeneralPlanType";
	public String id_Procurement_CreateProcurementPlan_PlanPeriod_StartDate_textbox = "txtProcurementGeneralFrom";
	public String xpath_Procurement_CreateProcurementPlan_PlanPeriod_StartDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
	public String xpath_Procurement_CreateProcurementPlan_PlanPeriod_StartDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
	public String id_Procurement_CreateProcurementPlan_PlanPeriod_EndDate_textbox = "txtProcurementGeneralTo";
	public String xpath_Procurement_CreateProcurementPlan_PlanPeriod_EndDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
	public String xpath_Procurement_CreateProcurementPlan_PlanPeriod_EndDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
	public String id_Procurement_CreateProcurementPlan_PlanPeriod_StartTime_textbox = "txtProcurementGeneralTimeFrom";
	public String xpath_Procurement_CreateProcurementPlan_PlanPeriod_StartTime_Now_button = "//*[@id='ui-datepicker-div']/div[3]/button[1]";
	public String xpath_Procurement_CreateProcurementPlan_PlanPeriod_StartTime_Done_button = "//*[@id='ui-datepicker-div']/div[3]/button[2]";
	public String id_Procurement_CreateProcurementPlan_PlanPeriod_EndTime_textbox = "txtProcurementGeneralTimeTo";
	public String xpath_Procurement_CreateProcurementPlan_PlanPeriod_EndTime_Hour = "//*[@id='ui-timepicker-div-txtProcurementGeneralTimeTo']/dl/dd[2]/div[2]/table/tbody/tr/td[6]";
	public String xpath_Procurement_CreateProcurementPlan_PlanPeriod_EndTime_Minute = "//*[@id='ui-timepicker-div-txtProcurementGeneralTimeTo']/dl/dd[3]/div[2]/table/tbody/tr/td[6]";
	public String xpath_Procurement_CreateProcurementPlan_PlanPeriod_EndTime_Done_button = "//*[@id='ui-datepicker-div']/div[3]/button[2]";
	public String id_Procurement_CreateProcurementPlan_ExchangeRate_textbox = "txtProcurementGeneralExchangeRate";
	public String id_Procurement_CreateProcurementPlan_Notes_textbox = "txtProcurementGeneralNotes";
	public String id_Procurement_CreateProcurementPlan_Save_button = "btnSaveStandardPlan";
	public String id_Procurement_CreateProcurementPlan_Update_button = "btnUpdateStandardPlan";
	public String id_Procurement_CreateProcurementPlan_Heading_gettext = "MainHeadingProcurementPlan";
	public String id_Procurement_CreateProcurementPlan_SelectLocation_link = "hrfProcurementGeneralDetailsSelectLoaction";
	public String id_Procurement_CreateProcurementPlan_SelectLocation_SearchLocation_textbox = "txtSearchModel";
	public String id_Procurement_CreateProcurementPlan_SelectLocation_SearchLocation_Search_button = "btnSearchModel";
	public String xpath_Procurement_CreateProcurementPlan_SelectLocation_SearchLocation_Select_link = "//*[@id='tblLocationModel']/tbody/tr[1]/td[2]/a";
	
	public String id_Procurement_CreateProcurementPlan_SelectLocation_LocationName_textbox = "txtLoactionModel";
	public String id_Procurement_CreateProcurementPlan_SelectLocation_LocationType_ddl = "ddlLocationTypeModel";
	public String id_Procurement_CreateProcurementPlan_SelectLocation_OrganisationalUnit_ddl = "ddlLocationOrganizationalUnit";
	public String id_Procurement_CreateProcurementPlan_SelectLocation_Continue_button = "btnContinue";
	
	public String xpath_Procurement_CreateProcurementPlan_Close_button = "//*[@id='CloseProcurementGeneralPopUp']/img";
	
	
	//Xpath for Procurement >> Create Procurement Plan >> Items Tab
	
	public String id_Procurement_CreateProcurementPlan_Item_tab = "hrefProcItemsTab";
	public String id_Procurement_CreateProcurementPlan_Item_AddItem_link = "hrefAddItemProcurement";
	public String id_Procurement_CreateProcurementPlan_Item_AddItem_KeywordSearch_textbox = "txtProcItemSearch";
	public String id_Procurement_CreateProcurementPlan_Item_AddItem_KeywordSearch_Search_button = "hrefprocItemSearch";
	public String xpath_Procurement_CreateProcurementPlan_Item_AddItem_Select_link = "//*[@id='tbodyProcItems']/tr[1]/td[1]/a";
	public String xpath_Procurement_CreateProcurementPlan_Item_AddItem_AddRequest_link = "//*[@id='tbodyProcPlanItemSummary']/tr/td[1]/a[2]/img";
	public String id_Procurement_CreateProcurementPlan_Item_AddItem_AddRequest_Quantity_textbox = "txtProcPlanItemQuantity";
	public String id_Procurement_CreateProcurementPlan_Item_AddItem_AddRequest_Destination_ddl = "ddlProcPlanItemLocation";
	public String id_Procurement_CreateProcurementPlan_Item_AddItem_AddRequest_DeliveryDate_textbox = "txtProcPlanItemDeliveryDate";
	public String xpath_Procurement_CreateProcurementPlan_Item_AddItem_AddRequest_DeliveryDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
	public String xpath_Procurement_CreateProcurementPlan_Item_AddItem_AddRequest_DeliveryDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
	
	public String id_Procurement_CreateProcurementPlan_Item_AddItem_AddRequest_Save_button = "btnAddProcItemDetails";
	
	
	//Xpath for Procurement >> Create Procurement Plan >> Activity Tab
	
	public String id_Procurement_CreateProcurementPlan_Activity_tab = "hrefProcActivityLogTab";
	public String id_Procurement_CreateProcurementPlan_Activity_Submit_button = "aUpdatedStatusActivityLog";
	public String xpath_Procurement_CreateProcurementPlan_Activity_Details_ApprovalStatus_radiobutton = "//*[@id='divNextStatus']/p/span/input";
	public String id_Procurement_CreateProcurementPlan_Activity_Details_Submit_button = "btnProcurementActivityLogStatus";

	
	//Xpath for Procurement >> Create Procurement Plan >> Processing Tab
	
	public String id_Procurement_CreateProcurementPlan_Processing_tab = "hrefProcProcessingTab";
	public String id_Procurement_CreateProcurementPlan_Processing_SelectAction_ddl = "ddlConsolidatePlanAction";
	public String xpath_Procurement_CreateProcurementPlan_Processing_SelectItem_checkbox = "//*[@id='tbodyProcurementProcessing']/tr[2]/td[1]/input";
	public String id_Procurement_CreateProcurementPlan_Processing_SelectActionApply_button = "btnConsolidatePlanApply";
	public String id_Procurement_CreateProcurementPlan_Processing_PurchaseRequisitionType_ddl = "ddlPurchaseRequisitionPopUpPlanType";
	public String id_Procurement_CreateProcurementPlan_Processing_PurchaseRequisitionType_Continue_button = "btnPurchaseRequisitionContinue";
	public String xpath_Procurement_CreateProcurementPlan_Processing_PurchaseRequisitionCreatedNumber_link = "//*[@id='tbodyProcurementProcessing']/tr[2]/td[9]/a";
	public String id_Procurement_CreateProcurementPlan_Processing_PurchaseRequisitionHeading_gettext = "MainHeadingPurchase";
	
	
	
	//Xpath for Procurement >> Create Consolidated Plan >> Procurement Summary
	
	public String id_Procurement_CreateConsolidatedPlan_SelectAction_Apply_button = "btnConvertToConsolidatePlan";
	
	
	//Xpath for Procurement >> Purchase Requisition >> General Tab
	
	public String xpath_Procurement_PurchaseRequisition_tab = "//*[@id='wrap']/div/div/ul/li[5]/ul/li[2]/a";
	
	public String xpath_Procurement_CreateProcurementPlan_PurchaseRequisitionCreatedNumber_link = "//*[@id='tbodyProcurementProcessing']/tr[2]/td[9]/a";
	public String id_Procurement_CreateProcurementPlan_PurchaseRequisitionHeading_gettext = "MainHeadingPurchase";
	
	
	
	//Xpath for Procurement >> Purchase Requisition >> Items Tab
	
	public String id_Procurement_PurchaseRequisition_Items_tab = "hrefProcItemsTab1";
	public String id_Procurement_PurchaseRequisition_Items_AddResource_button = "aAddResource";
	public String id_Procurement_PurchaseRequisition_Items_ResourceCategory_ddl = "ddlPurchaseRequisitionResourcecategories";
	public String xpath_Procurement_PurchaseRequisition_Items_ResourceType1_checkbox = "//*[@id='tbodyPurchaseRequistionItemDetail']/tr[1]/td[1]/input";
	public String id_Procurement_PurchaseRequisition_Items_ResourceType_Next_button = "btnPurchaseRequisitionNextResourceType";
	public String id_Procurement_PurchaseRequisition_Items_ResourceType_Details_Quantity_textbox = "txtPRUnitOfMeasure";
	public String id_Procurement_PurchaseRequisition_Items_ResourceType_Details_Destination_ddl = "ddlPRDestination";
	public String id_Procurement_PurchaseRequisition_Items_ResourceType_Details_Done_button = "btnPRDone";
	
	
	//Xpath for Procurement >> Purchase Requisition >> Fulfillment Tab
	
	public String id_Procurement_PurchaseRequisition_Fulfillment_tab = "hrefProcFulfillmentTab";
	public String xpath_Procurement_PurchaseRequisition_Fulfillment_ResourceType_View_button = "//*[@id='tbodyPurchaseRequisionFulfillmentSummary']/tr[3]/td[2]/a/img";
	public String id_Procurement_PurchaseRequisition_Fulfillment_AddFulfillment_link = "ancPRAddFulfillmentSource";
	public String xpath_Procurement_PurchaseRequisition_Fulfillment_AddFulfillment_Supplier_checkbox = "//*[@id='tbodyPRSuppliers']/tr[1]/td[1]/input";
	public String id_Procurement_PurchaseRequisition_Fulfillment_AddFulfillment_Request_textbox = "txtQuantity1";
	public String id_Procurement_PurchaseRequisition_Fulfillment_AddFulfillment_AddSelected_button = "btnPRFulfillmentAddSelected";
	
	
	//Xpath for Procurement >> Purchase Requisition >> Order Tab
	
	public String id_Procurement_PurchaseRequisition_Order_tab = "hrefProcOrderTab";
	public String xpath_Procurement_PurchaseRequisition_Order_Resource_checkbox = "//*[@id='tbodyPROderSummary']/tr[2]/td[1]/input";
	public String id_Procurement_PurchaseRequisition_Order_SelectAction_ddl = "ddlPROrderAction";
	public String id_Procurement_PurchaseRequisition_Order_Apply_button = "btnPROrderApply";
	
	
	//Xpath for Procurement >> Purchase Order >> Items Tab
	
	public String xpath_Procurement_PurchaseOrder_OrderNumber_link = "//*[@id='tbodyPROderSummary']/tr[2]/td[10]/a";
	public String id_Procurement_PurchaseOrder_Items_tab = "tabItemPurchaseOrder-Item";
	public String xpath_Procurement_PurchaseOrder_Items_ResourceType_View_link = "//*[@id='tblPurchaseOrderItems']/tr[2]/td[1]/a[2]/img";
	public String id_Procurement_PurchaseOrder_Items_AddFulfillment_link = "anchrAddFulfillmentPO";
	public String id_Procurement_PurchaseOrder_Items_AddFulfillment_Search_button = "btnSearchFulfillmentPO";
	public String xpath_Procurement_PurchaseOrder_Items_AddFulfillment_Supplier_checkbox = "//*[@id='tdbodyFulfillmentPO']/tr/td[1]/input";
	public String id_Procurement_PurchaseOrder_Items_AddFulfillment_Request_textbox = "clsOrderQty";
	public String id_Procurement_PurchaseOrder_Items_AddFulfillment_AddSelected_button = "btnAddSelectedPO";
	
	
	//Xpath for Procurement >> Purchase Order >> Processing Tab
	
	public String id_Procurement_PurchaseOrder_Processing_tab = "btnPOProcessingTab";
	public String xpath_Procurement_PurchaseOrder_Processing_Items_checkbox = "//*[@id='tblPurchaseOrderProcessing']/tr[1]/td[1]/input";
	public String id_Procurement_PurchaseOrder_Processing_SelectAction_ddl = "ddlPurchaseOrderSubmittoSupplierAction";
	public String id_Procurement_PurchaseOrder_Processing_SelectAction_Apply_button = "btnSubmittoSupplier";
	public String xpath_Procurement_PurchaseOrder_Processing_PickTicketID_gettext = "//*[@id='tblPurchaseOrderProcessing']/tr[1]/td[6]/a";
	
	
	//Xpath for Procurement >> Receiving Tab
	
	public String id_Procurement_Receiving_Heading_gettext = "spnMainPurchaseOrderHeader";
	
	
	//Xpath for Procurement >> Receiving >> General Tab
	
	public String id_Procurement_Receiving_General_RecievedDate_textbox = "txtPOShipmentReceivedDate";
	public String xpath_Procurement_Receiving_General_RecievedDate_month = "//*[@id='ui-datepicker-div']/div/div/select[1]";
	public String xpath_Procurement_Receiving_General_RecievedDate_year = "//*[@id='ui-datepicker-div']/div/div/select[2]";
	
	public String id_Procurement_Receiving_General_RecievedTime_textbox = "txtPOShipmentReceivedTime";
	public String xpath_Procurement_Receiving_General_RecievedTime_Now_button = "//*[@id='ui-datepicker-div']/div[3]/button[1]";
	public String xpath_Procurement_Receiving_General_RecievedTime_Done_button = "//*[@id='ui-datepicker-div']/div[3]/button[2]";
	
	public String id_Procurement_Receiving_General_ShipmentType_ddl = "ddlShipmentTypeGeneral";
	public String id_Procurement_Receiving_General_ShipmentMode_ddl = "ddlShipmentTransportModeGeneral";
	
	public String id_Procurement_Receiving_General_Save_button = "btnSavePOShipment";
	
	
	//Xpath for Procurement >> Receiving >> Items Tab
	
	public String id_Procurement_Receiving_Items_tab = "tabReceiving-Item";
	public String id_Procurement_Receiving_Items_PredefineStorage_link = "hlkPredefineStorage";
	public String xpath_Procurement_Receiving_Items_SelectStoragePosition_link = "//*[@id='tbodyRecItemsTab']/tr/td[2]/table/tbody/tr/td[2]/a";
	public String xpath_Procurement_Receiving_Items_SelectStoragePosition_StorageType_Select_link = "//*[@id='dvStorageType']/table/tbody/tr[1]/td[1]/a";
	public String xpath_Procurement_Receiving_Items_SelectStoragePosition_StorageType_StoragePosition_Select_link = "//*[@id='dvInvStoragePosition']/table/tbody/tr[1]/td[1]/a";
	public String id_Procurement_Receiving_Items_Storage_Save_button = "btnItemSave";
	public String xpath_Procurement_Receiving_Items_Add_button = "//*[@id='tbodyRecevingItems']/tr[1]/td[1]/a/img";
	public String id_Procurement_Receiving_Items_Quantity_textbox = "txtQuantityReceiving";
	public String id_Procurement_Receiving_Items_ReceiptType_ddl = "ddlReceiptType";
	public String id_Procurement_Receiving_Items_NoContainerUsed_radiobutton = "rdoNoContainerReceiving";
	public String id_Procurement_Receiving_Items_Save_button = "btnSaveReceiving";
	
	
	//Xpath for Procurement >> Receiving >> Analysis Tab
	
	public String id_Procurement_Receiving_Analysis_tab = "aPurchaseOrderAnalysis";
	public String xpath_Procurement_Receiving_Analysis_Item_checkbox = "//*[@id='tbodyAnalysis']/tr[2]/td[1]/input";
	public String id_Procurement_Receiving_Analysis_SelectAction_ddl = "ddlReceivingApprove";
	public String id_Procurement_Receiving_Analysis_Apply_button = "btnApplyAnalysis";
	
	public String xpath_Procurement_Receiving_Close_button = "//*[@id='create-purchase-order']/div/div/div[1]/h2/a/img";

	
	//Xpath for Procurement >> Receiving Summary
	
	public String id_Procurement_ReceivingSummary_KeywordSearch_textbox = "txtKeywordReceiving";
	public String id_Procurement_ReceivingSummary_Search_button = "btnSearchReceiving";
	public String xpath_Procurement_ReceivingSummary_FirstRecord_gettext = "//*[@id='tbodyReceivingSummary']/tr[1]/td[2]/a";
	
	
	//Define Procurement >> Edit Settings Variables
	
	public static String ProcurementEditSettingsAddPlanTypeProcurementPlanType = "ProcurementPlanType";
	
	
	//Define Procurement >> Procurement Plan Summary Variables
	
	public static String ProcurementProcurementPlanSummarySelectStatus = "ProcurementPlanSummarySelectStatus";
	
		
	//Define Procurement >> Create Procurement Plan >> General Tab Variables
	
	public static String ProcurementCreateProcurementPlanExchangeRate = "CreateProcurementPlanExchangeRate";
	public static String ProcurementCreateProcurementPlanNotes = "CreateProcurementPlanNotes";
	public static String ProcurementCreateProcurementPlanSelectLocationSearchLocation = "CreateProcurementPlanSelectLocationSearchLocation";
	
	
	//Define Procurement >> Create Procurement Plan >> Items Tab Variables
	
	public static String ProcurementCreateProcurementPlanItemsAddItemAddRequestQuantity = "CreateProcurementPlanItemsAddItemAddRequestQuantity";
	public static String ProcurementCreateProcurementPlanItemsAddItemAddRequestDestination = "CreateProcurementPlanItemsAddItemAddRequestDestination";
	public static String ProcurementCreateProcurementPlanItemsAddItemKeywordSearch = "CreateProcurementPlanItemsAddItemKeywordSearch";
	
	
	//Define Procurement >> Purchase Requisition >> Items Tab Variables
	
	public static String ProcurementPurchaseRequisitionItemsResourceTypeDetailsQuantity = "PurchaseRequisitionItemsResourceTypeDetailsQuantity";
	
	
	//Define Procurement >> Purchase Requisition >> Fulfillment Tab Variables
	
	public static String ProcurementPurchaseRequisitionFulfillmentAddFulfillmentRequest = "PurchaseRequisitionFulfillmentAddFulfillmentRequest";
	
	
	//Define Procurement >> Purchase Order Tab Variables
	
	public static String ProcurementPurchaseOrderItemsAddFulfillmentRequest = "PurchaseOrderItemsAddFulfillmentRequest";
	
	
	//Define Procurement >> Receiving >> Items Tab
	
	public static String ProcurementReceivingItemQuantity = "ReceivingItemQuantity";
	
	
}
