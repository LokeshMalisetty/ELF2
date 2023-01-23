package automationTesting;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationScript.Base;
import elements.Motorcycle;

public class Tricentis_motorcycleinsurance_Entervehicledata_Make_005 extends Base {
@Test
public void make() {
	Motorcycle motor=new Motorcycle(driver);
	
	Select make=new Select(motor.getMake());
	
	
}
}
