package pagination.test;

import org.testng.annotations.Test;
import pagination.framework.ScriptBase;

/**
 * Created by rashedulamin on 3/22/2017.
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
    public void paginationtest1()throws InterruptedException{
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
