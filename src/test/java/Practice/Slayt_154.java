package Practice;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.TestBase;

import java.time.Instant;


public class Slayt_154 extends TestBase {
    @Test
    public void test1(){

      //.http://webdriveruniversity.com/IFrame/index.html"" adresine gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");
        WebElement frameElementi= driver.findElement(By.id("frame"));
        driver.switchTo().frame(frameElementi);
        // "Our Products" butonuna tıklama
        driver.findElement(By.xpath("//*[text()='Our Products']")).click();
        // "Cameras product"i tiklama
        driver.findElement(By.xpath("//*[text()='Cameras']")).click();
       // driver.findElement(By.xpath("//div[@id='container-product1']")).click();


bekle(2);
        // Açılan popup mesajını yazdırma ve kapatma
        WebElement popupMessage = driver.findElement(By.xpath("//div[@class='modal-body']"));
        System.out.println(popupMessage.getText());

        ///"close" butonuna tıklayın:
        driver.findElement(By.xpath("//*[text()='Close']")).click();
      //  "WebdriverUniversity.com (IFrame)" linkine tıklayın:

      driver.switchTo().parentFrame();
         WebElement yazi= driver.findElement(By.xpath("(//a[@class='navbar-brand'])[1]"));
      yazi.click();
        bekle(2);
        String expectedUrl = "http://webdriveruniversity.com/index.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);    }
}
