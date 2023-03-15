package day03_Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Pratik {
    /*
    1. Tarayıcıyı başlatın
2. 'http://automationexercise.com' URL'sine gidin
3. Ana sayfanın başarıyla göründüğünü doğrulayın
4. 'Test Durumları' düğmesine tıklayın
5. Kullanıcının test senaryoları sayfasına başarıyla yönlendirildiğini doğrulayı
     */

    public static void main(String[] args) {
// Gerekli kütüphaneleri içeri aktarın


// Tarayıcıyı başlatın
        WebDriver driver = new ChromeDriver();

// 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");

// Ana sayfanın başarıyla göründüğünü doğrulayın
        String expectedTitle = "Automation Practice - Ultimate QA";
     //   WebDriverWait wait = new WebDriverWait(driver, 8);
    //    wait.until(ExpectedConditions.titleIs(expectedTitle));

// 'Test Durumları' düğmesine tıklayın
        WebElement testStatusButton = driver.findElement(By.linkText("Test Status"));
        testStatusButton.click();

// Kullanıcının test senaryoları sayfasına başarıyla yönlendirildiğini doğrulayın
        String expectedUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
    //    wait.until(ExpectedConditions.urlToBe(expectedUrl));

    }
}
