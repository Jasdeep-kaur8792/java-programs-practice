package BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.PageFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;
    public static void setup() throws IOException, InterruptedException {
        FileReader reader = new FileReader("C:\\Users\\JasdeepKaur\\OrangeHRM\\src\\test\\java\\TestData\\config.properties");
        Properties data = new Properties();
        data.load(reader);
        WebDriver driver = null;
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