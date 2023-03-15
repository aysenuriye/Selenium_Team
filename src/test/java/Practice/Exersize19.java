package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Exersize19 {
    /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Click on 'Products' button
4. Verify that Brands are visible on left side bar
5. Click on any brand name
6. Verify that user is navigated to brand page and brand products are displayed
7. On left side bar, click on any other brand link
8. Verify that user is navigated to that brand page and can see products
     */
    //1. Tarayıcıyı başlatın
    //2. 'http://automationexercise.com' URL'sine gidin
    //3. 'Ürünler' düğmesine tıklayın
    //4. Sol taraftaki çubukta Markaların göründüğünü doğrulayın
    //5. Herhangi bir marka adına tıklayın
    //6. Kullanıcının marka sayfasına yönlendirildiğini ve marka ürünlerinin görüntülendiğini doğrulayın.
    //7. Sol taraftaki çubukta herhangi bir başka marka bağlantısına tıklayın
    //8. Kullanıcının o marka sayfasına gittiğini ve ürünleri görebildiğini doğrulayın

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationexercise.com");

    }

    @AfterClass
    public static void teardown() {

        driver.close();
    }

    @Test
    public void test01() {
        //3. 'Ürünler' düğmesine tıklayın
driver.findElement(By.xpath("//i[@class=\"material-icons card_travel\"]")).click();

    }

    @Test
    public void test02 () throws InterruptedException {
        //4. Sol taraftaki çubukta Markaların göründüğünü doğrulayın
        List<WebElement> aramaSonuclariElementList= driver.findElements(By.xpath("//div[@class=\"brands-name\"]"));
   Assert.assertTrue(!(aramaSonuclariElementList.isEmpty()));
   Thread.sleep(2000);

      //  for (WebElement webElement : aramaSonuclariElementList) {
      //      System.out.println(  "---" + webElement.getText()); }

        }


    @Test
    public void test03 () {

        driver.navigate().refresh();
        // //5. Herhangi bir marka adına tıklayın

        driver.findElement(By.xpath(" //a[@href=\"/brand_products/Polo\"]")).click();

        }
    @Test
    public void test04() {
        //6. Kullanıcının marka sayfasına yönlendirildiğini ve marka ürünlerinin görüntülendiğini doğrulayın.
        WebElement brandName = driver.findElement(By.className("active"));
        Assert.assertTrue("Marka sayfası yüklenemedi.", brandName.getText().contains("Polo"));
        WebElement marakaUrunleri=driver.findElement(By.xpath("//h2[@class=\"title text-center\"]"));
       Assert.assertTrue( "urunler güruntulenmiyor",marakaUrunleri.getText().contains("POLO"));
    //    System.out.println(marakaUrunleri.getText());
    }

       @Test
        public void test05(){

driver.findElement(By.xpath("//a[@href=\"/brand_products/Madame\"]")).click();
       }
       @Test
        public void test06() {

           //8. Kullanıcının o marka sayfasına gittiğini ve ürünleri görebildiğini doğrulayın
           WebElement brandName = driver.findElement(By.className("active"));
           Assert.assertTrue("Marka sayfası yüklenemedi.", brandName.getText().contains("Madame"));
           WebElement marakaUrunleri=driver.findElement(By.xpath("//h2[@class=\"title text-center\"]"));
           Assert.assertTrue( "urunler güruntulenmiyor",marakaUrunleri.getText().contains("MADAME"));
        }
    }


