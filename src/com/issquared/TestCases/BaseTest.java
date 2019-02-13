package com.issquared.TestCases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.issquared.Common.ExcelUtils;
import com.issquared.Common.Exceluitility;



public class BaseTest extends Exceluitility{
	
	/*public static void main(String[] args){
		List<HashMap<String, String>> multipleTestData = getTestCaseMultipleData("Orgtext", "Org");
		System.out.println(multipleTestData);
	}*/

	/**
	 * 
	 * @param testcaseName
	 * @param sheetName
	 * @return
	 */
	public HashMap<String, String> getTestCaseData(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("E:/Selenium scripts for workforce module/ORGANIZATIONS Module with Full Data/Excelsheets/sureshorg.xlsx", sheetName);
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				return tcData;
		}
		return null;
	}
	
	public List<HashMap<String, String>> getTestProcureAssets(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/ProcureAssets.xlsx", sheetName);	
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	
	public List<HashMap<String, String>> getTestManageAssets(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/ManageAssets.xlsx", sheetName);	
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	public List<HashMap<String, String>> getTestAssetExpenses(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/AssetExpenses.xlsx", sheetName);	
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}	
		return testdata1;
	}
				
	public List<HashMap<String, String>> getTestItemClass(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/AssetClass.xlsx", sheetName);		
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	
	
	
	public List<HashMap<String, String>> getTestMaintenance(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/Maintenance.xlsx", sheetName);		
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	

	public List<HashMap<String, String>> getTestInsurance(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/Insurance.xlsx", sheetName);		
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	
	public List<HashMap<String, String>> getTestwarranty(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/Warranty.xlsx", sheetName);		
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	
	public List<HashMap<String, String>> getTestOwnership(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData(".\\testData\\LIFECYCLE.xlsx", sheetName);		
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	
	public List<HashMap<String, String>> getTestAssetRepair(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/AssetRepairs.xlsx", sheetName);		
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	
	public List<HashMap<String, String>> getTestAssetHold(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/AssetsHold.xlsx", sheetName);		
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	public List<HashMap<String, String>> getTestAssetBundles(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/AssetBundles.xlsx", sheetName);		
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	
	public List<HashMap<String, String>> getTestAssetDisposal(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/AssetDisposal.xlsx", sheetName);		
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	public List<HashMap<String, String>> getTestAssetItemTypes(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/ItemTypes.xlsx", sheetName);		
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	///*************************************Items Excel sheet info*******************************************************
	public List<HashMap<String, String>> getTestAssetItemsConfiguration(String testcaseName,String sheetName) {
		

		
		/*List<HashMap<String, String>> testdata = ExcelUtils.getTestData("E:\\Automation\\Assets 2.0\\testData\\ItemsInfoConfiguration_5.xlsx", sheetName);*/
		List<HashMap<String, String>> testdata = ExcelUtils.getTestData(".\\testData\\ItemsInfoConfiguration_5.xlsx", sheetName);
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
	
	public List<HashMap<String, String>> PO(String testcaseName,String sheetName) {
		List<HashMap<String, String>> testdata = ExcelUtils.getTestData(".\\testData\\PO.xlsx", sheetName);
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	
public List<HashMap<String, String>> PurchaseOrderData(String testcaseName,String sheetName) {
		

		/*List<HashMap<String, String>> testdata = ExcelUtils.getTestData("E:/Automation/Assets 2.0/testData/ItemsInfoConfiguration.xlsx", sheetName);*/
		List<HashMap<String, String>> testdata = ExcelUtils.getTestData(".\\testData\\PO_Data.xlsx", sheetName);
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}
	

public List<HashMap<String, String>> getTestAssignUserToManagerRole(String testcaseName,String sheetName) {

	List<HashMap<String, String>> testdata = ExcelUtils.getTestData(".\\testData\\AssignUserToManagerRole.xlsx", sheetName);		
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}
	
	//***********************************Attributes Excel Sheet Info**********************************************************
	public List<HashMap<String, String>> getTestItemTypesAttributes(String testcaseName,String sheetName) {

		List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/ItemsAttributesTypeLevel.xlsx", sheetName);		
		List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
		for (HashMap<String, String> tcData : testdata) {
			if (tcData.get("TestCaseName").equals(testcaseName))
				testdata1.add(tcData);
		}
		return testdata1;
	}


//*****************************************Contracts Excel Sheets*********************************************************************
public List<HashMap<String, String>> getContractsInfoConfiguration(String testcaseName,String sheetName) {

	List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/ContractsInfoConfiguration2.xlsx", sheetName);
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}


public List<HashMap<String, String>> getTestInsuranceContracts(String testcaseName,String sheetName) {

	List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/InsuranceContracts.xlsx", sheetName);		
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}


public List<HashMap<String, String>> getTestWarrantyContracts(String testcaseName,String sheetName) {

	List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/Warantycontract.xlsx", sheetName);		
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}

//***********************************************Purchase orders excel sheet*************************************************************************
public List<HashMap<String, String>> getPurchaseOrdersInfoConfiguration(String testcaseName,String sheetName) {
	
	
	List<HashMap<String, String>> testdata = ExcelUtils.getTestData(".\\testData\\PurchaseOrders2.xlsx", sheetName);
	
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}



public List<HashMap<String, String>> getPurchaseOrdersInfoConfigurations(String testcaseName,String sheetName) {
	List<HashMap<String, String>> testdata = ExcelUtils.getTestData("E:\\Test Data - Assets\\ItemsInfoConfiguration_2.xlsx", sheetName);
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}


public List<HashMap<String, String>> getTestCaseWarehouses(String testcaseName,String sheetName) {

	List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/Warehouses.xlsx", sheetName);
	/*List<HashMap<String, String>> testdata = ExcelUtils.getTestData("E:\\Assets_Test\\PurchaseOrders_Copy.xlsx", sheetName);*/
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}


public List<HashMap<String, String>> getTestCaseAssetPool(String testcaseName,String sheetName) {

	//List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/Assetpool2.xlsx", sheetName);
	List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/Warehouses.xlsx", sheetName);
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}

public List<HashMap<String, String>> getEmailTemplates(String testcaseName,String sheetName) {
	

	/*List<HashMap<String, String>> testdata = ExcelUtils.getTestData("E:/Automation/Assets 2.0/testData/ItemsInfoConfiguration.xlsx", sheetName);*/
	List<HashMap<String, String>> testdata = ExcelUtils.getTestData(".\\testData\\EmailTemplates.xlsx", sheetName);
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}
public List<HashMap<String, String>> getTestACTIONS_Onboard(String testcaseName,String sheetName) {

	List<HashMap<String, String>> testdata = ExcelUtils.getTestData(".\\testData\\ACTIONS.xlsx", sheetName);		
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}
public List<HashMap<String, String>> getTestREQUESTS(String testcaseName,String sheetName) {

	List<HashMap<String, String>> testdata = ExcelUtils.getTestData(".\\testData\\REQUESTS.xlsx", sheetName);		
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}

public List<HashMap<String, String>> getTestWORKFLOW(String testcaseName,String sheetName) {

	List<HashMap<String, String>> testdata = ExcelUtils.getTestData(".\\testData\\WORKFLOW.xlsx", sheetName);		
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}

public List<HashMap<String, String>> getTestCaseCustomers(String testcaseName,String sheetName) {

	List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/Customers.xlsx", sheetName);
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
}

public List<HashMap<String, String>> getTestCaseInventory(String testcaseName,String sheetName) {

	List<HashMap<String, String>> testdata = ExcelUtils.getTestData("./testData/Inventory.xlsx", sheetName);
	List<HashMap<String, String>> testdata1 = new ArrayList<HashMap<String, String>>();
	for (HashMap<String, String> tcData : testdata) {
		if (tcData.get("TestCaseName").equals(testcaseName))
			testdata1.add(tcData);
	}
	return testdata1;
   }


}

