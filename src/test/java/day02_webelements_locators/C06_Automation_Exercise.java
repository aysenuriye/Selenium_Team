package day02_webelements_locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_Automation_Exercise {
/*
1- Bir test class’i olusturun ilgili ayarlari yapin
2- https://www.automationexercise.com/ adresine gidin
3- Sayfada 147 adet link bulundugunu test edin.
4- Products linkine tiklayin
5- special offer yazisinin gorundugunu test edin
6- Sayfayi kapatin
 */

        public static void main(String[] args) throws InterruptedException {
            // WebDriver ayarlarını yapma

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            // https://www.automationexercise.com/ adresine gitme
            driver.get("https://www.automationexercise.com/");

            // Sayfadaki linkleri bulma
            List<WebElement> linkElementleriList= driver.findElements(By.tagName("a"));
           int expectedLinksayisi=147;
           int actualLinksayisi=linkElementleriList.size();


            // Sayfada 147 adet link olduğunu test etme
            if (expectedLinksayisi==actualLinksayisi) {
                System.out.println("Sayfada 147 adet link var");
            } else {
                System.out.println("Sayfada 147 adet link FAİLED"+
                        "\n Sayfada var olan link sayisi" + actualLinksayisi);
            }

            // Products linkine tıklama
           driver.findElement(By.partialLinkText("Products")).click();

            // Special offer yazısının göründüğünü test etme
            WebElement specialOfferElementi = driver.findElement(By.id("sale_image"));
            if (specialOfferElementi.isDisplayed()) {
                System.out.println("Special Offer yazısı görünüyor");
            } else {
                System.out.println("Special Offer yazısı görünmüyor FAİLED");
            }

            // Tarayıcıyı kapatma
            Thread.sleep(3000);
            driver.quit();
        }
    }

