import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromedriver.exe", "/Users/kuw053/OneDrive - AFRY/Test/Drivers");

        WebDriver driver = new ChromeDriver();

        radioBtnsTests(driver);

        chkBoxTests(driver);
    }

    private static void chkBoxTests(WebDriver driver) throws InterruptedException {
        //Automating checkboxes - examples
        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement chkBox1 = driver.findElement(By.id("checkbox-1"));
        chkBox1.click();
        Thread.sleep(1000);
        WebElement chkBox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        chkBox2.click();
        Thread.sleep(1000);
        WebElement chkBox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        chkBox3.click();
        Thread.sleep(2000);
        driver.quit();
    }

    private static void radioBtnsTests(WebDriver driver) {
        // Automating radio buttons - examples
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radioBtn1 = driver.findElement(By.id("radio-button-1"));
        radioBtn1.click();
        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioBtn2.click();
        WebElement radioBtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioBtn3.click();
        driver.quit();
    }
}
