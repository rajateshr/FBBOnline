package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBBLoginPageObjects {
	@FindBy(xpath="html/body/div[5]/div[2]/div/div/div[2]/div[5]/form/fieldset/div[1]/div/input[@id='loginInput']")
	public WebElement username;
	
	@FindBy(xpath="html/body/div[5]/div[2]/div/div/div[2]/div[5]/form/fieldset/div[3]/div/input[@id='signPassword']")
	public WebElement password;
	
	@FindBy(xpath="html/body/div[5]/div[2]/div/div/div[2]/div[5]/form/fieldset/div[5]/button[text()='SIGN IN']")
	public WebElement signinbutton;
}
