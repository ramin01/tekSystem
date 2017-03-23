package pagination.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by rashedulamin on 3/23/2017.
 */
public class praClass {

    protected WebDriver driver;

    @BeforeMethod
    public void beforeMethod() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.teksystems.com/it-jobs/results?page=4&keyword=Digital%20and%20creative%20jobs");
    }



}
