package driverUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseClass.baseclass;

public class utils{
	
	private baseclass bc;
	
	public void screenshot() throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) bc.driver;
		File fis= (ts.getScreenshotAs(OutputType.FILE));
		File des= new File("./target/image.png");
		FileUtils.copyFile(fis, des);
		
	}
	
	public void select(WebElement ele) {
		Select s= new Select(ele);
		s.selectByValue("5");
	}
	
	public void scrolldown() throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) bc.driver;
		js.executeScript("window.scrollBy(0,-1500)");
		Thread.sleep(3000);
	}
	public void scrollup() throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) bc.driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
	}
	
	public void scroll(WebElement ele) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) bc.driver;
		int x=ele.getLocation().getX();
		int y= ele.getLocation().getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
//		Thread.sleep(3000);
	}
	
}
