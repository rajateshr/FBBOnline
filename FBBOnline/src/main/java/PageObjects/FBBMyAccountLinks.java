package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBBMyAccountLinks {
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[5]/a/span[@class='user_icon']")
	public WebElement myaccicon;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[5]/div[@class='mini-cart-content3 after-login']")
	public WebElement myaccpopup;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[5]/div/ul/li[7]/a[text()='Sign Out']")
	public WebElement signOutLink;
	
	@FindBy(xpath="//div[@class='signOutConf']/div[@class='confInner']")
	public WebElement signOutpopup;
	
	@FindBy(xpath="html/body/div[2]/div/div[1]/a[text()='Yes, sign me out']")
	public WebElement signOutsuccess;
	
	
	
	
}
