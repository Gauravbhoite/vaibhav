package POM1;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Loginpage {

	//1.data member/variable
	
	@FindBy(id="userid")  private WebElement  UN;
	@FindBy(id="password")private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']")  private WebElement loginbutton;
	
	
	//.2.Constructure
	public Kite_Loginpage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
	}
    //.3.method
	public void username ()
	{
		UN.sendKeys("ELR321");
	}
	public void password()
	{
	PWD.sendKeys("Dhana1111");	
	}
	public void clickbutton()
	{
		loginbutton.click();
	}
	
	
	
	
}
