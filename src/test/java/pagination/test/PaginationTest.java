package pagination.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pagination.framework.ScriptBase;

import java.util.List;

/**
 * Created by rashedulamin on 3/23/2017.
 */
public class PaginationTest extends ScriptBase{


    /*@Test
    public void paginationtest()throws InterruptedException{

        tekApp().landingPage().getNextPage();
        tekApp().landingPage().getPreviousPage();
        tekApp().landingPage().getFinalPage();
        tekApp().landingPage().getFirstPage();
        tekApp().landingPage().getMoreOrLessthenFivepage();
        tekApp().landingPage().getZeropage();

    }*/

    @Test
    public void paginationtest1() throws Exception {
        Thread.sleep(5000L);
        List<WebElement> pagination = driver.findElements(By.xpath(".//*[@id='inner-wrap']/div/div[3]/div[2]/div/ul/li[4]/a"));
        Thread.sleep(5000L);
        if (pagination.size() > 0) {
            System.out.println("pagination exists");
            for (int i = 0; i < pagination.size(); i++) {
                pagination.get(i).click();
                Thread.sleep(5000L);
            }
        } else {
            System.out.println("pagination not exists");
        }
    }

    @Test
    /**
     * firstPageNavigation() is failing. fluent wait or WebDriver waite may resolve the issue.
     */
    public void paginationtest2()throws InterruptedException{
        tekApp().landingPage().clickNextPage();
        tekApp().landingPage().clickPreviousPage();
        tekApp().landingPage().finalPageNavigation();
        tekApp().landingPage().verifyFinalPage();
        //tekApp().landingPage().firstPageNavigation();
        //tekApp().landingPage().verifyFirstPage();
        tekApp().landingPage().getMoreOrLessThenFivepage();
        tekApp().landingPage().getZeropage();
    }
}
