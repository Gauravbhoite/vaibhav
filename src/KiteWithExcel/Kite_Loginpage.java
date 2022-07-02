package KiteWithExcel;

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
	public void username (String un)
	{
		UN.sendKeys(un);
	}
	public void password(String pwd)
	{
	PWD.sendKeys(pwd);	
	}
	public void clickbutton()
	{
		loginbutton.click();
	}
	
	
	
	
}
