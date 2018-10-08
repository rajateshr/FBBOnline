package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBBPDPPageObjects {
	@FindBy(xpath="//div[@class='size-left']/span[@data-js-variant='HA041OO12TBRINFUR-75961' and text()='36']")
	public WebElement pdpsizeselect;
	
	@FindBy(xpath="//input[@value='HA041OO12TBRINFUR']/following-sibling::div[@class='summary1 entry-summary p_btm5 m_btm15 offer_msg_exist']/h1[@class='pdp-headtitle']/span[@class='entry-title prod--brandname m_right5']/a[text()='Haute & Spicy']")
	public WebElement pdpproductbrandname;
	
	@FindBy(xpath="//input[@value='HA041OO12TBRINFUR']/following-sibling::div[@class='summary1 entry-summary p_btm5 m_btm15 offer_msg_exist']/h1[@class='pdp-headtitle']/span[@class='entry-title prod--brandname m_right5']/following-sibling::span[text()='Studded Lace-Up Shoes']")
	public WebElement pdpproductname;
	
	@FindBy(xpath="//input[@value='HA041OO12TBRINFUR']/following-sibling::div[@class='summary1 entry-summary p_btm5 m_btm15 offer_msg_exist']/div[@class='price']/span[@class='old-price-pdp' and text()='1,199']")
	public WebElement pdpoldprice;
	
	@FindBy(xpath="//input[@value='HA041OO12TBRINFUR']/following-sibling::div[@class='summary1 entry-summary p_btm5 m_btm15 offer_msg_exist']/div[@class='price']/span[@class='product-price-pdp' and text()='840']")
	public WebElement pdpspprice;
	
	@FindBy(xpath="//input[@value='HA041OO12TBRINFUR']/following-sibling::div[@class='summary1 entry-summary p_btm5 m_btm15 offer_msg_exist']/div[@class='price']/span[@class='discounts-pdp' and text()='30% off']")
	public WebElement pdpdiscount;
	
	@FindBy(xpath="//div[@class='add-to-button']/button[@class='addtocartbutton-pdp config add-to-bag-disble']")
	public WebElement addcartbutton;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[1]/a/span[@class='shopping_bag']")
	public WebElement shoppingbagicon;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[1]/a/span[text()='1']")
	public WebElement carticoncount;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[1]/div[@class='mini-cart-content cart_bag_inside']")
	public WebElement cartpopupdisplay;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[1]/div/div[2]/a[@class='btn-view-cart']")
	public WebElement viewcartbutton;
	
	@FindBy(xpath="//ul/li/div[@class='product-thumb']/a[@href='https://preprod.fbbonline.in/Crew Neck T-Shirt-13043.html?L']//parent::div[@class='product-thumb']//following-sibling::div[@class='product-info']/span[@class='product-name']/a[@href='https://preprod.fbbonline.in/Champion']/span[text()='Champion']")
	public WebElement cartpopupbrand;
	
	@FindBy(xpath="//ul[@class='list-cart-product']/li/div[@class='product-thumb']/a[@href='https://preprod.fbbonline.in/Crew Neck T-Shirt-13043.html?L']//parent::div[@class='product-thumb']//following-sibling::div[@class='product-info']/span[@class='product-desc']/a[text()='Crew Neck T-Shirt']")
	public WebElement cartpopupprodname;
	
	@FindBy(xpath="//ul[@class='list-cart-product']/li/div[@class='product-thumb']/a[@href='https://preprod.fbbonline.in/Crew Neck T-Shirt-13043.html?L']//parent::div[@class='product-thumb']//following-sibling::div[@class='product-info']/div[@class='price_area']/span[normalize-space(text()='399')]")
	public WebElement cartpopupprodprice;
	
	@FindBy(xpath="//div[@class='icon-bag mini-cart mini-cart-block']/div[@class='mini-cart-content cart_bag_inside']/div[@class='sub-toal-wapper']/span[text()='Subtotal']")
	public WebElement subtotal;
	
	@FindBy(xpath="//div[@class='icon-bag mini-cart mini-cart-block']/div[@class='mini-cart-content cart_bag_inside']/div[@class='sub-toal-wapper']/span[text()='399']")
	public WebElement subtotalvalue;
	
	@FindBy(xpath="//div[@class='icon-bag mini-cart mini-cart-block']/div[@class='mini-cart-content cart_bag_inside']/div[@class='sub-toal-wapper']/span[text()='49']")
	public WebElement deliverychargevalue;
	
	@FindBy(xpath="//div[@class='icon-bag mini-cart mini-cart-block']/div[@class='mini-cart-content cart_bag_inside']/div[@class='sub-toal-wapper final_total']/span[text()='448']")
	public WebElement finalsubtotalvalue;
	
}
