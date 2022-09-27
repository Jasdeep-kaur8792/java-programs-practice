package Pages;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class LogInPage{
    WebDriver driver;
    By username= By.xpath("//input[@placeholder='Username']");
    By passwordInput= By.xpath("//input[@placeholder='Password']");
    By clickOnSubmit= By.xpath("//button[@type='submit']");
    public LogInPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void logInUserName(String userName,String password) {
        driver.findElement(username).sendKeys(userName);
        driver.findElement(passwordInput).sendKeys(password);
    }
    public void logInSubmitButton()
    {
        driver.findElement(clickOnSubmit).click();

    }
}