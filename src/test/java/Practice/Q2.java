package Practice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {/* ...Exercise2...
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

    public static void main(String[] args) throws InterruptedException {
        // 2 - Java class'imiza chromedriver.exe'yi tanitalim
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//bu satırda sisteme driverimizi tanıtıyoruz
        // 1 - Driver olusturalim
        WebDriver driver = new ChromeDriver();
//Driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();
        // 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        //     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//selenium metodudur 10 saniye ye kadar çalışmasını bekleyebilir
        Thread.sleep(5000);//java metodudur//her türlü 5 saniye bekle kodun çalışmasını 5 saniye durdur
        // - "https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");
        //-  web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String actuallBaslik =driver.getTitle();
      String actuallUrl= driver.getCurrentUrl();
      // 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
        String expectedBaslik="OTTO";
        String expectedUrl="OTTO";
        if (actuallBaslik.contains(expectedBaslik)){
            System.out.println("başlık testi PASSED");
        }else{
            System.out.println("başlık testi Failed");
        }
        if (actuallUrl.contains(expectedUrl)){
            System.out.println("URL testi PASSED");
        }else {
            System.out.println("URL testi FAİLED");
        }
        // 8 - Ardindan "https://wisequarter.com/" adresine gidelim
        driver.get("https://wisequarter.com");

        // Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
        //     kontrol edelim
        String WiseBaslik= driver.getTitle();
       String expectedWiseBaslik="Quarter";
       if (WiseBaslik.contains(expectedWiseBaslik)){
           System.out.println("Wise başlık testi  PASSED");
       }else{
           System.out.println("WİSE başlık testi Failed");
       }
        //10- Bir onceki web sayfamiza geri donelim
       driver.navigate().back();
       // 11- Sayfayi yenileyelim
       driver.navigate().refresh();
       // 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
       driver.navigate().forward();
       // 13- En son adim olarak butun sayfalarimizi kapatmis olalim
       driver.close();
    }
}
