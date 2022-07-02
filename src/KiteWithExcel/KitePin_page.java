package KiteWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePin_page 
{
	@FindBy(id="pin")  private WebElement PIN;
	@FindBy(xpath ="//button[@type='submit']") private WebElement continuebutton;
	
	//constructure
	
	public KitePin_page (WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}

	
	public void pin1(String pin)
	{
		PIN.sendKeys(pin);
	}
	public void clickoncontinue()
	{
		continuebutton.click();
	}
}
