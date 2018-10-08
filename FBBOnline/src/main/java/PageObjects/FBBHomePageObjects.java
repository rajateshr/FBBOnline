package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBBHomePageObjects {
	//Define the page Objects
	//Defining the page objects in Home page delivery location popup
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[5]/a/span[@class='user_icon']")
	public WebElement usericon;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[@class='icon-favicon miniWishlistContainer icon-user']")
	public WebElement wishlisticon;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[1]/a/span[@class='shopping_bag']")
	public WebElement shoppingbagicon;
	
	@FindBy(xpath="html/body/header/div/div/div/div[1]/div/div[1]/a[normalize-space(text()='store locator')]")
	public WebElement storelocator;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[6]/div/form/div[1]/input[@id='searchInput']")
	public WebElement searchtext;
	
	@FindBy(xpath="html/body/header/div/div/div/div[1]/div/div[2]/div/input[@id='mobStorePincode']")
	public WebElement storepincode;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[5]/div[@class='mini-cart-content3']")
	public WebElement accountpopup;
	
	@FindBy(xpath="html/body/header/div/div/div/div[3]/nav/ul/li[1]/div[1]/a/span[text()='Women']")
	public WebElement womenmencategory;
	
	@FindBy(xpath="//nav[@class='main-menu']/ul[@class='navigation']/li[@class='menu-item-has-children item-mega-menu']/div[@class='menu-hover']/a[@href='https://preprod.fbbonline.in/women/']/parent::div[@class='menu-hover']/following-sibling::div[@class='sub-menu mega-menu']/div[@class='row']/div[3]/div[4]/a[@href='https://preprod.fbbonline.in/women/footwear/']/h3[text()='Footwear']")
	public WebElement footwearSubCat;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[5]/div[@class='mini-cart-content3 after-login']")
	public WebElement myaccpopup;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[5]/div/ul/li[1]/a[@title='TESTER RAJATESH']")
	public WebElement usernamemyacc;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[5]/div/ul/li[2]/a[text()='rajateshr@gmail.com']")
	public WebElement emailidmyacc;
	
	
}
