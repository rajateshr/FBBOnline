package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBBOrderSuccessPage {
	@FindBy(xpath="html/body/div[5]/div[2]/div[2]/div[1]/div[text()='Thank you for your purchase!']")
	public WebElement thankyouordermsg;
	
	@FindBy(xpath="html/body/div[5]/div[2]/div[2]/div[1]/div[3]/a/span[text()='Continue Shopping >> ']")
	public WebElement continueshop;
	
	@FindBy(xpath="html/body/div[5]/div[2]/div[2]/div[1]/div[4]/div/div/div[1]/h4/a[text()='Order Summary']")
	public WebElement ordersummary;
	
	@FindBy(xpath="//div[@class='shipping_top']/div[@class='ordersummaryboxborder expanded']/div[@class='summary_collapse']/div[@class='panel-body']/div[@class='shippingaddress']/p[@class='ordersummarytxt orderSuccessinfoText']/span[@class='cartamount' and text()='1,199']")
	public WebElement bagtotalSP;
	
	@FindBy(xpath="//div[@class='shipping_top']/div[@class='ordersummaryboxborder expanded']/div[@class='summary_collapse']/div[@class='panel-body']/div[@class='shippingaddress']/p[2]/span[@class='cartamountorange' and normalize-space(text()='379 ')]")
	public WebElement discountamt;
	
	@FindBy(xpath="//div[@class='shipping_top']/div[@class='ordersummaryboxborder expanded']/div[@class='summary_collapse']/div[@class='panel-body']/div[@class='shippingaddress']/p[3]/span[@class='cartamount' and normalize-space(text()='820')]")
	public WebElement subtotalOSP;
	
	@FindBy(xpath="//div[@class='shipping_top']/div[@class='ordersummaryboxborder expanded']/div[@class='summary_collapse']/div[@class='panel-body']/div[@class='shippingaddress']/p[4]/span[@class='cartamountorange' and normalize-space(text()='0')]")
	public WebElement coupondiscount;
	
	@FindBy(xpath="//div[@class='shipping_top']/div[@class='ordersummaryboxborder expanded']/div[@class='summary_collapse']/div[@class='panel-body']/div[@class='shippingaddress']/p[5]/span[@class='orderSuccessinfoText chargeable' and normalize-space(text()='49')]")
	public WebElement deliverychargeSP;
	
	@FindBy(xpath="//div[@class='shipping_top']/div[@class='ordersummaryboxborder expanded']/div[@class='summary_collapse']/div[@class='panel-body']/div[@class='shippingaddress']/div[@class='ordersummarytxt orderSuccessinfoText']/span[@class='cartamount']/b[text()='869']")
	public WebElement finalorderamt;
	
	@FindBy(xpath="//div[@class='shipping_top']/div[@class='ordersummaryboxborder expanded']/div[@class='summary_collapse']/div[@class='panel-body']/div[@class='shippingaddress']/p[6]/span[@class='cartamountorange' and normalize-space(text()='379')]")
	public WebElement totalsavingsSP;
	
	@FindBy(xpath="//div[@class='shipping_top']/div[@class='ordersummaryboxborder expanded']/div[@class='summary_collapse']/div[@class='panel-body']/div[@class='shippingaddress']/span[text()='Payment Method - CreditCard']")
	public WebElement paymentmethSP;
	
	@FindBy(xpath="html/body/div[5]/div[2]/div[2]/div[1]/div[5]/div/div/div[1]/h4/a[normalize-space(text='Shipping Address')]")
	public WebElement shippingaddrsHead;
	
	@FindBy(xpath="html/body/div[5]/div[2]/div[2]/div[1]/div[5]/div/div/div[2]/div/div")
	public WebElement deliveryaddress;
	
	@FindBy(xpath="html/body/div[5]/div[2]/div[1]/div/div/div/a/img[@src='https://preprod.fbbonline.in/images/evastra/fbb_logo_sp18.svg']")
	public WebElement fbblogoOSP;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/div[@class='onestepSummary_details onestepCommon']/div[@id='orderSummaryContent']/p[@class='ordersummarytxt']/span[@class='cartamount' and text()='1,199']")
	public WebElement bagtotal;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/div[@class='onestepSummary_details onestepCommon']/div[@id='orderSummaryContent']/p[2]/span[@class='cartamountorange' and text()='379']")
	public WebElement discountprice;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/div[@class='onestepSummary_details onestepCommon']/div[@id='orderSummaryContent']/p[3]/span[@class='cartamount' and text()='820']")
	public WebElement subtotalcout;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/div[@class='onestepSummary_details onestepCommon']/div[@id='orderSummaryContent']/p[5]/span[@class='cartamount' and text()='49']")
	public WebElement deliverycharges;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/div[@class='onestepSummary_details onestepCommon']/div[@id='orderSummaryContent']/p[6]/span[@class='cartamount']/b[normalize-space(text()='869')]")
	public WebElement finalorderamount;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/div[@class='onestepSummary_details onestepCommon']/div[@id='orderSummaryContent']/p[@class='ordersummarytxt odersummarymobile total_savings_text']/span[@class='cartamountorange' and normalize-space(text()='379')]")
	public WebElement totalsavings;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/div[@class='onestepSummary_details onestepCommon']/div[@id='orderSummaryContent']/div[@id='checkoutfixedbutton' and @class='cartcheckoutbutton2 disabled']/a[@class='PaymentLast']")
	public WebElement payamtdisabled;
	
	@FindBy(xpath="//div[@id='content']/form[@id='payment-form-new']/div[@id='Addaddresspopup']")
	public WebElement addaddresspop;
	
	@FindBy(xpath="//div[@id='content']/form[@id='payment-form-new']/div[@id='Addaddresspopup']/div/h3[text()='Add new delivery details']")
	public WebElement addadheading;
	
	@FindBy(xpath="//input[@id='ShippingAddressForm_first_name']")
	public WebElement addfname;
	
	@FindBy(xpath="//input[@id='ShippingAddressForm_last_name']")
	public WebElement addlname;
	
	@FindBy(xpath="//div[@class='Addnewaddress_outer new-address-block newdesktop-addr']/div[@class='address_details']/h3[text()='Address']")
	public WebElement addresshead;
	
	@FindBy(xpath="//input[@id='AddressForm_address1']")
	public WebElement addressline1;
	
	@FindBy(xpath="//input[@id='AddressForm_address2']")
	public WebElement addressline2;
	
	@FindBy(xpath="//input[@id='AddressForm_address3']")
	public WebElement addressline3;
	
	@FindBy(xpath="//input[@id='AddressForm_postcode']")
	public WebElement addresspostcode;
	
	@FindBy(xpath="//input[@id='AddressForm_city']")
	public WebElement addresscity;
	
	@FindBy(xpath="//select[@id='AddressForm_fk_customer_address_region']")
	public WebElement addressregion;
	
	@FindBy(xpath="//a[@class='save-delivery']")
	public WebElement savedelivery;
	
	@FindBy(xpath="//div[@id='location-mask']")
	public WebElement locationmask;
	
	@FindBy(xpath="//div[@class='onestepDelivery onestepCommon']/div[@id='changeOnestep_button']/a[text()='change']")
	public WebElement changeaddresslink;
	
	@FindBy(xpath="//div[@class='onestepDelivery onestepCommon']/div[@class='delivery_details']/div[@class='delivery_details']/p[text()='Rajatesh Rathnakar']")
	public WebElement deliveryfirstlastname;
	
	@FindBy(xpath="//div[@class='onestepDelivery onestepCommon']/div[@class='delivery_details']/div[@class='delivery_details']/p[text()='a-302,Coronet Greens Apartments,BELLANDUR GATE']")
	public WebElement deliveryaddressline1;
	
	@FindBy(xpath="//div[@class='onestepDelivery onestepCommon']/div[@class='delivery_details']/div[@class='delivery_details']/p[text()='SARJAPUR ROAD']")
	public WebElement deliveryaddressline2;
	
	@FindBy(xpath="//div[@class='onestepDelivery onestepCommon']/div[@class='delivery_details']/div[@class='delivery_details']/p[text()='BEHIND BIG BAZAAR']")
	public WebElement deliveryaddressline3;
	
	@FindBy(xpath="//div[@class='onestepDelivery onestepCommon']/div[@class='delivery_details']/div[@class='delivery_details']/p[text()='Bangalore 560066']")
	public WebElement citypincode;
	
	@FindBy(xpath="//div[@class='onestepDelivery onestepCommon']/div[@class='delivery_details']/div[@class='delivery_details']/p[text()='KAR']")
	public WebElement statecode;
	
	@FindBy(xpath="//div[@id='content']/form[@id='payment-form-new']/div[@class='savedPaymentpopup addPaymentPopup']")
	public WebElement addpaymentpopup;
	
	@FindBy(xpath="//div[@id='content']/form[@id='payment-form-new']/div[@class='savedPaymentpopup addPaymentPopup']/div[@class='newpayment']/h3[text()='Add new payment method']")
	public WebElement addnewpaymenttext;
	
	@FindBy(xpath="//form[@id='payment-form-new']/div[@class='savedPaymentpopup addPaymentPopup']/div[@class='newpayment']/form[@id='payment-form']/div[@class='product-tabs']/ul[@class='nav nav-justified custom-tab paymenttab']/li[@class='active']/a[text()='Credit card']")
	public WebElement creditcardheading;
	
	@FindBy(xpath="//div[@class='newpayment']/form[@id='payment-form']/div[@class='product-tabs']/div[@class='tab-content']/div[@id='creditcard']/div[@class='container_50']/div[@class='input-carttype']/input[@class='cards card_number']")
	public WebElement creditcardnametext;
	
	@FindBy(xpath="//div[@class='newpayment']/form[@id='payment-form']/div[@class='product-tabs']/div[@class='tab-content']/div[@id='creditcard']/div[@class='container_50']/div[@class='card_holder']/input[@class='cards']")
	public WebElement cardholdername;
	
	@FindBy(xpath="//div[@class='newpayment']/form[@id='payment-form']/div[@class='product-tabs']/div[@class='tab-content']/div[@id='creditcard']/div[@class='container_50']/div[@class='month-year-ccv top-card-value']/div[@class='leftpayment']/div[@class='left_float container_48 expmonth']/input[@id='ccmonth_year']")
	public WebElement ccmonthyear;
	
	@FindBy(xpath="//div[@class='newpayment']/form[@id='payment-form']/div[@class='product-tabs']/div[@class='tab-content']/div[@id='creditcard']/div[@class='container_50']/div[4]/div[@class='maringleft left_float container_40']/label/input[@class='selectCheck']")
	public WebElement checksavecarddetails;
	
	@FindBy(xpath="//div[@class='newpayment']/form[@id='payment-form']/div[@class='product-tabs']/div[@class='tab-content']/div[@id='creditcard']/div[@class='container_50']/div[4]/div[@class='cards_block']/p[text()='We accept:']")
	public WebElement weaccepttext;
	
	@FindBy(xpath="//div[@class='newpayment']/form[@id='payment-form']/div[@class='product-tabs']/div[@class='tab-content']/div[@id='creditcard']/div[@class='container_50']/div[4]/div[@class='cards_block']/img[@src='//preprod.fbbonline.in/images/evastra/payment_method5.png']")
	public WebElement cardimages;
	
	@FindBy(xpath="html/body/div[6]/form/div[6]/div/div/a[text()='save card details']")
	public WebElement savecarddetails;
	
	@FindBy(xpath="//div[@class='checkout_cart_summary']/div[@class='summary--view']/div[@id='orderSummaryContent']/div[@class='onestepPayment onestepCommon']/h3[text()='Payment details']")
	public WebElement paymentdetails;

	@FindBy(xpath="//div[@class='checkout_cart_summary']/div[@class='summary--view']/div[@id='orderSummaryContent']/div[@class='onestepPayment onestepCommon']/div[@class='payment_details']/div[@class='payment_details']/p[text()='Test']")
	public WebElement cardholdername1;
	
	@FindBy(xpath="//div[@class='checkout_cart_summary']/div[@class='summary--view']/div[@id='orderSummaryContent']/div[@class='onestepPayment onestepCommon']/div[@class='payment_details']/div[@class='payment_details']/p[2]/span[text()='5123-45XX-XXXX-2346']")
	public WebElement cardnumber;
	
	@FindBy(xpath="//div[@class='onestepPayment onestepCommon']/div[@class='payment_details']/div[@class='payment_details']/div[@class='card_expiry_details']/div[@class='col-xs-6 col-sm-3 col-md-3 date_expiry' and text()='05/2020']")
	public WebElement expirydate;
	
	@FindBy(xpath="//div[@class='onestepPayment onestepCommon']/div[@class='payment_details']/div[@class='payment_details']/div[@class='card_expiry_details']/div[@class='col-xs-6 col-sm-3 col-md-3 card-Cvv']/span[text()='cvv']")
	public WebElement cvvheading;
	
	@FindBy(xpath="//div[@class='onestepPayment onestepCommon']/div[@class='payment_details']/div[@class='payment_details']/div[@class='card_expiry_details']/div[@class='col-xs-6 col-sm-3 col-md-3 card-Cvv']/input[@id='store_cards_cvv']")
	public WebElement cvvtext;
	
	@FindBy(xpath="//div[@class='summary--view']/div[@id='orderSummaryContent']/div[@class='onestepSummary_details onestepCommon']/div[@id='orderSummaryContent']/div[@id='checkoutfixedbutton' and @class='cartcheckoutbutton2']/a[@class='PaymentLast']")
	public WebElement payamtenabled;

}
