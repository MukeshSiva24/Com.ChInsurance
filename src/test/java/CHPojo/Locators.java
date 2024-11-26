package CHPojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CHCommonMethods.BaseClass;

public class Locators {
	
	BaseClass base=BaseClass.getInstance();
	
	public Locators() {
		PageFactory.initElements(base.driver, this);
	}
	
	
	@FindBy(xpath = "//div[@class=\"yRj2ms\"]//following::p[contains(text(),'SERVICES')]")
	private WebElement mouseActionService;
	
	@FindBy(xpath = "//p[text()=\"Personal Insurance\"]")
	private WebElement personalInsu;
	
	@FindBy(xpath = "//span[text()='Personal Insurance']")
	private WebElement personalInsurancePage;
	
	@FindBy(xpath = "//p[text()='Claims Contacts']")
	private WebElement claimsContacts;
	
	@FindBy(xpath = "//p[text()='Commercial Insurance']")
	private WebElement commercialInsurance;
	
	@FindBy(xpath = "//p[text()='Risk Management']")
	private WebElement rishManagement;
	
	@FindBy(xpath = "//p[text()='Data Breach']")
	private WebElement dataBreach;
	
	@FindBy(xpath = "//span[contains(text(),'Click here to begin policy review')]")
	private WebElement reviewButton;
	
	@FindBy(xpath = "(//div[@id=\"comp-kdi6bxxj\"]/descendant::span)[2]")
	private WebElement letsTalk;
	
	@FindBy(xpath = "//span[text()='Address']")
	private WebElement address;
	
	@FindBy(xpath = "//button[text()='Map']")
	private WebElement map;
	
	@FindBy(xpath = "//button[text()='Satellite']")
	private WebElement satellite;
	
	@FindBy(xpath = "//button[@title=\"Toggle fullscreen view\"]")
	private WebElement fullScreen;
	
	@FindBy(xpath = "//button[@title=\"Zoom in\"]")
	private WebElement zoomIn;
	
