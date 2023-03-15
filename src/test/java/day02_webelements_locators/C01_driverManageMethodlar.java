package day02_webelements_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverManageMethodlar {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();


        System.out.println("Ilk size : "+driver.manage().window().getSize());//Ilk size : (1050, 708)
        System.out.println("Ilk position : " + driver.manage().window().getPosition());//Ilk position : (10, 10)

        Thread.sleep(2000);
        // olculeri ve konumu degistirelim
        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(40,100));
        System.out.println("size : "+driver.manage().window().getSize());//size : (516, 500)
        System.out.println("position : " + driver.manage().window().getPosition());//position : (40, 100)
        Thread.sleep(2000);
        driver.close();
    }
}

