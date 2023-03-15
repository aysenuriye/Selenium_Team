package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Odev3 {  /*
    Navigate to website https://testpages.herokuapp.com/styled/index.html
    Under the ORIGINAL CONTENTS
    click on Alerts
    print the URL
    navigate back
    print the URL
    Click on Basic Ajax
    print the URL
    enter value 20 and ENTER
    and then verify Submitted Values is displayed open page
    close driver
     *//*
    https://testpages.herokuapp.com/styled/index.html web sitesine gidin
    ORİJİNAL İÇERİKLER altında
    uyarılara tıklayın
    URL'yi yazdır
    geri git
    URL'yi yazdır
    Temel Ajax'a tıklayın
    URL'yi yazdır
    20 değerini girin ve ENTER
    ve ardından Gönderilen Değerlerin açık sayfada görüntülendiğini doğrulayın
    sürücüyü kapat
     */
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testpages.herokuapp.com/styled/index.html");

    }

    @AfterClass
    public static void teardown() {

        driver.close();
    }

    @Test
    public void test01() {
        driver.findElement(By.xpath("//*[@id=\"alerts\"]")).click();

    }

    @Test
    public void test02() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL : " + currentUrl);
    }

    @Test
    public void test03() {
        driver.navigate().back();
    }

    @Test
    public void test04() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL  " + currentUrl);
    }

    @Test
    public void test05() {
        driver.findElement(By.xpath("//*[@id=\"basicajax\"]")).click();
    }

    @Test
    public void test06() {
      String  currentUrl = driver.getCurrentUrl();
        System.out.println("AJAX Current URL : " + currentUrl);

    }@Test
    public void test07(){
        driver.findElement(By.id("lteq30")).sendKeys("20");

    }
    @Test
    public void test08(){
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
    }
    @Test
    public void test09(){
       // WebElement gonderilenDeger =
    //    Assert.assertEquals("Submitted value: 20",gonderilenDeger.getText());
        WebElement sonucSayfasi = driver.findElement(By.xpath("/html/body"));
        Assert.assertTrue(sonucSayfasi.getText().contains("Submitted Values"));
       // System.out.println(sonucSayfasi.isDisplayed());
    }
}