	@FindBy(xpath = "//button[@title=\"Zoom out\"]")
	private WebElement zoomOut;
	
	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name=\"subject\"]")
	private WebElement subject;
	
	@FindBy(xpath = "//textarea[@id=\"textarea_comp-kdi6c1te\"]")
	private WebElement message;
	
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath ="//button[@data-testid=\"close-btn\"]")
	private WebElement close;
	
	@FindBy(xpath = "//span[text()='Thanks for submitting!']")
	private WebElement successMessage;
	
	@FindBy(xpath= "//div[@class=\"recaptcha-checkbox-border\"]")
	private WebElement robote;

	@FindBy(xpath = "//wix-iframe[@title=\"Google Maps\"]")
	private WebElement mapFrame;
	
	@FindBy(xpath = "//iframe[@title=\"Google Maps\"]")
	private WebElement mapFrame1;
	
	@FindBy(xpath ="//p[contains(text(),'Please confirm you')]")
	private WebElement robotConfirm;
	
	
	
	@FindBy(xpath ="//p[text()='HI-5 BLOG']")
	private WebElement hi5Blog;
	
	@FindBy(xpath ="//div[@class=\"Y0bxin\"]/descendant::a[text()='Personal Insurance']")
	private WebElement postPersonalInsurance;
	
	@FindBy(xpath ="//p[text()='Message from CH President about COVID 19']")
	private WebElement topPersonalInsuPost;
	
	@FindBy(xpath ="//span[text()='Message from CH President about COVID 19']")
	private WebElement personalInsurNavigatePost;
	
	@FindBy(xpath ="//span[@class=\"h7K_lu\"]/preceding::button[@class=\"Kh5HMz\"]")
	private WebElement likeSimple;
	
	@FindBy(xpath ="//span[@class=\"FYRNvd like-button-with-count__like-count\"]")
	private WebElement likeNo;
	
	@FindBy(xpath ="//h2[text()='Comments']")
	private WebElement comment;
	
	@FindBy(xpath ="//span[text()='HOME']")
	private WebElement home;
	
	@FindBy(xpath ="(//span[text()='Write a comment...'])[2]")
	private WebElement EnterComment;
	
	@FindBy(xpath="//p[@data-placeholder=\"Write a comment...\"]")
	private WebElement writeComment;
	
	@FindBy(xpath="(//div[@class=\"sAQ0aY2\"])[1]")
	private WebElement commentEmoji;
	
	@FindBy(xpath ="//div[text()='😎']")
	private WebElement commentGethuEmoji;
	
	@FindBy(xpath ="(//div[@class=\"sAQ0aY2\"])[3]")
	private WebElement commentGIF;
	
	@FindBy(xpath ="//input[@placeholder=\"Search for a GIF\"]")
	private WebElement commentGIFISearch;
	
	@FindBy(xpath ="//div[@id=\"9pZw57AyqOHy47oSZq-parent\"]")
	private WebElement commentHappyGIFI;
	
	@FindBy(xpath ="(//button[@class=\"u-H-i\"])[1]")
	private WebElement commentGIFISize;
	
	@FindBy(xpath ="//div[text()='Compact']")
	private WebElement commentGIFISizeCompact;
	
	@FindBy(xpath ="(//button[@class=\"u-H-i\"])[2]")
	private WebElement commentGIFIAligment;
	
	@FindBy(xpath="//div[text()='Align left']")
	private WebElement commentGIFILeftAligment;
	
	@FindBy(xpath ="//button[text()='Cancel']")
	private WebElement commentCancel;
	
	@FindBy(xpath="//span[text()='Discard']")
	private WebElement commentDiscard;
	
	
	
	
	
	
	@FindBy(xpath ="//p[text()='CONTACT']")
	private WebElement contactModule;
	
	@FindBy(xpath ="//a[text()='Locations']")
	private WebElement location;
	
	@FindBy(xpath ="//a[contains(text(),'CH Insurance Syracuse')]")
	private WebElement chInsuranceContact;
	
	@FindBy(xpath ="//div[@id=\"bgLayers_comp-l9oguyot\"]")
	private WebElement chInsuranceContactPage;
	
	@FindBy(xpath ="//button[@aria-label=\"Drag Pegman onto the map to open Street View\"]")
	private WebElement screetView;
	
	@FindBy(xpath ="(//button[@title=\"Toggle fullscreen view\"])[2]")
	private WebElement fullScreenContact;
	
	@FindBy(xpath ="//button[@title=\"Exit the Street View\"]")
	private WebElement backButtonContact;
	
	
	
	
	@FindBy(xpath="//p[text()='24/7 Client Access']")
	private WebElement clientAccessModule;
	
	@FindBy(xpath="//div[@id=\"comp-lsc561v1\"]")
	private WebElement CSR24Login;
	
	@FindBy(xpath="//div[@class=\"login-content adsg-elevation-4 \"]")
	private WebElement loginPageNavigated;
	
	@FindBy(xpath="//input[@id=\"Username\"]")
	private WebElement userNameLogin;
	
	@FindBy(xpath="//input[@id=\"Password\"]")
	private WebElement passwordLogin;
	
	@FindBy(xpath="//input[@class=\"primary-button\"]")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[@class=\"validation-message\"]")
	private WebElement inValideMessage;
	
	
	
	
	@FindBy(xpath="//a[contains(text(),'Create New Account')]")
	private WebElement createNewAccount;
	
	@FindBy(xpath="//input[@id=\"Email\"]")
	private WebElement emailIdCreate;
	
	@FindBy(xpath="//input[@id=\"Phone\"]")
	private WebElement phoneNoCreate;
	
	@FindBy(xpath="//input[@id=\"PolicyNumber\"]")
	private WebElement policyNoCreate;
	
	@FindBy(xpath="//button[text()='Create Account']")
	private WebElement createAccountButton;
	
	
	
	public WebElement getMouseActionService() {
		return mouseActionService;
	}

	public WebElement getPersonalInsu() {
		return personalInsu;
	}

	public WebElement getReviewButton() {
		return reviewButton;
	}

	public WebElement getLetsTalk() {
		return letsTalk;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getMap() {
		return map;
	}

	public WebElement getSatellite() {
		return satellite;
	}

	public WebElement getFullScreen() {
		return fullScreen;
	}

	public WebElement getZoomIn() {
		return zoomIn;
	}

	public WebElement getZoomOut() {
		return zoomOut;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSuccessMessage() {
		return successMessage;
	}

	public WebElement getClaimsContacts() {
		return claimsContacts;
	}

	public WebElement getCommercialInsurance() {
		return commercialInsurance;
	}

	public WebElement getRiskManagement() {
		return rishManagement;
	}

	public WebElement getDataBreach() {
		return dataBreach;
	}

	public WebElement getPersonalInsurancePage() {
		return personalInsurancePage;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getRobote() {
		return robote;
	}

	public WebElement getMapFrame() {
		return mapFrame;
	}

	public WebElement getMapFrame1() {
		return mapFrame1;
	}

	public WebElement getRobotConfirm() {
		return robotConfirm;
	}

	public WebElement getRishManagement() {
		return rishManagement;
	}

	public WebElement getHi5Blog() {
		return hi5Blog;
	}

	public WebElement getPostPersonalInsurance() {
		return postPersonalInsurance;
	}

	public WebElement getTopPersonalInsuPost() {
		return topPersonalInsuPost;
	}

	public WebElement getPersonalInsurNavigatePost() {
		return personalInsurNavigatePost;
	}

	public WebElement getLikeSimple() {
		return likeSimple;
	}

	public WebElement getLikeNo() {
		return likeNo;
	}

	public WebElement getContactModule() {
		return contactModule;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getChInsuranceContact() {
		return chInsuranceContact;
	}

	public WebElement getChInsuranceContactPage() {
		return chInsuranceContactPage;
	}

	public WebElement getScreetView() {
		return screetView;
	}

	public WebElement getFullScreenContact() {
		return fullScreenContact;
	}

	public WebElement getBackButtonContact() {
		return backButtonContact;
	}

	public WebElement getClientAccessModule() {
		return clientAccessModule;
	}

	public WebElement getCSR24Login() {
		return CSR24Login;
	}

	public WebElement getLoginPageNavigated() {
		return loginPageNavigated;
	}

	public WebElement getUserNameLogin() {
		return userNameLogin;
	}

	public WebElement getPasswordLogin() {
		return passwordLogin;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getInValideMessage() {
		return inValideMessage;
	}

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public WebElement getEmailIdCreate() {
		return emailIdCreate;
	}

	public WebElement getPhoneNoCreate() {
		return phoneNoCreate;
	}

	public WebElement getPolicyNoCreate() {
		return policyNoCreate;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public WebElement getComment() {
		return comment;
	}

	public WebElement getCommentEmoji() {
		return commentEmoji;
	}

	public WebElement getCommentGethuEmoji() {
		return commentGethuEmoji;
	}

	public WebElement getCommentGIF() {
		return commentGIF;
	}

	public WebElement getCommentCancel() {
		return commentCancel;
	}

	public WebElement getEnterComment() {
		return EnterComment;
	}

	public WebElement getCommentGIFISearch() {
		return commentGIFISearch;
	}

	public WebElement getCommentHappyGIFI() {
		return commentHappyGIFI;
	}

	public WebElement getCommentGIFISize() {
		return commentGIFISize;
	}

	public WebElement getCommentGIFISizeCompact() {
		return commentGIFISizeCompact;
	}

	public WebElement getCommentGIFIAligment() {
		return commentGIFIAligment;
	}

	public WebElement getCommentGIFILeftAligment() {
		return commentGIFILeftAligment;
	}

	public WebElement getCommentDiscard() {
		return commentDiscard;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getWriteComment() {
		return writeComment;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
