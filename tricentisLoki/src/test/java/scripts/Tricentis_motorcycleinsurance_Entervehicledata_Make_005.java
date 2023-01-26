package scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.ToReadExcelData;
import pom.Base;
import pom.EnterVehicleData;


public class Tricentis_motorcycleinsurance_Entervehicledata_Make_005 extends ToReadExcelData{
	int rowcount=0;
	@Test(dataProvider = "data")
	public void make(String [] data) throws InterruptedException {
		EnterVehicleData motor=new EnterVehicleData(driver);
		Select make=new Select(motor.getMake());
		List<WebElement> makeDropDownElements = make.getOptions();
		for(int i=1;i<rowcount;i++) {
			make.selectByVisibleText(data[i]);
			for(WebElement s1:makeDropDownElements)
				Assert.assertEquals(data[i], s1.getText(), "the Brand name displaying is wrong");
		}
	}
}


