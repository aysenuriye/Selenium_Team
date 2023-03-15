package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverMethodlar {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");

        // Sayfa başlığını doğrula

        String expectedTitle="facebook";
        String actualTitle= driver.getTitle();


        if (expectedTitle.equals(actualTitle)){

            System.out.println("facebook title Testi PASSED");
        }else {
            System.out.println(" facebook title Testi FAİLED"+
                    "\n Gercekleşen Title"+ actualTitle );
        }

        String expectedIcerik="facebook";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedIcerik)){

            System.out.println("Facebook Url testi Passed");
        }else {
            System.out.println(" Facebook Url testi FAİLED"+
                    "\nGercekleşen URL" + actualUrl);

        }
        driver.get("https://www.walmart.com");


    }
}
