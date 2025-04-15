package cartFunction;

import baseStart.TestBases;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddToCart extends TestBases {

    @Test
    public void verifyCartTotalMatchesSumOfItems() throws InterruptedException {
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

        List<Integer> prices = cartPage.getProductPrices();
        System.out.println("Product prices: " + prices);
        Thread.sleep(1000);

        int calculatedTotal = prices.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of item prices: " + calculatedTotal);

        int displayedTotal = cartPage.getTotalPrice();
        Assert.assertEquals(displayedTotal, calculatedTotal,
                " Total displayed does not match the sum of individual product prices.");
        System.out.println("Total matches sum of items. Test passed.");

    }
}