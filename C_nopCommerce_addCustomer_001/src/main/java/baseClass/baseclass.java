package baseClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	
	public static WebDriver driver;

	
	public void chrome() {
		driver = new ChromeDriver();}
	
	public void firefox() {
		driver = new FirefoxDriver();}
	
	
	public String key(String value) throws IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/file.properties");
		Properties p= new Properties();
		p.load(fis);
		return p.getProperty(value);
	}
}
