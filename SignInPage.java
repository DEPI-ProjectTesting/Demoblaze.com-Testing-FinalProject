package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SignInPage {
    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By userSignInput = By.id("loginusername");
    private final By passSignInput = By.id("loginpassword");
    private final By signInBtn = By.xpath("//*[@id=\"login2\"]");
    private final By signInConfirmBtn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    private final By closeLoginBtn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]");

    public void enterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userSignInput));
        driver.findElement(userSignInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passSignInput));
        driver.findElement(passSignInput).sendKeys(password);
    }

    public void clickSignInButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInBtn));
        driver.findElement(signInBtn).click();
    }

    public void confirmSignupButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInConfirmBtn));
        driver.findElement(signInConfirmBtn).click();
    }

    public void closeButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeLoginBtn));
        driver.findElement(closeLoginBtn).click();
    }
}


