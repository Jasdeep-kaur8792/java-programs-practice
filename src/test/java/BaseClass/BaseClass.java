package BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.PageFactory;
import java.net.MalformedURLException;

public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;
    public static void setup() throws MalformedURLException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        pageFactory = new PageFactory(driver);
    }

    public void close() {
        driver.close();
    }
}