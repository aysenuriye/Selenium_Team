package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07 {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        // Chrome browser'ı kullanarak sayfayı açın
    WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        // Sayfa başlığını yazdırın
        System.out.println("Sayfa Başlığı: " + driver.getTitle());
        // Sayfa başlığının "Amazon" içerdiğini test edin

        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        // Sayfa adresini yazdırın
        System.out.println("sayfanın adresi :"+ driver.getCurrentUrl());
        // Sayfa URL'inin "amazon" içerdiğini test edin
        if (driver.getCurrentUrl().contains("amazon")){
            System.out.println("sayfanın URlsi amazon iceriyor");
        }else {
            System.out.println("sayfanın urlsi amazon içermiyor");
        }
        //sayfa handle değerini yazdırın
        System.out.println("sayfa handle değeri" + driver.getWindowHandle());
        // Sayfa HTML kodlarında "alisveris" kelimesi geçtiğini test edin
        if (driver.getPageSource().contains("alisveris")){
            System.out.println("sayfa html kodlarında alısveris kelimesi geciyor");
        }else {

            System.out.println("sayfa değerlerinde alışveris kelimesi geçmiyor");
        }
        //sayfayı kapat
        driver.quit();
    }
}