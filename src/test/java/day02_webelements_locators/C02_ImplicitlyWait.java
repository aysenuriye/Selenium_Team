package day02_webelements_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ImplicitlyWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    /*
    Driver bir web uygulamasına gönderdiğimizde o sayfanın  açılması,
    orda istediğimiz işlemleri yapmak için elemnetleri bulması gibi işlemler zaman gerektirebilir

   impicity wait bu tür zaman isteyen işlemler için max  ne kadar beklişyeceğini belirler.



     */

    }


}
