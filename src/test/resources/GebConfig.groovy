/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

waiting {
	timeout = 2
}

environments {
	
	// run via “./gradlew chromeTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}
	
	// run via “./gradlew firefoxTest”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		driver = { new FirefoxDriver() }
	}

    phantomJs {
        driver = { new PhantomJSDriver() }
    }

}


// To run the tests with all browsers just run “./gradlew test”

//baseUrl = "http://gebish.org"
baseUrl = "https://www.google.co.jp"
reportsDir = "build/reports/test/capture"

// Atention: When you use ,Please set binary ChromeDriver to this path
System.setProperty("webdriver.chrome.driver","./src/test/resources/driver/chromedriver")
System.setProperty("webdriver.phantomJs.driver","./src/test/resources/driver/phantomjs")

driver={
	def driver = new ChromeDriver()
	driver
}