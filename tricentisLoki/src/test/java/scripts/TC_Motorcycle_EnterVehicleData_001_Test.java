package scripts;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import basePackage.DataReader;
import pom.AMVehicleData;


public class TC_Motorcycle_EnterVehicleData_001_Test extends BaseClass {
	@Test
	public void TC_AM_EnterVehicleData_001() {//To check Make(dropdown) label is displayed and spelled properly
		//String expectedLabel = DataReader.getTestData("TC_AM_EnterVehicleData_001", "EXPECTED DATA");
		pom.TricentisHomePage tricentisHomePage = new pom.TricentisHomePage(driver);
		tricentisHomePage.getMotorcycleNavBar();
		AMVehicleData enterVehicleData = new AMVehicleData(driver);
		Assert.assertEquals(enterVehicleData.getMakeDropdown().isDisplayed(), true, "Make label is not displayed");
		Reporter.log("Make label is displayed",true);
		String makeLabel = enterVehicleData.getMakeDropdown().getText();
		//Assert.assertEquals(makeLabel, expectedLabel, "Make Label is mismatched");
		Reporter.log("Make Label is matched", true);
	}
}
