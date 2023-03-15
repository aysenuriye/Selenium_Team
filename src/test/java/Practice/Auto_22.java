package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Auto_22 extends TestBase {
    @Test
    public void test1(){

    //2. 'http://automationexercise.com' URL'sine gidin

        driver.get("http://automationexercise.com");
    //3. Sayfanın en altına gidin
        Actions actions=new Actions(driver);
        /**  actions.sendKeys(Keys.END);
         * */

    //4. 'ÖNERİLEN ÖĞELER'in görünür olduğunu doğrulayın
        WebElement itemsYazisi=driver.findElement(By.xpath("//*[text()=\"Features Items\"]"));
        Assert.assertTrue(itemsYazisi.isDisplayed());
    //5. Önerilen üründe 'Sepete Ekle'ye tıklayın
       WebElement addButonu= driver.findElement(By.xpath("(//*[text()=\"Add to cart\"])[1]"));
       addButonu.click();
       bekle(2);
    //6. 'Sepeti Görüntüle' düğmesine tıklayın
     WebElement sepetiG=   driver.findElement(By.xpath("//*[text()=\"View Cart\"]"));
     sepetiG.click();
    //7. Sepet sayfasında ürünün görüntülendiğini doğrulayın
        WebElement goruntuleme=driver.findElement(By.xpath("//*[@id=\"cart_info\"]"));
        Assert.assertTrue(goruntuleme.isDisplayed());
        bekle(2);

        System.err.println("kırmızı"
        );
    }
}
