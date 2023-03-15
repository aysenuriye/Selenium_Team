package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Slay_114 extends TestBase {
    @Test
    public void guru99Test() {
        // İlgili web sayfasını açın
        driver.get("http://demo.guru99.com/test/guru99home/");

        // Sayfadaki iframe sayısını bulun ve konsolda yazdırın
        int iFramesSayisi = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Sayfadaki iframe sayısı: " + iFramesSayisi);
bekle(2);
        // İlk iframe'e geçin ve YouTube videonun play butonuna tıklayın
        driver.switchTo().frame(0);
        WebElement playButton = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        assertTrue(playButton.isDisplayed());
        playButton.click();
        System.out.println("YouTube video oynatıldı.");
bekle(2);
        // Ana sayfaya dönün
        driver.switchTo().defaultContent();
        System.out.println("Ana sayfaya dönüldü.");
  bekle(2);
        // İkinci iframe'e geçin ve JMeter Made Easy linkine tıklayın
        driver.switchTo().frame(1);
        WebElement jmeterElementi = driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]"));
        assertTrue(jmeterElementi.isDisplayed());
       assertEquals("http://www.guru99.com/live-selenium-project.html", jmeterElementi.getAttribute("href"));
        jmeterElementi.click();
        bekle(2);
        System.out.println("JMeter linkine tıklandı.");
    }
}

