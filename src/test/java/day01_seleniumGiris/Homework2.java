package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Homework2 {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            // Youtube sayfasina gidin
            driver.get("https://www.youtube.com/");

            // Sayfa basliginin "youtube" olup olmadigini dogrulayin
            String expectedTitle = "youtube";
            String actualTitle = driver.getTitle();
            if (actualTitle.contains(expectedTitle)) {
                System.out.println("Sayfa basligi dogrulandi: " + expectedTitle);
            } else {
                System.out.println("Gecerli sayfa basligi: " + actualTitle);
            }

            // Sayfa URL'sinin "youtube" icerip icermediğini dogrulayin
            String expectedURL = "youtube";
            String actualURL = driver.getCurrentUrl();
            if (actualURL.contains(expectedURL)) {
                System.out.println("Sayfa URL'si dogrulandi: " + expectedURL);
            } else {
                System.out.println("Gecerli sayfa URL'si: " + actualURL);
            }

            // Amazon sayfasina gidin
            driver.get("https://www.amazon.com/");

            // Youtube sayfasina geri donun
            driver.navigate().back();

            // Sayfayi yenileyin
            driver.navigate().refresh();

            // Amazon sayfasina donun
            driver.navigate().forward();

            // Sayfayi tamsayfa yapin
            driver.manage().window().maximize();

            // Sayfa basliginin "Amazon" icerip icermediğini dogrulayin
            expectedTitle = "Amazon";
            actualTitle = driver.getTitle();
            if (actualTitle.contains(expectedTitle)) {
                System.out.println("Sayfa basligi dogrulandi: " + expectedTitle);
            } else {
                System.out.println("Gecerli sayfa basligi: " + actualTitle);
            }

            // Sayfa URL'sinin https://www.amazon.com/ olup olmadigini dogrulayin
            expectedURL = "https://www.amazon.com/";
            actualURL = driver.getCurrentUrl();
            if (actualURL.equals(expectedURL)) {
                System.out.println("Sayfa URL'si dogrulandi: " + expectedURL);
            } else {
                System.out.println("Gecerli sayfa URL'si: " + actualURL);
            }

            // Sayfayi kapatin
            driver.quit();
        }
    }

