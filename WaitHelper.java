package waits_alerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {
    private WebDriver driver;
    private WebDriverWait wait;

    public WaitHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            System.out.println("Interrupted during sleep: " + e.getMessage());
        }
    }

    public void waitForVisibility(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementToBeVisible(By locator) {
        waitForVisibility(locator);
    }

    public void waitForElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitForPresence(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void waitForUrlContains(String partialUrl) {
        wait.until(ExpectedConditions.urlContains(partialUrl));
    }

    public void waitForUrlToContain(String partialUrl) {
        wait.until(driver -> driver.getCurrentUrl().contains(partialUrl));
    }
}