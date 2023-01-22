import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest2 {

	@Test
	public void homePageCheck() throws MalformedURLException {
		DesiredCapabilities capb = new DesiredCapabilities();

		// decides which browser to run test
//		capb.setBrowserName("firefox");

		// decides which platform to run test
//		capb.setPlatform(Platform.WIN10);

		// using this we can set browser behavior like ssl certification, set proxy, browser name etc
//		capb.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		capb.setCapability(CapabilityType.BROWSER_NAME, "firefox");

		WebDriver d1 = new RemoteWebDriver(new URL("http://192.168.236.67:4444"), capb);
		d1.get("https://rahulshettyacademy.com/");
		System.out.println(d1.getTitle());

	}

}
