package signIn;

import org.testng.Assert;
import org.testng.annotations.Test;
import baseStart.TestBases;

public class VerifySignIn extends TestBases {
    @Test(priority = 1)
    public void verifySuccessfulLogin() throws InterruptedException {
        signIn.clickSignInButton();
        signIn.enterUsername("Aly128");
        signIn.enterPassword("Password123!");
        signIn.confirmSignupButton();
        Thread.sleep(2000);

        String expectedWelcome = "Welcome Aly128";
        String actualWelcome = homePage.intro();
        Assert.assertTrue(actualWelcome.contains(expectedWelcome),
                "Login success message not displayed.");
    }

    @Test(priority = 2)
    public void verifyInvalidLogin() throws InterruptedException {
        signIn.clickSignInButton();
        signIn.enterUsername("WrongUser");
        signIn.enterPassword("WrongPass");
        signIn.confirmSignupButton();
        Thread.sleep(2000);

        String alertMessage = alert.getAlertTextAndAccept();
        System.out.println("Alert says: " + alertMessage);
        Assert.assertTrue(alertMessage.contains("User does not exist."),
                "Alert does not contain expected failure message.");
        signIn.closeButton();
    }
}

