package Test1;

import com.thoughtworks.selenium.*;

public class Class1 {

	public static void main(String[] args) {
		//����selenium�yԇ����
		String serverHost = "localhost";
		int serverPort = 4444;
		String firefox_browserStartCommand = "*firefox D:\\Mozilla Firefox\\firefox.exe";
	    String ie_browserStartCommand = "*iexplore";
	    String chrome_browserStartCommand = "*googlechrome C:\\Users\\Clery\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe";
	    String s ="*googlechrome D:\\�ѹ���������\\GoogleChrome_23.0.1271.97_PortableSoft\\GoogleChromePortable\\App\\Google Chrome\\chrome.exe --ignore-certificate-errors --allow-running-insecure-content";
	    String sogou_browserStartCommand = "*iexploreproxy D:\\SogouExplorer\\SogouExplorer.exe";
		String browserURL = "http://www.baidu.com";
		DefaultSelenium selenium = new DefaultSelenium(serverHost, serverPort, firefox_browserStartCommand, browserURL);
		
		//���_�����Ğg�[���Ϳ��ƽ���
		selenium.start();
		
		String dev = "https://dev.zoom.us";
		String www = "https://www.zoom.us";
		selenium.open(dev);
		/*
		selenium.open(www);
		
		//�ȴ�3��
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selenium.goBack();
		*/
		
		selenium.refresh();
		selenium.windowFocus();
		selenium.windowMaximize();
		//selenium.close();
		
	}

}
