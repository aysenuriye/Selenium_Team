package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

public class Auto extends TestBase  {
       ;
    @Test
    public void test1()  {

        // 2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");

        // 3. 'Ürünler' düğmesine tıklayın
        WebElement urunlerButton = driver.findElement(By.xpath("//a[@href='/products']"));
        urunlerButton.click();
  ///    WebElement frameElementi= driver.findElement(By.id("google_esf"));
  ///    driver.switchTo().frame(frameElementi);
     //   driver.navigate().refresh();

 //    WebElement reklamButton =driver.findElement(By.id("header"));
 //   reklamButton.click();


        // 4. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla yönlendirildiğini doğrulayın
        String expectedURL = "ALL PRODUCTS";
        String actualURL = driver.findElement(By.xpath("//h2[@class=\"title text-center\"]")).getText();
        Assert.assertEquals(expectedURL,actualURL);




        // 5. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        WebElement aramaInput = driver.findElement(By.xpath("//input[@type='text']"));
        aramaInput.sendKeys("ürün adı");
        WebElement aramaButton = driver.findElement(By.xpath("submit_search"));
        aramaButton.click();
/*
        // 6. "ARALAN ÜRÜNLER"in görünür olduğunu doğrulayın
        WebElement aralanUrunlerTitle = driver.findElement(By.xpath("//h1[@class='title']/span"));
        assert aralanUrunlerTitle.getText().equals("ARALAN ÜRÜNLER") : "Beklenen başlık değeri mevcut değil.";

        // 7. Arama ile ilgili tüm ürünlerin görünür olduğunu doğrulayın
        WebElement urunlerListesi = driver.findElement(By.xpath("//div[@class='productArea']"));
        assert urunlerListesi.isDisplayed() : "Ürünler listesi görüntülenemiyor.";

        // 8. Bu ürünleri sepete ekleyin
        WebElement sepeteEkleButton = driver.findElement(By.xpath("//button[text()='Sepete Ekle']"));
        sepeteEkleButton.click();

        // 9. 'Sepet' düğmesine tıklayın ve ürünlerin sepette göründüğünü doğrulayın
        WebElement sepetButton = driver.findElement(By.xpath("//a[@class='myBasket']"));
        sepetButton.click();
        WebElement sepettekiUrunlerListesi = driver.findElement(By.xpath("//div[@class='productArea']"));
        assert sepettekiUrunlerListesi.isDisplayed() : "Sepetteki ürünler listesi görüntülenemiyor.";

        // 10. 'Kaydol / Giriş Yap' düğmesini tıklayın ve giriş bilgilerini gönderin
        WebElement girisButton = driver.findElement(By.xpath("//a[@class='btnSignIn']"));
        girisButton.click();
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        emailInput.sendKeys("kullanıcı-email@mail.com");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys("sifre123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btnLogin']"));
        loginButton.click();

        // 11. Tekrar Sepet sayfasına gidin
        sepetButton.click();

        // 12. Giriş yaptıktan sonra bu ürünlerin de sepette göründüğünü doğrulayın
        assert sepettekiUrunlerListesi.isDisplayed() : "Sepetteki ürünler listesi görüntülenemiyor.";



 */
    }
}
