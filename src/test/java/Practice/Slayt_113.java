package Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Slayt_113 extends TestBase {

    @Test
    public void iframeTest() {
        // İlgili web sayfasını açın
        driver.get("https://the-internet.herokuapp.com/iframe");

        // "An IFrame containing..." metnini doğrulayın ve konsolda yazdırın
        WebElement iFrameBaslik = driver.findElement(By.tagName("h3"));
        assertTrue(iFrameBaslik.isDisplayed());
        assertEquals("An iFrame containing the TinyMCE WYSIWYG Editor", iFrameBaslik.getText());
        System.out.println("IFrame başlığı doğrulandı.");
           bekle(2);
        // IFrame içine geçin
        WebElement frameElementi= driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frameElementi);

        // Text kutusuna "Merhaba Dünya!" yazın
        WebElement textKutusu = driver.findElement(By.xpath("//body[@id=\"tinymce\"]"));
        textKutusu.clear();
        textKutusu.sendKeys("Merhaba Dünya!");
  bekle(2);
        // Text kutusunun içeriğini doğrulayın ve konsolda yazdırın
        assertEquals("Merhaba Dünya!", textKutusu.getText());
        System.out.println("Text kutusu doğrulandı.");
        bekle(2);

        // "Elemental Selenium" linkinin görünür olduğunu doğrulayın ve konsolda yazdırın
        driver.switchTo().defaultContent();
        WebElement seleniumLink =    driver.findElement(By.linkText("Elemental Selenium"));
        assertTrue(seleniumLink.isDisplayed());
        assertEquals("http://elementalselenium.com/", seleniumLink.getAttribute("href"));
        System.out.println("Link doğrulandı.");
    }
}

