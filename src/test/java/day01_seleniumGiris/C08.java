package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08 {
    public static void main(String[] args) {

    // Chrome browser'ı kullanarak sayfayı açın
    WebDriver driver = new ChromeDriver();

    // YouTube ana sayfasına git
    driver.get("https://www.youtube.com/");

    // Amazon sayfasına git
    driver.navigate().to("https://www.amazon.com/");

    // Tekrar YouTube sayfasına git
    driver.navigate().back();

    // Yeniden Amazon sayfasına git
    driver.navigate().forward();

    // Sayfayı yenile
    driver.navigate().refresh();

    // Tüm sayfaları kapat
    driver.quit();
}
}

