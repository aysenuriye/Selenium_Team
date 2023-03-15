package day03_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Pratik3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

// ChromeDriver'ı yükleyin ve Zero Bank sayfasına gidin
        driver.get("http://zero.webappsecurity.com");

        // Signin butonuna tıklayarak login sayfasına gidin

        WebElement usernameInput  =driver.findElement(By.id("user_login"));
        usernameInput.sendKeys("username");
        WebElement pasapordInput= driver.findElement(By.xpath("//*[@id=\"user_password\"]"));
        pasapordInput.sendKeys("laaaan");

        







    }
}
