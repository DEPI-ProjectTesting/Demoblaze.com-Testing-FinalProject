package e2e;

import baseStart.TestBases;
import org.testng.annotations.Test;

public class InOutSuccess extends TestBases {

    @Test(priority = 1)
    public void completeUserJourney() throws InterruptedException {
        String username = "test" + System.currentTimeMillis();
        String password = "Test@2025";

        System.out.println("Step 1: Clicking Sign Up button");
        signUp.clickSignupButton();
        System.out.println("Entering Username: " + username);
        signUp.enterUsername(username);
        System.out.println("Entering Password: " + password);
        signUp.enterPassword(password);
        System.out.println("Clicking Confirm SignUp Button");
        signUp.confirmSignupButton();
        alert.getAlertTextAndAccept();

        signIn.clickSignInButton();
        System.out.println("Entering SignIn Username: " + username);
        signIn.enterUsername(username);
        System.out.println("Entering SignIn Password: " + password);
        signIn.enterPassword(password);
        System.out.println("Clicking Confirm SignIn Button");
        signIn.confirmSignupButton();

        homePage.logout();
    }
}