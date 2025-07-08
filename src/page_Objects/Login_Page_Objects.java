package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page_Objects {
	
	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div/p")
	public static WebElement loginOrCreate;
	@FindBy(xpath = "//a[@id='webklipper-publisher-widget-container-notification-close-div']")
    public static WebElement Ads;
	@FindBy(xpath  = "//input[@id='username'and@class='font14 fullWidth']")
	public static WebElement username;
	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button")
	public static WebElement continuebutton;
	@FindBy(id = "password")
	public static WebElement password;
	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button")
	public static WebElement loginbutton;
	@FindBy(id = "second-img")
	public static WebElement imageWindow;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/main/main/div[1]/div[2]/ul/li[2]/div/span")
	public static WebElement Insurance;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div")
    public static WebElement googleicon;
    @FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/div[1]/ul/li[2]")
    public static WebElement Mybizac;
    
}
