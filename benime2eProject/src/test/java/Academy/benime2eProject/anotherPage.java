package Academy.benime2eProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.base;

public class anotherPage extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
	@Test

public void openFace() throws IOException {

		driver = initializeDriver();
		log.info("Driver initialized for GOOGLE");
		
		driver.get("https://www.google.com");
		
	  log.info("GOOGLE Website Opened");
		
/*
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
		int frameNumber = findFrameElement(driver, By.className("recaptcha-checkbox-checkmark"));
		driver.switchTo().frame(frameNumber);
		driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
		
		driver.switchTo().defaultContent();

		frameNumber = findFrameElement(driver, By.xpath("//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(frameNumber);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
	}
	public int findFrameElement(WebDriver driver, By by) {		
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		for (int x = 0; x < frameCount; x++) {
			driver.switchTo().frame(x);

			if (driver.findElements(by).size() == 1) {
				driver.findElement(by).click();
				break;
			} else {
				System.out.println("Continue Looping");
			}
		}
		return 0;
	}
	
	*/
		
// ####### Two different ways of switch frame #########
	/*
	  int countx = driver.findElements(By.tagName("iframe")).size(); int county =
	  countx; for (int x = 0; x < countx; x++) { driver.switchTo().frame(x);
	  
	  if (driver.findElements(By.className("recaptcha-checkbox-checkmark")).size()== 1) {
	  driver.findElement(By.className("recaptcha-checkbox-checkmark")).click(); }
	  break; }
	  
	  driver.switchTo().defaultContent();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  for (int y = 0; y < county; y++) { driver.switchTo().frame(y); 
	  if(driver.findElements(By.xpath("//*[@id='recaptcha-verify-button']")).size()== 1) {
	  driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
	  break; } 
	  } 
	  }
	 */
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterTest
	public void closePage() {

		 driver.close();
		 driver=null;
	}

}
