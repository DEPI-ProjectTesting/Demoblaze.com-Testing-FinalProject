package signUpTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import baseStart.TestBases;

public class SignUpVerify extends TestBases {

    @Test(priority = 1)
    public void verifySuccessfulRegister() {
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
    }
    @Test(priority = 2)
    public void verifyExistedUser() throws InterruptedException {
        signUp.clickSignupButton();
        signUp.enterUsername("Aly128");
        signUp.enterPassword("Password123!");
        signUp.confirmSignupButton();
        String alertText = alert.getAlertTextAndAccept();
        System.out.println("Alert Message: " + alertText);
        Assert.assertTrue(alertText.contains("This user already exist"), "Alert text mismatch!");
        try {
            signUp.closeButton();
        } catch (Exception e) {
            System.out.println("Modal already closed or closeButton failed.");
        }
    }
}



