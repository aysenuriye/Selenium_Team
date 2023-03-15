package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DreiversMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getWindowHandle());
        // getWindowHandle selenium tarafindan her driver sayfasi icin uretilen
        // unique handle degerini döndürür
        // getWindowHandels() ise test sirasinda birden fazla sayfa acilmissa
        // bir set olarak, tum sayfalarin window handle degerlerini

        System.out.println(driver.getPageSource());

        //sayfa kodları "2 hours weekly meeting  with the team "içeriyormu test edinx

        String expectedIcerik = "2 hours weekly meeting  with the team ";
        String actualSayfaKodlari = driver.getPageSource();

        if (actualSayfaKodlari.contains(expectedIcerik)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("test FAİLED");
        }

        driver.quit();
        // close() ve quit() ikisi de sayfa kapatmak icin kullanilir
        // close() sadece bir sayfa kapatirken
        // quit() test sirasinda acilan tum sayfalari kapatir

}
}
