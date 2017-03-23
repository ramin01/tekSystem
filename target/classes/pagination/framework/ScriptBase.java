package pagination.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pagination.pom.TekApplication;

import java.util.concurrent.TimeUnit;

/**
 * Created by rashedulamin on 3/22/2017.
 */
public class ScriptBase {

    protected WebDriver driver;
    private TekApplication tekApp;

    @BeforeMethod
    public void beforeMethod() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.teksystems.com/it-jobs/results?page=4&keyword=Digital%20and%20creative%20jobs");
    }

    @AfterMethod
    public void afterMethod() throws Exception {
        driver.close();
        //driver.quit();
        driver = null;
        tekApp = null;
    }

    public TekApplication tekApp(){
        if (tekApp == null){
            tekApp = new TekApplication(driver);
        }
        return tekApp;
    }
}
