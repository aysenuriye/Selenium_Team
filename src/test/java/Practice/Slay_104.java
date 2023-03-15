package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import utilities.TestBaseClass;



public class Slay_104 extends TestBaseClass {
    @Test
    public void test01() {


        // URL'yi açma
        driver.get("http://zero.webappsecurity.com/");

        // "Sign in" butonuna tıklama
        driver.findElement(By.xpath("//*[@id=\"signin_button\"]")).click();
        // "Login" sayfasına kullanıcı adı ve şifre girme
        driver.findElement(By.xpath("//input[@id=\"user_login\"]")).sendKeys("username");
        driver.findElement(By.xpath("//input[@id=\"user_password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
        bekle(1);
        driver.navigate().back();
    }

    @Test
    public void test02() {
        // "Pay Bills" sayfasına yönlendirme
        driver.findElement(By.xpath("//*[@id=\"online-banking\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"pay_bills_link\"]")).click();
    }
        @Test
        public void test03 () {
            bekle(1);
            // "Purchase Foreign Currency" sayfasına yönlendirme
            driver.findElement(By.xpath("//a[@href=\"#ui-tabs-3\"]")).click();
        }
            @Test
            public void test04 () {
                bekle(1);

                // "Currency" dropdown menüsünden "Eurozone" seçimi
                WebElement ddm = driver.findElement(By.xpath("//select[@id=\"pc_currency\"]"));
                Select select = new Select(ddm);
                select.selectByVisibleText("Eurozone (euro)");
                //   WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
                // Select select = new Select(ddm);
                // select.selectByVisibleText("Eurozone (euro));

                // "Amount" kutusuna bir sayı girme
                driver.findElement(By.xpath("//*[@id=\"pc_amount\"]")).sendKeys("1000");


                // "US Dollars" seçiminin yapılmadığını kontrol etme
                bekle(1);
                WebElement DollarsRadioButonu = driver.findElement(By.xpath("//input[@id='pc_inDollars_true']"));
                Assert.assertFalse("US Dollars seçili değil.", DollarsRadioButonu.isSelected());
            }
 @Test

         public void test06(){

            // "Selected currency" butonuna tıklama
            driver.findElement(By.xpath("//*[@id=\"pc_inDollars_false\"]")).click();

            bekle(1);
            // "Calculate Costs" butonuna tıklama
            driver.findElement(By.xpath("//*[@id=\"pc_calculate_costs\"]")).click();

            bekle(1);
            // "Purchase" butonuna tıklama
            driver.findElement(By.xpath("//*[@id=\"purchase_cash\"]")).click();


            // Başarılı mesajının görüntülenmesini kontrol etme
            bekle(5);


            String basariliYazisi = driver.findElement(By.xpath("//*[@id=\"alert_content\"]")).getText();

            Assert.assertTrue("Başarılı mesaj görüntülenmedi.", basariliYazisi.contains("successfully"));


        }
    }


