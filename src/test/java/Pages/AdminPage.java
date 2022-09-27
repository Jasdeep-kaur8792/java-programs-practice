package Pages;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class AdminPage {

    WebDriver driver;
    WebDriverWait wait;
    By clickOnAdminLeftNavi=By.partialLinkText("Admin");
    By clickOnAddButton=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    By userRoleSelect=By.xpath("(//div[@class = 'oxd-select-text--after'])[1]");
    By selectAdmin=By.xpath("//*[contains(text(),'Admin')]");
    By selectStatus=By.xpath("(//div[@class = 'oxd-select-text--after'])[2]");
    By enableStatus=By.xpath("//*[contains(text(),'Enabled')]");
    By pass=By.xpath("(//input[@type='password'])[1]");
    By empName=By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input");
    By userNameSelect=By.xpath("(//div//input[@class='oxd-input oxd-input--active'])[2]");
    By confirmPass=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By submit= By.xpath("(//button[@type='submit'])");

    public AdminPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void admin() throws InterruptedException
    {
        driver.findElement(clickOnAdminLeftNavi).click();
        driver.findElement(clickOnAddButton).click();

    }

   public void select() throws InterruptedException, IOException
   {
       String path = System.getProperty("user.dir")+"//src//test//java//TestData//Book1.xls";
       FileInputStream prop1 = null;
       try
       {
           prop1 = new FileInputStream(path);
       }
       catch(FileNotFoundException e)
       {e.printStackTrace();
       }

       HSSFWorkbook wb = new HSSFWorkbook(prop1);
       HSSFSheet sheet = wb.getSheet("Sheet1");
       String userRole = sheet.getRow(1).getCell(0).getStringCellValue();
       String status = sheet.getRow(1).getCell(1).getStringCellValue();
       String password = sheet.getRow(1).getCell(2).getStringCellValue();
       String employee = sheet.getRow(1).getCell(3).getStringCellValue();
       String userName = sheet.getRow(1).getCell(4).getStringCellValue();
       String confirmPassword = sheet.getRow(1).getCell(5).getStringCellValue();
       driver.findElement(userRoleSelect).click();
       Thread.sleep(4000);
       driver.findElement(selectAdmin).click();
       driver.findElement(selectStatus).click();
       driver.findElement(enableStatus).click();
       driver.findElement(pass).clear();
       driver.findElement(pass).sendKeys(password);
       driver.findElement(empName).clear();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
       driver.findElement(empName).sendKeys(employee);
       driver.findElement(userNameSelect).clear();
       driver.findElement(userNameSelect).sendKeys(userName);
       driver.findElement(confirmPass).clear();
       driver.findElement(confirmPass).sendKeys(confirmPassword);
       driver.findElement(submit).click();
    }
}

