package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDPCheckPoint {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.idp.com/india/user-signup/");
		
	}

}
