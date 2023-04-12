import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromedriver.exe", "/Users/kuw053/OneDrive - AFRY/Test/Drivers");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("09/19/1981");
        dateField.sendKeys(Keys.RETURN);
        Thread.sleep(1500);
        dateField.clear();
        driver.navigate().refresh();

        // clicking on a specific date (today)
        WebElement dateToday = driver.findElement(By.id("datepicker"));
        dateToday.click();
        dateToday.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[3]")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}