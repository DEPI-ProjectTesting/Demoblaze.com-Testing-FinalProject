package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    private  By phonesCat = By.xpath("//a[contains(text(),'Phones')]");
    private  By lapCat = By.xpath("//a[contains(text(),'Laptops')]");
    private  By monitorsCat = By.xpath("//a[contains(text(),'Monitors')]");

    private  By samSung = By.linkText("Samsung galaxy s6");
    private  By sonyLap = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    private  By appleMonitor = By.linkText("Apple monitor 24");

    private  By addToCartBtn = By.xpath("//a[contains(text(),'Add to cart')]");


    public void selectPhones() {
        driver.findElement(phonesCat).click();
    }
    public void selectLap() {
        driver.findElement(lapCat).click();
    }
    public void selectScreen() {
        driver.findElement(monitorsCat).click();
    }
    public void selectPrd1() {
        driver.findElement(samSung).click();
    }
    public void selectPrd2() {
        driver.findElement(sonyLap).click();
    }
    public void selectPrd3() {
        driver.findElement(appleMonitor).click();
    }

    public void clickAddToCart() {
        driver.findElement(addToCartBtn).click();
    }
}