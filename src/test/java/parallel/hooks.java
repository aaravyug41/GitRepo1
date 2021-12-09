package parallel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.base.driverclass;
import com.utils.configreader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {
	 
Properties prop;
WebDriver driver;
	
	@Before(order =0)
	public void bef() throws IOException {
		configreader cf = new configreader();
		driverclass df = new driverclass();
		prop= cf.readprop();
		driver = df.init(prop.getProperty("browser"));
		System.out.println("Initialization Done");
		
	}
	
	 
	
	@After
	public void aft(Scenario sc) throws InterruptedException, IOException {
		
		if(sc.isFailed()) {
			byte[] src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			//sc.attach(src, "img/png", sc.getName().replaceAll(" ", "_"));
			//sc.embed(src,"image/png");
			
		}
		
		String[] cmd = {"cmd.exe", "/C", "Start","report.bat"};
		Runtime.getRuntime().exec(cmd).waitFor();
 		
		System.out.println("Scenario finished");
		driver.quit();
		 
	}
}
