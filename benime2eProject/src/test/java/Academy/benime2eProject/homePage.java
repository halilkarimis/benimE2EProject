package Academy.benime2eProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.base;

public class homePage extends base {
				public static Logger log = LogManager.getLogger(base.class.getName());
		
		@Test
		public void basePageNavigation() throws IOException {
			driver = initializeDriver();
			
			log.info("First log : Driver is initialized");
			
			driver.get("http://www.qaclickacademy.com");
			driver.findElement(By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in']")).click();
			//driver.findElement(By.linkText("Login")).click();
			log.info("First log : QAclickacademy website Opened Successfully");
		
		
	}
		@AfterTest
		public void closePage() {			
			driver.close();	
			 driver=null;
		}

}
