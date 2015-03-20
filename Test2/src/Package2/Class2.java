package Package2;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.chrome.*;

public class Class2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

		// ----Firefox-----
		// 如果啟動出現問題，可以使用System.setProperty指出firefox.exe的路徑
		// System.setProperty("webdriver.firefox.bin",
		// "D:\\Mozilla Firefox\\firefox.exe");
		// WebDriver dirver_firefox = new FirefoxDriver();

		// ----IE-----
		// 如果啟動出現問題，可以使用System.setProperty指出webdriver.ie.dirver的路徑,可以從http://docs.seleniumhq.org/download/下載
		System.setProperty("webdriver.ie.driver",
				"D:\\安装包\\测试Test\\IEDriverServer.exe");
		WebDriver dirver_ie = new InternetExplorerDriver();

		// ----Chrome-----
		// 如果啟動出現問題，可以使用System.setProperty指出webdriver.chrome.dirver的路徑,可以從http://docs.seleniumhq.org/download/下載
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\安装包\\测试Test\\chromedriver.exe");
		// WebDriver dirver_chrome = new ChromeDriver();

		Navigation navigation = dirver_ie.navigate();
		String dev = "https://dev.zoom.us";
		String www = "https://www.zoom.us";
		navigation.to(dev);
		navigation.to(www);

		//空閒3秒
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		navigation.back();
		
		//空閒3秒
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		navigation.forward();
		navigation.refresh();
	}

}
