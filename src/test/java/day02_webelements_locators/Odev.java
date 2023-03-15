package day02_webelements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Odev {
    /*
    Automation Exercise Category Testi
    1- Bir test class’i olusturun ilgili ayarlari yapin
    2- https://www.automationexercise.com/ adresine gidin
    3- Category bolumundeki elementleri locate edin
    4- Category bolumunde 3 element oldugunu test edin
    5- Category isimlerini yazdirin
    6- Sayfayi kapatin
     */
        public static void main(String[] args) {
            // WebDriver ayarlarını yapma

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            // https://www.automationexercise.com/ adresine gitme
            driver.get("https://www.automationexercise.com/");

            // Category bölümündeki elementleri bulma
            List<WebElement> categoryElements = driver.findElements(By.xpath("//*[@id=\"accordian\"]"));

            // Category bölümünde 3 element olduğunu test etme
            int expectedElemntsayisi=3;
            int actualElementsayisi=categoryElements.size();
            if (expectedElemntsayisi==actualElementsayisi) {
                System.out.println("Category bölümünde 3 element var");
            } else {
                System.out.println("Category bölümünde 3 element yok");
            }

            // Category isimlerini yazdırma
            for (WebElement element : categoryElements) {
                System.out.println(element.getText());
            }
            System.out.println(categoryElements.size());
            // Tarayıcıyı kapatma
            driver.quit();
        }
    }


