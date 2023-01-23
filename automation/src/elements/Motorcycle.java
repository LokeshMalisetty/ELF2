package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Motorcycle {
	public Motorcycle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "make")
	private WebElement makeDropDown;

	@FindBy(id = "model")
	private WebElement modelDropDown;

	@FindBy(id = "cylindercapacity")
	private WebElement cylinderCapacityTextField;

	@FindBy(id = "engineperformance")
	private WebElement enginePerformanceTextField;

	@FindBy(id = "dateofmanufacture")
	private WebElement dateofmanufacture;

	@FindBy(id = "opendateofmanufacturecalender")
	private WebElement calenderWidget;
	
	@FindBy(id = "numberofseats")
	private WebElement numberOfSeats;
	
	@FindBy(id = "listprice")
	private WebElement listPrice;
	
	@FindBy(id = "annualmileage")
	private WebElement annualMileage;
	
	@FindBy(id = "nextenterinsurantdata")
	WebElement nextInEnterVehicleData;

	public WebElement getMake() {
		return makeDropDown;
	}

	public WebElement getModel() {
		return modelDropDown;
	}

	public WebElement getCylindercapacity() {
		return cylinderCapacityTextField;
	}

	public WebElement getEngineperformance() {
		return enginePerformanceTextField;
	}

	public WebElement getDateofmanufacture() {
		return dateofmanufacture;
	}

	public WebElement getOpendateofmanufacturecalender() {
		return calenderWidget;
	}

	public WebElement getNumberofseats() {
		return numberOfSeats;
	}

	public WebElement getListprice() {
		return listPrice;
	}

	public WebElement getAnnualmileage() {
		return annualMileage;
	}

	public WebElement getNextenterinsurantdata() {
		return nextInEnterVehicleData;
	}

}
