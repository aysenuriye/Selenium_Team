package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Pratik2 {

   /*
           /*
            1) Bir class oluşturun: YoutubeAssertions
            2) https://www.youtube.com adresine gidin
            3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
                ○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
                ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
                ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
                ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

     */


    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.youtube.com");

    }
    @Test
    public void test02(){

        // ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin

        WebElement logo = driver.findElement(By.id("logo-icon"));

        Assert.assertTrue(logo.isDisplayed());



    }



    @AfterClass
    public static void tearDown(){
        driver.close();
    }

    @Test
    public void test01(){
        // ○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        String actualTitle=driver.getTitle();
        String expectedTitle ="YouTube";

        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Test
    public void test03(){
        // ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement searcButton = driver.findElement(By.id("search"));
        Assert.assertTrue(searcButton.isEnabled());
    }

    @Test
    public void test04(){
        // ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        String baslik =driver.getTitle();
        String expectedBaslik = "youtube";

        Assert.assertNotEquals(baslik,expectedBaslik);
    }

}
