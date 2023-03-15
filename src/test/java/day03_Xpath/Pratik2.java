package day03_Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pratik2 {
    /*
    1. Tarayıcıyı başlatın
2. 'http://automationexercise.com' URL'sine gidin
3. Ana sayfanın başarıyla göründüğünü doğrulayın
4. 'Ürünler' düğmesine tıklayın
5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla yönlendirildiğini doğrulayın
6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
7. "ARALAN ÜRÜNLER"in görünür olduğunu doğrulayın
8. Arama ile ilgili tüm ürünlerin görünür olduğunu doğrulayın javada yap
     */
    public static void main(String[] args) {
                // Tarayıcıyı başlatma
                WebDriver driver = new ChromeDriver();

                // URL'ye gitme
                driver.get("http://automationexercise.com");

                // Ana sayfanın yüklendiğini doğrulama
                WebElement homePageTitle = driver.findElement(By.tagName("h1"));
                if (homePageTitle.getText().equals("Welcome to the Test Site")) {
                    System.out.println("Ana sayfa başarıyla yüklendi.");
                } else {
                    System.out.println("Ana sayfa yüklenirken bir hata oluştu.");
                }

                // "Ürünler" düğmesine tıklama
                WebElement productsButton = driver.findElement(By.xpath("material-icons card_travel"));
                productsButton.click();

                // Tüm ürünler sayfasına yönlendirildiğini doğrulama
                WebElement productsPageTitle = driver.findElement(By.tagName("h1"));
                if (productsPageTitle.getText().equals("All Products")) {
                    System.out.println("Tüm ürünler sayfasına başarıyla yönlendirildi.");
                } else {
                    System.out.println("Tüm ürünler sayfasına yönlendirilirken bir hata oluştu.");
                }

                // Arama kutusuna bir ürün adı yazma ve arama düğmesine tıklama
                WebElement searchBox = driver.findElement(By.name("s"));
                searchBox.sendKeys("Kalem");
                WebElement searchButton = driver.findElement(By.className("searchsubmit"));
                searchButton.click();

                // "ARALAN ÜRÜNLER" metninin görüntülendiğini doğrulama
                WebElement searchResultTitle = driver.findElement(By.tagName("h1"));
                if (searchResultTitle.getText().contains("ARALAN ÜRÜNLER")) {
                    System.out.println("Arama sonuçları başarıyla görüntülendi.");
                } else {
                    System.out.println("Arama sonuçları görüntülenirken bir hata oluştu.");
                }

                // Arama sonuçlarının tümünün görüntülendiğini doğrulama
                WebElement searchResults = driver.findElement(By.className("products"));
                if (searchResults.findElements(By.tagName("li")).size() > 0) {
                    System.out.println("Arama sonuçları tümüyle görüntülendi.");
                } else {
                    System.out.println("Arama sonuçları tümüyle görüntülenirken bir hata oluştu.");
                }

                // Tarayıcıyı kapatma
                driver.quit();
            }
        }



