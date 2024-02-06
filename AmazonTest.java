import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.testng.Assert;
public class AmazonTest {
    @Test
    public void amazon(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        String expectedUrl = "https://www.amazon.in/";

        String currrentUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currrentUrl, "URL's doesn't Match");

        driver.close();
    }
}
