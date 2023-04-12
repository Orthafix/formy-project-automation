import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromedriver.exe", "/Users/kuw053/OneDrive - AFRY/Test/Drivers");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("Fabriksgatan 36c, 1301");
        Thread.sleep(1000);
        WebElement googleWarningButton = driver.findElement(By.className("dismissButton"));
        Thread.sleep(3000);
        googleWarningButton.click();
        autocomplete.clear();
        autocomplete.sendKeys("Fabriksgatan 36c, 1301");
        WebElement autocompleteResult = driver.findElement(By.className("pac-container hdpi"));
        Thread.sleep(3000);
        autocompleteResult.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
