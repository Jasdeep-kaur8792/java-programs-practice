package Pages;
import org.openqa.selenium.WebDriver;
public class PageFactory {
    WebDriver driver;
    private LogInPage logInPage;
    public PageFactory(WebDriver driver){
        this.driver = driver;
    }

    public LogInPage getLogInPage()

    {
        if (logInPage == null) {
            logInPage = new LogInPage(driver);
        }
        return logInPage;
    }
}