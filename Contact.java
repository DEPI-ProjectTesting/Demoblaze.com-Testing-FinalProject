package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Contact {
    WebDriver driver;

    public Contact(WebDriver driver){
        this.driver= driver;
    }
    private final By emailInput = By.id("recipient-email");
    private final By nameInput = By.id("recipient-name");
    private final By messageInput = By.id("message-text");
    private final By messageClick = By.xpath("//button[contains(text(),'Send message')]");
    private final By closeClick = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]");


    public void enterEmail(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        driver.findElement(emailInput).sendKeys(username);
    }
    public void enterName(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameInput));
        driver.findElement(nameInput).sendKeys(username);
    }
    public void enterMessage(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(messageInput));
        driver.findElement(messageInput).sendKeys(username);
    }
    public void sendMessage() {
        driver.findElement(messageClick).click();
    }
    public void closeMessage() {
        driver.findElement(closeClick).click();
    }

}
