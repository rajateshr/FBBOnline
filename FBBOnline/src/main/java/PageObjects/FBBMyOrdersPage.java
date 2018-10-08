package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBBMyOrdersPage {

	@FindBy(xpath="html/body/div[6]/div[2]/div[2]/h2[normalize-space(text()='My orders')]")
	public WebElement myordersheading;
	
	@FindBy(xpath="//div[@class='l-hasSidebar clearfix']/div[@class='l-main mtl']/div[@class='account-order-list account-box']/div[@class='order-header order-header-changed']/h3[text()=' Order Number :900005933']")
	public WebElement ordernumberMO;
	
	@FindBy(xpath="//div[@class='l-hasSidebar clearfix']/div[@class='l-main mtl']/div[@class='account-order-list account-box']/div[@class='order-header order-header-changed']/h3[text()=' Order Number :900005933']/following-sibling::div[@class='display_number_items']/p/span[text()='1 item']")
	public WebElement orderitemcount;
	
	@FindBy(xpath="//div[@class='l-hasSidebar clearfix']/div[@class='l-main mtl']/div[@class='account-order-list account-box']/div[@class='order-header order-header-changed']/h3[text()=' Order Number :900005933']/following-sibling::div[@class='display_number_items']/div[@class='fleft float-left']/span[text()='01 Oct 2018']")
	public WebElement placedorderdate;
	
	@FindBy(xpath="//div[@class='l-hasSidebar clearfix']/div[@class='l-main mtl']/div[@class='account-order-list account-box']/div[@class='order-header order-header-changed']/h3[text()=' Order Number :900005933']/following-sibling::div[@class='display_number_items']/p/span[text()='Order Amount']")
	public WebElement orderamttext;
	
	@FindBy(xpath="//div[@class='l-hasSidebar clearfix']/div[@class='l-main mtl']/div[@class='account-order-list account-box']/div[@class='order-header order-header-changed']/h3[text()=' Order Number :900005933']/following-sibling::div[@class='display_number_items']/div[@class='fright' and text()='869']")
	public WebElement orderamount;
	
	@FindBy(xpath="//div[@class='l-hasSidebar clearfix']/div[@class='l-main mtl']/div[@class='account-order-list account-box']/div[@class='order-header order-header-changed']/h3[text()=' Order Number :900005933']//parent::div[@class='order-header order-header-changed']//following-sibling::div[@class='order-body orderbox orderContainerClear']/div[@style='width:100%']/a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html?38']/img[@src='http://static.fbbonline.in/media/product/78/821/1-gallery.jpg']")
	public WebElement myorderprdimg1;
	
	
	
}
