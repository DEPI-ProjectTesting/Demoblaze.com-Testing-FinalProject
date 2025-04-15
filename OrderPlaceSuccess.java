package e2e;

import baseStart.TestBases;
import org.testng.annotations.Test;

public class OrderPlaceSuccess extends TestBases {
    @Test(priority = 1)
    public void placeOrder() throws InterruptedException {
        products.selectLap();
        System.out.println("Clicking lap");
        Thread.sleep(500);
        products.selectPrd2();
        System.out.println("Clicking sony");
        Thread.sleep(1000);
        products.clickAddToCart();
        System.out.println("Clicking atc");
        alert.getAlertTextAndAccept();
        System.out.println("accept alert");
        cartPage.goToCart();
        Thread.sleep(500);
        System.out.println("click cart");
        cartPage.clickPlaceOrder();
        System.out.println("click placeOrder");

        orderPage.enterName("Test User");
        orderPage.enterCountry("Egypt");
        orderPage.enterCity("Cairo");
        orderPage.enterCard("1234567812345678");
        orderPage.enterMonth("04");
        orderPage.enterYear("2025");
        orderPage.confirmPurchase();
        orderPage.handlePurchaseConfirmation();
    }
}
