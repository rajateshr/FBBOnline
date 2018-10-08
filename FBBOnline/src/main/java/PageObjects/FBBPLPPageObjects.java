package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBBPLPPageObjects {
	@FindBy(xpath="//div[@class='filterby_left']/div[@id='newFltCls12']/div[@class='fliterpartialleft']/ul/li[@class='fct brands']/div[text()='Brand']")
	public WebElement brandfilterattr;
	
	@FindBy(xpath="//div[@id='newFltCls12']/div[@class='fliterpartialleft']/ul/li[@class='fct brands filterselect']/div[@class='fct-bd fss refineListBox fab-filter facet_brand']/ul[@id='facet_brand']/li[normalize-space(@class='cnv-level-1 brand-li')]/a[@href='https://preprod.fbbonline.in/women/footwear/haute-spicy/' and normalize-space(text()='Haute & Spicy')]")
	public WebElement brandfiltervalue;
	
	@FindBy(xpath="//div[@id='newFltCls12']/div[@class='fliterpartialleft']/ul/li[@class='fct brands filterselect']/div[@class='fct-bd fss refineListBox fab-filter facet_brand']/ul[@id='facet_brand']/li[normalize-space(@class='cnv-level-1 brand-li')]/input[@value='haute-spicy']")
	public WebElement brandfiltercheckbox;
	
	@FindBy(xpath="//div[@class='filterby_left']/div[@id='newFltCls12']/div[@class='fliterpartialleft']/ul/li[@id='price-fltr']/div[@data-refinebyname='price']")
	public WebElement pricefilterattr;
	
	@FindBy(xpath="//a[@href='https://preprod.fbbonline.in/women/footwear/haute-spicy/?price=700-1000']")
	public WebElement pricefiltervalue;
	
	@FindBy(xpath="//a[@href='https://preprod.fbbonline.in/women/footwear/haute-spicy/?price=700-1000']/input[@name='price']")
	public WebElement pricefiltercheckbox;
	
	@FindBy(xpath="//div[@data-sku='HA041OO12TBRINFUR']/following-sibling::div[@class='product-thumb']/a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html']")
	public WebElement productskubox;
	
	@FindBy(xpath="//div[@data-sku='HA041OO12TBRINFUR']/following-sibling::div[@class='product-thumb']/following-sibling::div[@class='product-info']/div[@class='price_sec']/span[@class='product-price' and text()='840']")
	public WebElement productspecialprice;
	
	@FindBy(xpath="//div[@data-sku='HA041OO12TBRINFUR']/following-sibling::div[@class='product-thumb']/following-sibling::div[@class='product-info']/div[@class='price_sec']/span[@class='old-price' and text()='1,199']")
	public WebElement productoldprice;
	
	@FindBy(xpath="//div[@data-sku='HA041OO12TBRINFUR']/following-sibling::div[@class='product-thumb']/following-sibling::div[@class='product-info']/div[@class='price_sec']/span[@class='discounts' and text()='30% off']")
	public WebElement productdiscount;
	
	@FindBy(xpath="//div[@data-sku='HA041OO12TBRINFUR']/following-sibling::div[@class='product-thumb']/following-sibling::div[@class='product-info']/div[@class='product_des']/a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html']/div[@class='product-description']/b[text()='Haute & Spicy']")
	public WebElement productbrandname;
	
	@FindBy(xpath="//div[@data-sku='HA041OO12TBRINFUR']/following-sibling::div[@class='product-thumb']/following-sibling::div[@class='product-info']/div[@class='product_des']/a[@href='https://preprod.fbbonline.in/Studded-Lace-Up-Shoes-12887.html']/div[@class='product-description' and normalize-space(text()='Studded Lace-Up Shoes')]")
	public WebElement productnameplp;
	
		
}
