package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev_01
{/* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname
    fill the lastname
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Antartica
    choose your command  -> Browser Commands
    click submit button
 */
    /* ...Alıştırma3...
    url'ye gidin: https://www.techlistic.com/p/selenium-practice-form.html
   // ilk adı doldurun
//    soyadını doldur
 //   cinsiyeti kontrol et
///    deneyimi kontrol et
//    tarihi doldur
//    mesleğinizi seçin -> Otomasyon Test Cihazı
 //   aracınızı seçin -> Selenium Webdriver
 //   kıtanızı seçin -> Antarktika
 //   komutunuzu seçin -> Tarayıcı Komutları
//    gönder düğmesine tıklayın
 */
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

    }

    @AfterClass
    public static void teardown() {

        driver.close();
    }
    @Test
            public void test01 ()  {


        // ilk adı doldurun
driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("ayse nuriye");
        System.out.println("kullanıcı adı ayse yazıldı");
            }
    @Test
    public void test02 () {
        //    soyadını doldur
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("alçık");
        System.out.println("soyadı yazıldı");
    }
    @Test

    public void test03 () {
        driver.findElement(By.id("sex-1")).click();
    }
    @Test

    public void test04 () {
        driver.findElement(By.id("exp-0")).click();
    }
    @Test
    public void test05(){

        driver.findElement(By.id("datepicker")).sendKeys("17.02.2023");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");

    }@Test

    public void test06() throws InterruptedException {
    Thread.sleep(3000);
    driver.findElement(By.id("profession-1")).click();
    Thread.sleep(3000);
driver.findElement(By.id("tool-0")).click();
    }
    @Test

    public void test07() {
        driver.findElement(By.xpath("//*[@id=\"continents\"]/option[7]")).click();
    }
    @Test

    public void test08(){
        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");
    }

    @Test
    public void test09() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("submit")).click();

    }
}
/*
System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //    go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();
        driver.navigate().refresh();
        //    fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ali");
        //    fill the lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Yilmaz");
        //    check the gender
        driver.findElement(By.xpath("//input[@name='sex']")).click();
        //    check the experience
        driver.findElement(By.xpath("//input[@value='5']")).click();
        //    fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("18-02-2023");
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");
        Thread.sleep(3000);
        //    choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        //    choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        //    choose your continent -> Antartica
        driver.findElement(By.xpath("//option[text()='Antartica']")).click();
        //    choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        jse.executeScript("window.scrollBy(0,350)");
        //    click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).submit();
 */
