package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class About {
    WebDriver driver;
    public About(WebDriver driver){
        this.driver= driver;
    }
    private By closeSymbol = By.xpath("///*[@id=\"videoModal\"]/div/div/div[1]/button/span");
    private By closeBtn = By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button");

    public void symBtn() {
        driver.findElement(closeSymbol).click();
    }
    public void btnCloseAbout() {
        driver.findElement(closeBtn).click();

    }
}
