    package pages;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;
    import java.time.Duration;

    public class HomePage {
        WebDriver driver;

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        private final By welcome = By.xpath("//a[contains(text(),'Welcome')]");
        private final By logoutBtn = By.xpath("//a[contains(text(),'Log out')]");
        private final By signInButton = By.id("login2");
        private final By contact = By.xpath("//a[contains(text(),'Contact')]");
        private final By about = By.xpath("//a[contains(text(),'About us')]");
        private final By nextBtn = By.xpath("//a[contains(text(),'Next')]");
        private final By prevBtn = By.xpath("//a[contains(text(),'Previous')]");

        public String intro() {
            return driver.findElement(welcome).getText();
        }

        public By getSignInButton() {
            return signInButton;
        }

        public void logout() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(logoutBtn));
            driver.findElement(logoutBtn).click();
        }
        public void contactClick() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(contact));
            driver.findElement(contact).click();
        }
        public void AboutClick() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(about));
            driver.findElement(about).click();
        }
        public void nextClick() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(nextBtn));
            driver.findElement(nextBtn).click();
        }
        public void prevClick() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(prevBtn));
            driver.findElement(prevBtn).click();
        }
    }