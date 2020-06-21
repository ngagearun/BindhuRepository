import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Test_Abstraction {

	public static void main(String[] args) {
	
		
		Abstraction_AbstractClass abs=new ICICIBank();
		abs.checkbalance();
		abs.enterpinnum();
		
		
		
		
		
		ChromeDriver ch=new ChromeDriver();
		
		
		FirefoxDriver dr=new FirefoxDriver();
		
		
		InternetExplorerDriver in=new InternetExplorerDriver();

	}

}
