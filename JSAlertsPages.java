    package waits_alerts;

    import org.openqa.selenium.Alert;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import java.time.Duration;

    public class JSAlertsPages {
        WebDriver driver;
        public JSAlertsPages(WebDriver driver) {
            this.driver=driver;
    }
        public String getAlertTextAndAccept() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            alert.accept();
            return alertText;
            }
        }


