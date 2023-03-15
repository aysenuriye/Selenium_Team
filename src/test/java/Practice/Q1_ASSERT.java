package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1_ASSERT {
    /*...Exercise1...
            Create a new class under Q1 create main method
            Set Path
            Create chrome driver
            Maximize the window
            Open google home page https://www.google.com/.
            On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
            Navigate forward to amazon
            Refresh the page
            Close/Quit the browser
            And last step : print "All Ok" on console
        */
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com/");

    }
    @AfterClass
    public static void tearDown(){
        driver.close();
        System.out.println("All Ok");
    }

    @Test
    public void test01(){
        driver.get("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }


}

