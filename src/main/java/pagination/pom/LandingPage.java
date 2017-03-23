package pagination.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

/**
 * Created by rashedulamin on 3/23/2017.
 */
public class LandingPage extends Page{


    public WebElement nextPage;
    public WebElement previousPage;
    public WebElement firstPage;
    public WebElement finalPage;
    public WebElement moreOrLessThenFivepage;
    public WebElement zeropage;
    public WebElement finalPageNavigation;
    public WebElement firstPageNavigation;


    public List<WebElement> pageList = driver.findElements(By
            .xpath("(//ul[contains(@class, 'right pagination ng-isolate-scope')])[1]/li/a"));
            //.cssSelector("li[ng-repeat='page in pages']"));

    public LandingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*public WebElement getNextPage() {
        if (pageList.size()>= 0 ){
            pageList.get(3).click();
            Assert.assertEquals("2", pageList.get(3).getText());
        }
        return nextPage;
    }

    public WebElement getPreviousPage() {
        getFirstPage();
        Assert.assertEquals("1", pageList.get(2).getText());
        return previousPage;
    }

    public WebElement getFirstPage() {
        if (pageList.size()>= 0 ){
            pageList.get(0).click();
            Assert.assertEquals("1", pageList.get(2).getText());
            delayFor(5000);
        }
        return firstPage;
    }

    public WebElement getFinalPage() {
        if (pageList.size()>= 5 ){
            pageList.get(7).click();
            Assert.assertEquals("4", pageList.get(5).getText());
        }
        return finalPage;
    }

    public WebElement getMoreOrLessthenFivepage() {
        if (pageList.contains("5")){
            System.out.println("You Have More then 5 Pages");
        }else {
            System.out.println("Your Page Range is Between 1 to 4");
        }
        return moreOrLessthenFivepage;
    }

    public WebElement getZeropage() {
        if (pageList.size() < 0){
            System.out.println(" you have Zero pages");
        }
        return zeropage;
    }*/


    public WebElement getNextPage() {
        delayFor(5000);
        nextPage = driver.findElement(By.xpath("//ul[contains(@class, 'right pagination ng-isolate-scope')]/li[4]"));
        highlightElement(nextPage);
        return nextPage;
    }

    public void clickNextPage(){
        String actualText = getNextPage().getText();
        Assert.assertEquals("2", actualText);
    }

    public WebElement getPreviousPage() {
        previousPage = driver.findElement(By.xpath("//ul[contains(@class, 'right pagination ng-isolate-scope')]/li[3]"));
        highlightElement(previousPage);
        return previousPage;
    }

    public void clickPreviousPage(){
        String actualText = getPreviousPage().getText();
        Assert.assertEquals("1", actualText);
    }

    public WebElement finalPageNavigation() {
        finalPage = driver.findElement(By.xpath("//ul[contains(@class, 'right pagination ng-isolate-scope')]/li[7]"));
        finalPage.click();
        highlightElement(finalPage);
        return finalPageNavigation;
    }

    public WebElement validateFinalPage() {
        finalPage = driver.findElement(By.xpath("//ul[contains(@class, 'right pagination ng-isolate-scope')]/li[5]"));
        highlightElement(finalPage);
        return finalPage;
    }

    public void verifyFinalPage(){
        String actualText = validateFinalPage().getText();
        Assert.assertEquals("3", actualText);
    }

    public WebElement firstPageNavigation() {
        firstPage = driver.findElement(By.xpath("//ul[contains(@class, 'right pagination ng-isolate-scope')]/li[1]"));
        firstPage.click();
        highlightElement(finalPage);
        return firstPageNavigation;
    }

    public WebElement validateFirstPage() {
        firstPage = driver.findElement(By.xpath("//ul[contains(@class, 'right pagination ng-isolate-scope')]/li[3]"));
        highlightElement(firstPage);
        return firstPage;
    }

    public void verifyFirstPage(){
        String actualText = validateFirstPage().getText();
        Assert.assertEquals("3", actualText);
    }

    public WebElement getMoreOrLessThenFivepage() {
        if (pageList.contains("5")){
            System.out.println("You Have More then 5 Pages");
        }else {
            System.out.println("Your Page Range is Between 1 to 4");
        }
        return moreOrLessThenFivepage;
    }

    public WebElement getZeropage() {
        if (pageList.size() < 0){
            System.out.println(" you have Zero pages");
        }
        else {
            System.out.println(" you Have Pages");
        }
        return zeropage;
    }

}
