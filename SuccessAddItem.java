package e2e;
import baseStart.TestBases;
import org.testng.annotations.Test;

public class SuccessAddItem extends TestBases{
   @Test(priority = 1)
   public void addItemSuccess() throws InterruptedException {
        products.selectPhones();
        System.out.println("Clicking phones");
        Thread.sleep(1000);
        products.selectPrd1();
        System.out.println("Clicking samsung");
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
   }
}
