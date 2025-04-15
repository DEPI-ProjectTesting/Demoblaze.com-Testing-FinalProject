package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By usernameInput = By.xpath("//*[@id=\"sign-username\"]");
    private final By passwordInput = By.xpath("//*[@id=\"sign-password\"]");
    private final By signupConfirmBtn = By.xpath("//a[contains(text(),'Sign up')]");
    private final By singUpBtn = By.xpath("//button[contains(text(),'Sign up')]");
    private final By closeBtn = By.xpath("//*[@id=\"signInModal\"]/div/div/div[1]/button/span");


    public void enterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInput));
        driver.findElement(usernameInput).sendKeys(username);
    }
    public void enterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickSignupButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(signupConfirmBtn));
        driver.findElement(signupConfirmBtn).click();
    }
    public void confirmSignupButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(singUpBtn));
        driver.findElement(singUpBtn).click();
    }
    public void closeButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeBtn));
        driver.findElement(closeBtn).click();
    }
}

