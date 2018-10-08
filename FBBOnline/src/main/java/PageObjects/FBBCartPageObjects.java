package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBBCartPageObjects {
	/*@FindBy(xpath="//a[@href='https://preprod.fbbonline.in/Crew-Neck-T-Shirt-13043.html?size=L']/img[@src='http://static.fbbonline.in/media/product/34/031/2-top_sel_160.jpg']")
	public WebElement productimg1;*/
	
	/*@FindBy(xpath="//div[@id='global_cart']/div[@id='left-cart-container']/div[@id='cart_sec']/div[@class='tab-content cart_tab_content']/div[@class='active tab-pane']/div[contains(@class,'row productsaved')]/div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']/a[@href='https://preprod.fbbonline.in/Crew-Neck-T-Shirt-13043.html?size=L']//parent::div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']//following-sibling::div[@class='col-lg-10 col-sm-9 col-md-10 col-xs-8 leftAlignLineItem']/div[@class='clr']/div[@class='size_spec cartChanges-sepc']/span[text()='L']")
	public WebElement productsize1;*/
	
	/*@FindBy(xpath="//div[contains(@class,'row productsavedrow')]/div[contains(@class,'col-lg-10 col-sm-9 col-md-10 col-xs-8')]/div[4]/a[@href='https://preprod.fbbonline.in/Crew-Neck-T-Shirt-13043.html?size=L' and normalize-space(text()='Champion Crew Neck T-Shirt')]")
	public WebElement productname1;*/
	
	/*@FindBy(xpath="//div[@class='tab-content cart_tab_content']/div[@class='active tab-pane']/div[@class='row productsavedrow p_right0']/div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']/a[@href='https://preprod.fbbonline.in/Crew-Neck-T-Shirt-13043.html?size=L']//parent::div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']//following-sibling::div[@class='col-lg-10 col-sm-9 col-md-10 col-xs-8 leftAlignLineItem']/div[3]/div[@class='selectfeild cartChanges-sepc']/span[text()='1']")
	public WebElement productquantity1;*/
	
	/*@FindBy(xpath="//a[@href='https://preprod.fbbonline.in/Crew-Neck-T-Shirt-13043.html?size=S']/img[@src='http://static.fbbonline.in/media/product/34/031/2-top_sel_160.jpg']")
	public WebElement productimg2;*/
	
	/*@FindBy(xpath="//div[@id='global_cart']/div[@id='left-cart-container']/div[@id='cart_sec']/div[@class='tab-content cart_tab_content']/div[@class='active tab-pane']/div[contains(@class,'row productsaved')]/div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']/a[@href='https://preprod.fbbonline.in/Crew-Neck-T-Shirt-13043.html?size=S']//parent::div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']//following-sibling::div[@class='col-lg-10 col-sm-9 col-md-10 col-xs-8 leftAlignLineItem']/div[@class='clr']/div[@class='size_spec cartChanges-sepc']/span[text()='S']")
	public WebElement productsize2;*/

	/*@FindBy(xpath="//div[contains(@class,'row productsavedrow')]/div[contains(@class,'col-lg-10 col-sm-9 col-md-10 col-xs-8')]/div[4]/a[@href='https://preprod.fbbonline.in/Crew-Neck-T-Shirt-13043.html?size=S' and normalize-space(text()='Champion Crew Neck T-Shirt')]")
	public WebElement productname2;*/
	
	/*@FindBy(xpath="//div[@class='tab-content cart_tab_content']/div[@class='active tab-pane']/div[@class='row productsavedrow p_right0']/div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']/a[@href='https://preprod.fbbonline.in/Crew-Neck-T-Shirt-13043.html?size=S']//parent::div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']//following-sibling::div[@class='col-lg-10 col-sm-9 col-md-10 col-xs-8 leftAlignLineItem']/div[3]/div[@class='selectfeild cartChanges-sepc']/span[text()='1']")
	public WebElement productquantity2;*/
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[normalize-space(text()='Bag Total')]/span[text()='1,199']")
	public WebElement bagtotal;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[@class='ordersummarytxt']/span[@class='cartamountorange' and normalize-space(text()='379')]")
	public WebElement discount;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[4]/span[normalize-space(text()='820')]")
	public WebElement subtotal;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[5]/span/b[text()='Apply Coupon']")
	public WebElement applycoupon;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[6]/span[normalize-space(text()='49')]")
	public WebElement deliverycharge;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[7]/span/b[normalize-space(text()='869')]")
	public WebElement finalorderamt;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[8]/span[normalize-space(text()='379')]")
	public WebElement totalsavings;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/div[@id='checkoutfixedbutton']/a[@href='https://preprod.fbbonline.in/onestepcheckout/index/web/']/span[text()='PROCEED TO CHECKOUT']")
	public WebElement checkoutbutton;
	
	@FindBy(xpath="html/body/header/div/div/div/div[4]/div[1]/a/span[@class='shopping_bag']")
	public WebElement carticon;

	@FindBy(xpath="//div[@class='mini-cart-content cart_bag_inside']")
	public WebElement cartpopup;
	
	@FindBy(xpath="//div[@class='mini-cart-content cart_bag_inside']/div[@class='cartcontent witOutSrch scrollbox']/ul[@class='list-cart-product']/li/div[@class='product-thumb']/a[@href='https://preprod.fbbonline.in/Studded Lace-Up Shoes-12887.html?36']/img[@src='http://static.fbbonline.in/media/product/78/821/1-top_sel_100.jpg']")
	public WebElement prodcartimageCPU;
	
	@FindBy(xpath="//div[@class='cartcontent witOutSrch scrollbox']/ul[@class='list-cart-product']/li/div[@class='product-info']/span[@class='product-desc']/a[@href='https://preprod.fbbonline.in/Studded Lace-Up Shoes-12887.html?36']")
	public WebElement cartprodname;
	
	@FindBy(xpath="//div[@class='cartcontent witOutSrch scrollbox']/ul[@class='list-cart-product']/li/div[@class='product-info']/span[@class='product-desc']/a[@href='https://preprod.fbbonline.in/Studded Lace-Up Shoes-12887.html?36']/parent::span[@class='product-desc']/following-sibling::div[@class='clr']/following-sibling::div[@class='attr_area']/following-sibling::div[@class='price_area']/span[text()='1,199']")
	public WebElement priceCPO;
	
	@FindBy(xpath="//div[@class='cartcontent witOutSrch scrollbox']/ul[@class='list-cart-product']/li/div[@class='product-info']/span[@class='product-desc']/a[@href='https://preprod.fbbonline.in/Studded Lace-Up Shoes-12887.html?36']/parent::span[@class='product-desc']/following-sibling::div[@class='clr']/following-sibling::div[@class='attr_area']/following-sibling::div[@class='price_area']/span[text()='32%  off']")
	public WebElement percentCPO;
	
	@FindBy(xpath="//div[@class='cartcontent witOutSrch scrollbox']/ul[@class='list-cart-product']/li/div[@class='product-info']/span[@class='product-desc']/a[@href='https://preprod.fbbonline.in/Studded Lace-Up Shoes-12887.html?36']/parent::span[@class='product-desc']/following-sibling::div[@class='clr']/following-sibling::div[@class='attr_area']/following-sibling::div[@class='price_area']/span[text()='820 ']")
	public WebElement specialpriceCPO;
	
	@FindBy(xpath="//div[@class='icon-bag mini-cart mini-cart-block']/div[@class='mini-cart-content cart_bag_inside']/div[@class='sub-toal-wapper']/span[text()='Subtotal']/following-sibling::span[text()='820']")
	public WebElement subtotalCPU;
	
	@FindBy(xpath="//div[@class='icon-bag mini-cart mini-cart-block']/div[@class='mini-cart-content cart_bag_inside']/div[@class='sub-toal-wapper']/span[text()='Delivery Charges']/following-sibling::span[text()='49']")
	public WebElement deliverychargeCPU;
	
	@FindBy(xpath="//div[@class='icon-bag mini-cart mini-cart-block']/div[@class='mini-cart-content cart_bag_inside']/div[@class='sub-toal-wapper final_total']/span[text()='Order Amount']/following-sibling::span[text()='869']")
	public WebElement orderamount;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p/span[text()='Order Summary']")
	public WebElement ordersummary;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[2]/span[@class='cartamount' and text()='1,199']")
	public WebElement bagtotalCP;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[3]/span[@class='cartamountorange' and  normalize-space(text()='379')]")
	public WebElement discountCP;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[4]/span[@class='cartamount' and  normalize-space(text()='820')]")
	public WebElement subtotalCP;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[5]/span[@class='cartamountorange']/b[text()='Apply Coupon']")
	public WebElement applycouponCP;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[6]/span[@class='cartamount' and  normalize-space(text()='49')]")
	public WebElement deliverychargeCP;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[7]/span[@class='cartamount']/b[normalize-space(text()='869')]")
	public WebElement finalorderamountCP;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/p[8]/span[@class='cartamountorange' and normalize-space(text()='379')]")
	public WebElement totalsavingsCP;
	
	@FindBy(xpath="//div[@class='tab-content cart_tab_content']/div[@class='active tab-pane']/div[2]/div[1]/a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html?size=38']/parent::div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']/following-sibling::div[@class='col-lg-10 col-sm-9 col-md-10 col-xs-8 leftAlignLineItem']/div/span[@class='text-right fr original_price' and text()='820']")
	public WebElement cartpageSP;
	
	@FindBy(xpath="//div[@class='tab-content cart_tab_content']/div[@class='active tab-pane']/div[2]/div[1]/a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html?size=39']/parent::div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']/following-sibling::div[@class='col-lg-10 col-sm-9 col-md-10 col-xs-8 leftAlignLineItem']/div/span[@class='old-price-cartpage' and text()='1,199']")
	public WebElement cartpageOP;
	
	@FindBy(xpath="//div[@class='tab-content cart_tab_content']/div[@class='active tab-pane']/div[2]/div[1]/a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html?size=39']/parent::div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']/following-sibling::div[@class='col-lg-10 col-sm-9 col-md-10 col-xs-8 leftAlignLineItem']/div/span[@class='text-right fr off_text' and text()='32%  off']")
	public WebElement cartpageDP;
	
	@FindBy(xpath="//div[@class='tab-content cart_tab_content']/div[@class='active tab-pane']/div[2]/div[@class='col-lg-10 col-sm-9 col-md-10 col-xs-8 leftAlignLineItem']/div[4]/a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html?size=38' and normalize-space(text())='Haute & Spicy Studded Lace-Up Shoes']")
	public WebElement productnameCP;
	
	@FindBy(xpath="//div[@class='tab-content cart_tab_content']/div[@class='active tab-pane']/div[2]/div[1]/a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html?size=38']/parent::div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']/following-sibling::div[@class='col-lg-10 col-sm-9 col-md-10 col-xs-8 leftAlignLineItem']/div/div[@class='selectfeild cartChanges-sepc']/span[@class='cart--value' and text()='1' ]")
	public WebElement productqty;
	
	@FindBy(xpath="//a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html?size=38']/parent::div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']/following-sibling::div[@class='col-lg-10 col-sm-9 col-md-10 col-xs-8 leftAlignLineItem']/div[@class='clr']/div[@class='size_spec cartChanges-sepc']/span[@class='cart--value' and text()='38' ]")
	public WebElement productsize;
	
	@FindBy(xpath="//a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html?size=39']/parent::div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']/following-sibling::div[@class='col-lg-10 col-sm-9 col-md-10 col-xs-8 leftAlignLineItem']/div[5]/div[@class='pull-left']/div[@class='offer-value-text cartrule-displayname']/em[text()='Test Cancel Promotion with multiple qty']")
	public WebElement lineitempromoname;
	
	@FindBy(xpath="//div[@class='col-lg-2 col-sm-3 col-md-2 col-xs-4 img_sec']/a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html?size=3']/following-sibling::div[@class='lineitem-offer-applied']/img[@src='http://static.fbbonline.in/media/product/78/821/1-top_sel_160.jpg' and @alt='Fbb Offer Applied']")
	public WebElement offerapplied;
	
	
}
