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

public class Pratik {
    /*
    1. “https://www.saucedemo.com” Adresine gidin
2. Username kutusuna “standard_user” yazdirin
3. Password kutusuna “secret_sauce” yazdirin
4. Login tusuna basin
5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
6. Add to Cart butonuna basin
7. Alisveris sepetine tiklayin
8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
9. Sayfayi kapatin
     */
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.saucedemo.com");

    }
    @AfterClass
    public static void teardown(){

        driver.close();
    }
    @Test
    public void test01(){
        //2. Username kutusuna “standard_user” yazdirin
       driver.findElement(By.id("user-name")).sendKeys("standard_user");

    }
    @Test
    public void  test02(){
        //3. Password kutusuna “secret_sauce” yazdirin
       driver.findElement(By.id("password")).sendKeys("secret_sauce");

    }
    @Test
    public void test03(){
        //4. Login tusuna basin
        driver.findElement(By.id("login-button")).click();

    }
    @Test
    public void test04(){
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
WebElement ilkUrun=driver.findElement(By.xpath("(//*[@class=\"inventory_item_name\"])[1]"));
ilkUrun.click();
    }
    @Test
    public void  test05(){
        //6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
    @Test
    public void test06(){
        //7. Alisveris sepetine tiklayin
driver.findElement(By.id("shopping_cart_container")).click();
    }
    @Test
    public void test07(){
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepetKontrol= driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]"));
Assert.assertTrue("sepete eklenmedi",sepetKontrol.isEnabled());

    }

}
