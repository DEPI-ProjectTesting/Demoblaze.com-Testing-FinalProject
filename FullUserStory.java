package end2end;

import baseStart.TestBases;
import org.testng.annotations.Test;

public class FullUserStory extends TestBases {
    @Test
    public void happyScenario() throws InterruptedException{
        String username = "test" + System.currentTimeMillis();
        String password = "Test@2025";

        signUp.clickSignupButton();
        signUp.enterUsername(username);
        signUp.enterPassword(password);
        signUp.confirmSignupButton();
        alert.getAlertTextAndAccept();

        signIn.clickSignInButton();
        signIn.enterUsername(username);
        signIn.enterPassword(password);
        signIn.confirmSignupButton();
        Thread.sleep(1000);

        products.selectPhones();
        Thread.sleep(1000);
        products.selectPrd1();
        Thread.sleep(1000);
        products.clickAddToCart();
        alert.getAlertTextAndAccept();
        cartPage.goToCart();
        Thread.sleep(1000);
        cartPage.clickPlaceOrder();
        Thread.sleep(1000);

        orderPage.enterName("Aly");
        orderPage.enterCountry("Egypt");
        orderPage.enterCity("Cairo");
        orderPage.enterCard("123456");
        orderPage.enterMonth("04");
        orderPage.enterYear("2028");
        orderPage.confirmPurchase();
        orderPage.handlePurchaseConfirmation();

    }
}
