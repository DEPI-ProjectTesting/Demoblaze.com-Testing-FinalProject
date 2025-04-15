package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCart() {
        driver.findElement(By.id("cartur")).click();
    }
    public void deleteBtn() {
        driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
    }
    public void clickPlaceOrder() {
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
    }

    public List<Integer> getProductPrices() {
        List<WebElement> priceElements = driver.findElements(By.xpath("//tr/td[3]"));
        List<Integer> prices = new ArrayList<>();
        for (WebElement price : priceElements) {
            prices.add(Integer.parseInt(price.getText()));
        }
        return prices;
    }
    public int getTotalPrice() {
        WebElement totalEl = driver.findElement(By.id("totalp"));
        return Integer.parseInt(totalEl.getText());
    }
}