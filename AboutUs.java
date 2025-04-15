package contactAndAbout;

import baseStart.TestBases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AboutUs extends TestBases {

    @Test
    public void checkAboutCloseBtn() throws InterruptedException {
        homePage.AboutClick();
        Thread.sleep(200);
        about1.btnCloseAbout();
    }
}
