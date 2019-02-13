package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.issquared.Common.Common;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.PurchaseOrder;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class PurchaseOrders_Method extends BaseTest{
	    WebDriver driver;
	    PurchaseOrder purchageOrder;
		TadminLogin TadminLogin;
		LoginPage login;
		
		public PurchaseOrders_Method(WebDriver driver) {
			this.driver = driver;
			purchageOrder = new PurchaseOrder(driver);
		}
		
		public void createPurchaseOrder() throws Exception {
			try
			{
				Common.starttest("PurchageOrder Creation.... ");
				Common.assignCategory("PurchageOrder Creation....");
				purchageOrder = PageFactory.initElements(driver, PurchaseOrder.class);
				purchageOrder.SelectAssetsDashboard();
				Thread.sleep(2000);
				purchageOrder.selectPurchaseOrderdropdwon();
				Thread.sleep(1000);
				purchageOrder.clickPurchaseOrder();
				Thread.sleep(1000);
			    purchageOrder.PurchaseOrderclickNew();
			   
			    List<HashMap<String, String>> multipleTestData0 = PO("Porders","Sheet1");
			    Common.logTrace("multipleTestData  : "+multipleTestData0);
				for (HashMap<String, String> testData : multipleTestData0)
				{
				/*List<HashMap<String, String>> multipleTestData1 = PO("POrderItem","Sheet4");
				Common.logTrace("multipleTestData  : "+multipleTestData1);
			    for (HashMap<String, String> testData1 : multipleTestData1) {*/
			    String tempName = testData.get("PruchaseOrderName")+Common.getUniqueID(3);
			    Common.logTrace("PurchageOrder Creation Execution is In-Progress");
			    
				Thread.sleep(2000);
			  /*  purchageOrder.EnterPruchaseOrderName.clear();
				Thread.sleep(1000);*/
				driver.findElement(By.xpath("//input[@id='PurchaseOrderName']")).clear();
				purchageOrder.EnterPruchaseOrderName(tempName);
				purchageOrder.ClickVendorNameSearch();
				Thread.sleep(2000);
				purchageOrder.VendorOrganiationClickPageCount();
				purchageOrder.VendorOrganiationSelectPageCountValue();
				Thread.sleep(2000);
				purchageOrder.ClickVendorOrganiationValue(testData.get("VendorName"));
				purchageOrder.ClickVendorOrganizationOk();
				Thread.sleep(1000);
				purchageOrder.Enterpurchasedate.clear();
				Thread.sleep(2000);
				purchageOrder.Enterpurchasedate(testData.get("Enterpurchasedate"));
				purchageOrder.EnterpurchaseOrderNum.clear();
				purchageOrder.EnterpurchaseOrderNumber(testData.get("PurchaseOrderNumber"));
				purchageOrder.EnterAmount.clear();
				purchageOrder.EnterAmount(testData.get("EnterAmount"));
				purchageOrder.SelecAmountCurrencyType();
				purchageOrder.SelectAmountCurrencyTypeValue();
				purchageOrder.EnterAddress1.clear();
				purchageOrder.EnterAddress1(testData.get("Address1"));
				purchageOrder.EnterAddress2.clear();
				purchageOrder.EnterAddress2(testData.get("Address2"));
				purchageOrder.EnterAddress3.clear();
				purchageOrder.EnterAddress3(testData.get("Address3"));
				purchageOrder.SelectCountryValue();
				Thread.sleep(2000);
				purchageOrder.SelectCountryValueSelection();
				purchageOrder.SelectStateValue();
				Thread.sleep(1000);
				purchageOrder.EnterCityName.clear();
				purchageOrder.EnterCityName(testData.get("CityName"));
				purchageOrder.EnterZipCode.clear();
				purchageOrder.EnterZipCode(testData.get("ZipCode"));
				Thread.sleep(1000);
				purchageOrder.EnterDescription.clear();
				purchageOrder.EnterDescription(testData.get("Description"));
				purchageOrder.EnterNotes.clear();
				purchageOrder.EnterNotes(testData.get("Notes"));
				Thread.sleep(1000);
				purchageOrder.ClickBasicSave();
				
					Thread.sleep(2000);
					if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
					{
						Common.info("PruchaseOrder --> "+tempName+" created Successfully");
						Common.logTrace("PruchaseOrder --> "+tempName+" created Successfully");
					}
					else
					{
						Common.fail(driver,"PruchaseOrder--> "+tempName+" not created Successfully");
						Common.logTrace("PruchaseOrder--> "+tempName+" not created Successfully");
					}
					try{
						purchageOrder.ClickBasicSaveOk();
						
						}catch(Exception ex){
							ex.printStackTrace();
							} 
							
			//PruchaseOrderItemsTab*******************************************************************************
					List<HashMap<String, String>> multipleTestData1 = PO("POrderItem","Sheet4");
					Common.logTrace("multipleTestData  : "+multipleTestData1);
				    for (HashMap<String, String> testData1 : multipleTestData1) {	
					 						
			Thread.sleep(2000);
			purchageOrder.ClickPruchaseOrderItemsTab();
			purchageOrder.ClickPruchaseOrderItemsNew();
			purchageOrder.ClickItemClassSearch();
			Thread.sleep(1000);
			purchageOrder.ClickItemPageDrop();
			Thread.sleep(1000);
			purchageOrder.ClickItemPageDropValue();
			Thread.sleep(1000);
			//purchageOrder.ClickItemClassByName(testData1.get("ClassName"));
			purchageOrder.ClickItemClassByName();
			purchageOrder.ClickItemClassOk();
			purchageOrder.ClickItemTypeSearch();
			Thread.sleep(1000);
			purchageOrder.ClickItemPageDrop();
			purchageOrder.ClickItemTypePageDropValue();
			//purchageOrder.ClickItemTypeByName(testData1.get("TypeName"));
			Thread.sleep(1000);
			purchageOrder.ClickItemTypeByName();
			purchageOrder.ClickItemTypeOk();
			purchageOrder.ClicItemSubtypeSearch();
			Thread.sleep(1000);
			purchageOrder.ClickItemPageDrop();
			purchageOrder.ClickItemSubTypePageDropValue();
			//purchageOrder.ClickItemSubTypeByName(testData1.get("SubTypeName"));
			purchageOrder.ClickItemSubTypeByName();
			purchageOrder.ClickItemSubtypeOk();
			purchageOrder.ClicItemSKUSearch();
			Thread.sleep(2000);
			purchageOrder.ClickonSKUName(testData1.get("POItemSKUName"));
			//purchageOrder.ClickItemSKUByName(testData1.get("ItemSKUName"));
			//purchageOrder.ClickItemSKUByName();			
			Thread.sleep(1000);
			purchageOrder.ClickItemSKUOk();
			purchageOrder.ClicWarehouseSearch();
			Thread.sleep(1000);
			purchageOrder.ClickItemPageDrop();
			Thread.sleep(2000);
			purchageOrder.ClickWarehousePageDropValue100();	
			purchageOrder.ClickWarehouseByName();						
			purchageOrder.ClickWarehouseOk();
			Thread.sleep(1000);
			purchageOrder.EnterUnitPrice(testData1.get("UnitPrice"));
			Thread.sleep(1000);
			purchageOrder.EnterShippingUnitCost(testData1.get("ShippingUnitCost"));
			purchageOrder.EnterOtherUnitCost(testData1.get("OtherUnitCost"));
			purchageOrder.EnterCount(testData1.get("Count"));
			purchageOrder.SelectPruchaseOrderItemSave();
			
			if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
			{
				Common.info("ItemSKUName --> "+testData1.get("POItemSKUName")+" created Successfully");
				Common.logTrace("ItemSKUName --> "+testData1.get("POItemSKUName")+" created Successfully");
			}
			else
			{
				Common.fail(driver,"ItemSKUName--> "+testData1.get("POItemSKUName")+" not created Successfully");
				Common.logTrace("ItemSKUName--> "+testData1.get("POItemSKUName")+" not created Successfully");
			}
			try{
				purchageOrder.SelectPurchaseOrderSaveOK();
				
				}catch(Exception ex){
					ex.printStackTrace();
					} 
			purchageOrder.SelectPurchaseOrderItemBack();
				     
			Common.pass("Test Passed");
			Common.endtest();									
				}	
				  //PurchaseOrderContractsTab***********************************************************
					
					purchageOrder.ClickPurchaseOrderContractsTab();
					purchageOrder.ClickPurchaseOrderContractsNew();
					purchageOrder.ClickContractType();
					purchageOrder.ClickContractTypeValue();
					purchageOrder.ClickContractNameSearch();
					purchageOrder.ClickcontractPageDrop();
					purchageOrder.ClickcontractPageDropValue();
					purchageOrder.SelectContractNameSelection();
					purchageOrder.ClickContractNameOk();
					Thread.sleep(1000);
					purchageOrder.EnterEffectiveDate(testData.get("EffectiveDate"));
					purchageOrder.EnterEndDate(testData.get("EndDate"));
					purchageOrder.EnterRemovalDate(testData.get("RemovalDate"));
					purchageOrder.EnterContractDescription(testData.get("ContractDescription"));
					purchageOrder.ClickContractSave();
					
					if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
					{
						Common.info("ContractName --> "+testData.get("ContractName")+" created Successfully");
						Common.logTrace("ContractName --> "+testData.get("ContractName")+" created Successfully");
					}
					else
					{
						Common.fail(driver,"ContractName--> "+testData.get("ContractName")+" not created Successfully");
						Common.logTrace("ContractName--> "+testData.get("ContractName")+" not created Successfully");
					}
					try{
						purchageOrder.ClickContractSaveOK();
						
						}catch(Exception ex){
							ex.printStackTrace();
							} 
					
					purchageOrder.ClickContractBack();
			    purchageOrder.ClickDocumentsTab();
				purchageOrder.clickDocumentsCreateNew();
				purchageOrder.EnterDocTitle(testData.get("DocTitle"));
				purchageOrder.EnterDocVersionNo(testData.get("DocVersionNo"));
				purchageOrder.EnterDocDescription(testData.get("DocDescription"));
				purchageOrder.Documentupload(testData.get("Documentupload"));
				purchageOrder.clickDocSaveNew();
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Document --> "+testData.get("DocTitle")+" created Successfully for "+testData.get("PruchaseOrderName"));
					Common.logTrace("Document --> "+testData.get("DocTitle")+" created Successfully for "+testData.get("PruchaseOrderName"));
				}
				else
				{
					Common.fail(driver,"Document -->"+testData.get("DocTitle")+" is not created successfully for "+testData.get("PruchaseOrderName"));
					Common.logTrace("Document -->"+testData.get("DocTitle")+" is not created successfully for "+testData.get("PruchaseOrderName"));
				}
				try{purchageOrder.clickDocSaveokpopup();;}catch(Exception ex){ex.printStackTrace();}
				
				purchageOrder.clickDocCancel();
				Thread.sleep(2000);
				/*purchageOrder.ClickBasicSaveAndNew();
				purchageOrder.ClickBasicSaveOk();*/
				Common.pass("Test Passed");
				Common.endtest();
				   }
			    purchageOrder.ClickBasicSaveAndNew();
				purchageOrder.ClickBasicSaveOk();
			    
			      
				}
				catch(Exception e)
				{
					driver.navigate().back();
					driver.navigate().back();
					Common.fail(driver, "Test Failed");
					Common.endtest();
					throw e;
				
				}
		
			}
		
		
}
