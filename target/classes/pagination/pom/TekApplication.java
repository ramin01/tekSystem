package pagination.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by rashedulamin on 3/22/2017.
 */
public class TekApplication extends Page {

    protected LandingPage landingPage;

    public TekApplication(WebDriver driver) {
        super(driver);
    }

    public LandingPage landingPage(){
        if(landingPage == null){
            landingPage = new LandingPage(driver);
            PageFactory.initElements(driver, landingPage);
        }
        return landingPage;
    }
}
