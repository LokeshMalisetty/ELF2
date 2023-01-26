package scripts;

import java.util.List;
import genericLibrary.ToReadExcelData;
import pom.EnterVehicleData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.ToReadExcelData;

public class Tricentis_motorcycleinsurance_Entervehicledata_Make_006 extends ToReadExcelData{
public 	ToReadExcelData d1=new ToReadExcelData();
	@Test(dataProvider = "data")
	public void make(String [] data) throws InterruptedException {
		EnterVehicleData motor=new EnterVehicleData(driver);
		Select model=new Select(motor.getModel());
		List<WebElement> modelDropDownElements =model.getOptions();
		for(int i=1;i<rowcount;i++) {
			model.selectByVisibleText(data[i]);
			for(WebElement s1:modelDropDownElements)
				Assert.assertEquals(data[i], s1.getText(), "the Brand name displaying is wrong");
		}
	}
}
