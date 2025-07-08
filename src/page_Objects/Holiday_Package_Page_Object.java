package page_Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Holiday_Package_Page_Object {
	
	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[4]/div/a/span[1]")
	public static WebElement Holidaypackagebutton;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/ul/li[1]")
	public static WebElement search;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/ul/li[2]")
	public static WebElement Easyvisa;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div[1]/ul/li[3]")
	public static WebElement visafree;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/ul[2]/li[1]")
	public static WebElement nepal;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/ul[1]/li[1]")
	public static WebElement visaonarrivalbali;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/ul[1]/li[2]")
	public static WebElement visaonarrivalcambodia;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/ul[1]/li[3]")
	public static WebElement visaonarrivalsrilanka;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/ul[1]/li[4]")
	public static WebElement visonarrivalthailand;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/ul[1]/li[5]")
	public static WebElement visonariivalvietnam;
	

}
