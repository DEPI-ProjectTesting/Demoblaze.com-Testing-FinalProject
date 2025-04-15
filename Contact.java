package contactAndAbout;

import baseStart.TestBases;
import org.testng.annotations.Test;

public class Contact extends TestBases {
@Test
    public void checkContact() {
    homePage.contactClick();
    contactTest.enterEmail("alyfarag@example.com");
    contactTest.enterName("TestAly");
    contactTest.enterMessage("Successfull!");
    contactTest.sendMessage();
    }
}
