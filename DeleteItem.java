package cartFunction;

import baseStart.TestBases;
import org.testng.annotations.Test;

public class DeleteItem extends TestBases {

    @Test
    public void verifyCartDeleteItem() throws InterruptedException {
        products.selectPhones();
        Thread.sleep(1000);

        products.selectPrd1();
        Thread.sleep(1000);

        products.clickAddToCart();
        alert.getAlertTextAndAccept();

        driver.navigate().back();
        Thread.sleep(1000);

        cartPage.goToCart();
        Thread.sleep(1000);
         cartPage.deleteBtn();

    }
}