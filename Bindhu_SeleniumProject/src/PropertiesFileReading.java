import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;


public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Documents\\Bindhu_SeleniumProject\\configuration.properties");
		Properties p=new Properties();
		p.load(fi);
		
		String appurl=p.getProperty("url");
		String browser=p.getProperty("browsername");
		System.out.println(appurl);
		System.out.println(browser);
	
		fi.close();
		
        ChromeOptions ch=new ChromeOptions();
        ch.setCapability("Platform", Platform.WIN10);
        
	}

}
