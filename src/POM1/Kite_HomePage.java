package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage 
{
	@FindBy(xpath ="//span[@class='user-id']")private WebElement userid;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	
	public Kite_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void validusername()
	{
		String actualuserid = userid.getText();
		String expecteduserid = "ELR321";
		if(actualuserid.equals(expecteduserid))
		{
			System.out.println("userid matching TC pass");
		}
		else
		{
			System.out.println("userid not matching TC fail");
		}
		userid.click();
	}

	public void logout() throws InterruptedException
	{
		Thread.sleep(1000);
		logout.click();
	}
}
