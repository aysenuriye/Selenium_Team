package day03_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Pratik4 {
    /*
    1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna basin
3- Delete butonu’nun gorunur oldugunu test edin
4- Delete tusuna basin
5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

     */
    public static void main(String[] args) throws InterruptedException {

       // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        ////*[text()="Add Element"]
        ////*[@onclick="addElement()"]
        driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
       WebElement deleteButonu= driver.findElement(By.xpath("//*[text()=\"Delete\"]"));

       if (deleteButonu.isDisplayed()){
           System.out.println("DELETE görünürlük testi başarılı");
       }else {
           System.out.println("DELETE görünürlük testi başarısız");
       }
        driver.findElement(By.xpath("//*[@class=\"added-manually\"]")).click();
       WebElement addRemove=driver.findElement(By.xpath("//*[text()=\"Add/Remove Elements\"]"));
        if (addRemove.isDisplayed()){
            System.out.println("REMOVE görünürlük testi başarılı");
        }else {
            System.out.println("REMOVE görünürlük testi başarısız");
        }
        //delete tuşuna 10 kere bass
        System.out.println(addRemove.getText());
        driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
        driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
        driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
        driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
        driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
        driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
        driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
        driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
        driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
        driver.findElement(By.xpath("//*[text()=\"Add Element\"]")).click();
        //10 kere basıldığını kontrol et :)
        List<WebElement> elementSayisi=driver.findElements(By.className("added-manually"));
        int element=1;
        for (WebElement eachelement:elementSayisi
             ) {
            System.out.println(    element + " ---- "+ eachelement.getText());
            element++;

        }

        System.out.println();
        Thread.sleep(3000);
        driver.quit();

    }
}
