package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.TestBaseClass;

public class Slayt155 extends TestBaseClass {
    @Test
    public void test1() {
        // 1. Adım: "http://webdriveruniversity.com/" adresine gidin
        driver.get("http://webdriveruniversity.com/");
        WebElement loginPortalLink = driver.findElement(By.xpath("//*[text()='Login Portal']"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(loginPortalLink);
        // 2. Adım: "Login Portal" a kadar asagi inin ve tıklayın
        loginPortalLink.click();
        bekle(1);
        // 3. Adım: Diger window'a gecin
        String mainWindowHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        bekle(2);
        // 4. Adım: "username" ve "password" kutularina deger yazdirin
        WebElement usernameInput = driver.findElement(By.id("text"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys("username");
        passwordInput.sendKeys("password");

        // 5. Adım: "login" butonuna basin
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        bekle(2);
        // 6. Adım: Popup'ta cikan yazinin "validation failed" oldugunu test edin

            String actualAlertYazisi = driver.switchTo().alert().getText();
            String expectedAlertYazisi = "validation failed";
            Assert.assertEquals(expectedAlertYazisi, actualAlertYazisi);
            // 7. Adım: Ok diyerek Popup'i kapatin
            driver.switchTo().alert().accept();
            bekle(2);
            // 8. Adım: Ilk sayfaya geri donun
            driver.switchTo().window(mainWindowHandle);
            bekle(1);
            // 9. Adım: Ilk sayfaya donuldugunu test edin java assert ile
            String expectedTitle = "WebDriverUniversity.com";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);
        }
    }

