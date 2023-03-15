package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2_Assert {

    /* ...Exercise2...
 1 - Driver olusturalim
 2 - Java class'imiza chromedriver.exe'yi tanitalim
 3 - Driver'in tum ekrani kaplamasini saglayalim
 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
 5 - "https://www.otto.de" adresine gidelim
 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
 8 - Ardindan "https://wisequarter.com/" adresine gidelim
 9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
     kontrol edelim
 10- Bir onceki web sayfamiza geri donelim
 11- Sayfayi yenileyelim
 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
 13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.otto.de");
    }

    @Test
    public void test01(){
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String notExpectedIcerik = "OTTO";

        Assert.assertTrue(title.contains(notExpectedIcerik));
        Assert.assertTrue("başarısız",url.contains(notExpectedIcerik));
    }

    @Test
    public void test02(){
        driver.navigate().to("https://wisequarter.com/");
        String wiseTitle = driver.getTitle();
        String expectedUrlIcerik = "Quarter";

        Assert.assertTrue(wiseTitle.contains(expectedUrlIcerik));
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.close();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}

