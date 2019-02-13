package com.issquared.Methods;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.issquared.Common.Common;
import com.issquared.PageObjects.AssetBundles;
import com.issquared.PageObjects.LoginPage;
import com.issquared.PageObjects.TadminLogin;
import com.issquared.TestCases.BaseTest;

public class AssetBundles_Method extends BaseTest{
	WebDriver driver;
	AssetBundles bundles;
	TadminLogin TadminLogin;
	LoginPage login;
	
	public AssetBundles_Method(WebDriver driver) {
		this.driver = driver;
		bundles = new AssetBundles(driver);
	}
	
	public void createAssetBundles() throws Exception {
		try{
			Common.starttest("creating Asset Bundles...");
			Common.assignCategory("creating Asset Bundles...");
			bundles = PageFactory.initElements(driver, AssetBundles.class);
			List<HashMap<String, String>> multipleTestData6 = getTestAssetBundles("Bundle","Sheet1");
			Common.logTrace("multipleTestData  : "+multipleTestData6);
			Common.logTrace("creating Asset Bundles InProgress");
			for (HashMap<String, String> testData6 : multipleTestData6) {
				String tempName = testData6.get("BundleName")+Common.getUniqueID(2);
				bundles.SelectAssetsDashboard();
				Thread.sleep(500);
				bundles.selectAdministration();
				Thread.sleep(500);
				bundles.clickAssetBundle();
				Thread.sleep(500);
				bundles.clickNew();
				bundles.EnterBundleName(tempName);
				bundles.EnterDescription(testData6.get("Description"));
				bundles.Save();
				bundles.PopupOK();
				bundles.CreateNew();
				bundles.ClickonItemName();
				bundles.SelectFirstvalueFromPopup();
				bundles.ClickonitemNamePopupOK();
				Thread.sleep(1000);
				bundles.EnterQuantity(testData6.get("Quantity"));
				bundles.ClickonitemNameSave();
				bundles.PopupOK();
				Thread.sleep(500);
				bundles.ClickonitemNameBack();
				bundles.saveandnew();
				
				if(driver.findElement(By.xpath("//div[contains(@class,'sweet-alert') and contains(@class,'visible')]")).getAttribute("innerHTML").contains("Success Message"))
				{
					Common.info("Customers --> "+testData6.get("BundleName")+" created Successfully ");
				}
				else
				{
					Common.fail(driver,"Customers -->"+testData6.get("BundleName")+" is not created successfully ");
					Common.captureScreenShot("fileName");
				}
				try{
					bundles.PopupOK();
				Thread.sleep(4000);
				}catch(Exception ex){ex.printStackTrace();
				} 
				
			}
			 Common.pass("Test Passed");
			 Common.endtest();
				
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
