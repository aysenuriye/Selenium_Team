package Practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Auto_26 extends TestBase {
    @Test
public void test01(){
    //1. Launch browser
    //2. Navigate to url 'https://automationexercise.com'
    driver.get("https://automationexercise.com/");
    //3. Verify that home page is visible successfully
    String actualUrl = driver.getCurrentUrl();
    String expeUrl = "https://automationexercise.com/";

    Assert.assertEquals(actualUrl,expeUrl);
    //4. Scroll down page to bottom
    Actions actions = new Actions(driver);
    actions.sendKeys(Keys.END).perform();
    bekle(3);
    //5. Verify 'SUBSCRIPTION' is visible
    WebElement subscription = driver.findElement(By.xpath("//*[text()='Subscription']"));

    Assert.assertTrue(subscription.isDisplayed());

    //6. Scroll up page to top
    actions.sendKeys(Keys.HOME).perform();
    bekle(3);
    //7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
    WebElement yaziGorundu = driver.findElement(By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']"));
    Assert.assertTrue(yaziGorundu.isDisplayed());
}
}
