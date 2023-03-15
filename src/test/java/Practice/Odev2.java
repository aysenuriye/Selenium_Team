package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev2 {/* ...Exercise4...
Navigate to  https://testpages.herokuapp.com/styled/index.html
Click on  Calculater under Micro Apps
Type any number in the first input
Type any number in the second input
Click on Calculate
Get the result
Print the result
     *//* ...Alıştırma4...
https://testpages.herokuapp.com/styled/index.html adresine gidin
Mikro Uygulamalar altında Hesaplayıcı'ya tıklayın
İlk girişte herhangi bir sayı yazın
İkinci girişe herhangi bir sayı yazın
Hesapla'ya tıklayın
sonucu al
sonucu yazdır
     */
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testpages.herokuapp.com/styled/index.html");

    }
    @AfterClass
    public static void teardown(){

        driver.close();
    }
    @Test
    public void test01() {
        driver.findElement(By.id("calculate")).click();
    }
    @Test
            public void  test02(){
driver.findElement(By.id("number1")).sendKeys("10");

    }
    @Test
    public void  test03(){
        driver.findElement(By.id("number2")).sendKeys("5");
    }
    @Test
    public void test04(){
        driver.findElement(By.id("calculate")).click();


    }@Test
    public void test05(){
        String sonuc = driver.findElement(By.id("answer")).getText();
        Assert.assertEquals("15",sonuc);
        System.out.println("hesaplama işlemi doğru");



    }
    @Before
    public void bekleme() throws InterruptedException {
       Thread.sleep(2000);
    }

}
