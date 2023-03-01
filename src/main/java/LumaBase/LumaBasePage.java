package LumaBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LumaBasePage {
    public WebDriver driver;


    //Launching the suite in different browsers
    @BeforeSuite
    public void LaunchBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();

        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
    }

    @BeforeTest
    public void LaunchWebsite() throws InterruptedException {
        //driver.get("https://rb.gy/kincg9");
        //Applied pageload timeout to load the page astronomically
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }
//peformed Lamda Test
@BeforeClass
public void LamdaTest () throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    ChromeOptions chromeOptions = new ChromeOptions();
    desiredCapabilities.setCapability("browser", "chrome");
    desiredCapabilities.merge(chromeOptions);
    driver = new RemoteWebDriver(new URL("https://saijyothid12:JcdJOlVS1301sogLBokY5EFuzCJkUHQaj92hzPQOwGi1DyZoBh@hub.lambdatest.com/wd/hub"), chromeOptions);
    driver.get("https://rb.gy/kincg9");
}
    @AfterTest
    public void KillSession()
    {

        driver.quit();
    }
}