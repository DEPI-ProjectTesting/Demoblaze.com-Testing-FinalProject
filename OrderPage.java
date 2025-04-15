package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {
        driver.findElement(By.id("name")).sendKeys(name);
    }

    public void enterCountry(String country) {
        driver.findElement(By.id("country")).sendKeys(country);
    }

    public void enterCity(String city) {
        driver.findElement(By.id("city")).sendKeys(city);
    }

    public void enterCard(String card) {
        driver.findElement(By.id("card")).sendKeys(card);
    }

    public void enterMonth(String month) {
        driver.findElement(By.id("month")).sendKeys(month);
    }

    public void enterYear(String year) {
        driver.findElement(By.id("year")).sendKeys(year);
    }

    public void confirmPurchase() {
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();
    }

    public void handlePurchaseConfirmation() {
        driver.findElement(By.xpath("//button[text()='OK']")).click();
    }
}