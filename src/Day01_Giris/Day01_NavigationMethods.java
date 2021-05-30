package Day01_Giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigationMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Driveri tüm sayfayı kaplatır sayfayı tam ekran yapma
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        // navigate method icerisine URL veya String yazabiliyoruz.
       // get ile navigate arasinda fark yok. Aradaki tek fark get method'u daha hizli calisir.
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.close();





    }
}
