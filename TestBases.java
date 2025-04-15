package baseStart;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;
import waits_alerts.JSAlertsPages;
import waits_alerts.WaitHelper;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class TestBases {
     public WebDriver driver;
     public RegisterPage signUp;
     public HomePage homePage;
     public JSAlertsPages alert;
     public SignInPage signIn;
    public ProductsPage products;
    public CartPage cartPage;
    public OrderPage orderPage;
    public Contact contactTest;
    public About about1;

    //public WebDriverWait wait;
    //public WaitHelper waitHelper;
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        signUp = new RegisterPage(driver);
        homePage = new HomePage(driver);
        signIn = new SignInPage(driver);
        about1 = new About(driver);
        contactTest = new Contact(driver);
        alert = new JSAlertsPages(driver);
        products = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        orderPage = new OrderPage(driver);
       //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // waitHelper = new WaitHelper(driver);
        driver.manage().window().maximize();
        System.out.println("Browser started successfully.");
        start();
    }
    @BeforeMethod
    public void start() {
        driver.get("https://www.demoblaze.com/");
    }
   @AfterClass
    public void closeBrowser() {
            driver.quit();
        }
    }