package scripts;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import basePackage.DataReader;
import basePackage.ExcelReader;
import pom.MCEnterVehicleData;

public class TC_Motorcycle_EnterVehicleData_003_Test extends BaseClass {
	@DataProvider()
	public String[][] data() throws EncryptedDocumentException, IOException{
		String info[][]=ExcelReader.DataFromExcel("MOTORCYCLE", 2);
		return info;
	}
	  
	@Test(dataProvider = "data")
	public void cylinderCapacity(String [] value) throws InterruptedException {
		MCEnterVehicleData cylinderCapacity =new MCEnterVehicleData(driver);
		System.out.println(value);
		cylinderCapacity.getCylinderCapacity().sendKeys(value);
		Assert.assertEquals(value, cylinderCapacity.getCylinderCapacity().getAttribute("value"), "the input entered is wrong");
		Assert.assertEquals(cylinderCapacity.getCCErrorMsg().isDisplayed(), true, "the error message is displayed wrong");
	}
}
