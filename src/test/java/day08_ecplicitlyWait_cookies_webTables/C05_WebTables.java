package day08_ecplicitlyWait_cookies_webTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class C05_WebTables extends TestBase {
    @Test
    public void test01(){
        //1.“https://www.amazon.com” adresine gidin

        driver.get("https://www.amazon.com");
        //2.Sayfanin en altina inin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.END).perform();


        //3.Web table tum body’sini yazdirin
        WebElement tumBody= driver.findElement(By.xpath("//tbody"));
        System.out.println(tumBody.getText());
        //4.Web table’daki satir sayisinin 9 oldugunu test edin

        List<WebElement> satirlarListesi=driver.findElements(By.xpath("//tbody/tr"));
        Assert.assertEquals(10,satirlarListesi.size());
        //5.Tum satirlari yazdirin
          int satirno=1;
        for (WebElement eachSatir : satirlarListesi) {
            System.out.println(satirno + "---" + eachSatir);
            satirno++;
        }

        //6. Web table’daki sutun sayisinin 13 olduğunu test edin
        List<WebElement> ucuncuSAtirDatalarList=driver.findElements(By.xpath("//tbody/tr[3]/td"));
Assert.assertEquals(13,ucuncuSAtirDatalarList.size());

        //7. 5.sutunu yazdirin
List<WebElement> besiciSutunListesi=driver.findElements(By.xpath("//tbody/tr/td[5]"));
satirno=1;
        System.out.println("-----5.sutun-------");
        for (WebElement eachData : besiciSutunListesi) {
            System.out.println(satirno + "-  "+ eachData);
        satirno++;
        }
        //8.Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi döndüren bir method olusturun


        System.out.println("-----istenen data--------- "+
                getData(3, 5));
        bekle(2);
        //9- 7. satirin 9. datasının "Shoes" içerdiğini Test edin

       String actualData= getData(7,9);
String expectedIcerik="Shoes";
Assert.assertTrue(actualData.contains(expectedIcerik));

    }
    public  String getData(int satirNo,int sutunNo){
        //3,satır 5. satirdaki bilgiyi yazdirin
        //tbody/tr[3]/td[5]
  String dataXpath="//tbody/tr["+satirNo+ "]/td["+sutunNo +"]";

        String istenenData=driver.findElement(By.xpath(dataXpath)).getText();

        return istenenData;
        // List<WebElement> sutun = driver.findElements(By.xpath("//div[@class='rt-table']//div[@role='columnheader']"));
        //        System.out.println("Tabloda " + sutun.size() + " adept sütun vardır.");//
        //     List<WebElement> ucuncuSutur= driver.findElements(By.xpath("//div[@class='rt-table']//div[@role='gridcell'][position() mod 4 = 3]"));
        //        for (WebElement cell : thirdColumn) {
        //            System.out.println(cell.getText());
        //        }
        //
    }
}

