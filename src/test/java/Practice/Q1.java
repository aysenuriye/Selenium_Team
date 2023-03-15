package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
    /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
     Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */
    public static void main(String[] args) throws InterruptedException {
//   Create a new class under Q1 create main method
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//bu satırda sisteme driverimizi tanıtıyoruz
        //driver izin yolunu gösteriyoruz
        //  Create chrome driver
        WebDriver driver =new ChromeDriver();

        //Mazimize the window

        driver.manage().window().maximize();
//   Open google home page https://www.google.com/.

        driver.get("https://www.gooogle.com");//ilk etapta navigare mi get minasıl karar veriyoruz
        //getin daha hızlı bulduuğu navigate ise bağımlı senarolarda kuallnılır
        // On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
//   Navigate back to google
        driver.navigate().back();
        //  Navigate forward to amazon
        driver.navigate().forward();
        //  Refresh the page
        driver.navigate().refresh();
        // Close/Quit the browser Close olduğun pencereyi yani sekmei kapatıyor //quit tüm pencereyi driveri tamamen kapatıyor
        driver.quit();
        //  And last step : print "All Ok" on console
        System.out.println("All Ok");
        Thread.sleep(3000);
    }


}
