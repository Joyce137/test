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
		// ������ӳ��F���}������ʹ��System.setPropertyָ��firefox.exe��·��
		// System.setProperty("webdriver.firefox.bin",
		// "D:\\Mozilla Firefox\\firefox.exe");
		// WebDriver dirver_firefox = new FirefoxDriver();

		// ----IE-----
		// ������ӳ��F���}������ʹ��System.setPropertyָ��webdriver.ie.dirver��·��,���ԏ�http://docs.seleniumhq.org/download/���d
		System.setProperty("webdriver.ie.driver",
				"D:\\��װ��\\����Test\\IEDriverServer.exe");
		WebDriver dirver_ie = new InternetExplorerDriver();

		// ----Chrome-----
		// ������ӳ��F���}������ʹ��System.setPropertyָ��webdriver.chrome.dirver��·��,���ԏ�http://docs.seleniumhq.org/download/���d
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\��װ��\\����Test\\chromedriver.exe");
		// WebDriver dirver_chrome = new ChromeDriver();

		Navigation navigation = dirver_ie.navigate();
		String dev = "https://dev.zoom.us";
		String www = "https://www.zoom.us";
		navigation.to(dev);
		navigation.to(www);

		//���f3��
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		navigation.back();
		
		//���f3��
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
