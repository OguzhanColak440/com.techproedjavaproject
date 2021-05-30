package Day01_Giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDersAlistirma2 {

    // 1. Google.com a gidelim
    // 2. Youtube.com a gidelim
    // 3. Google.com a geri dönelim
    // 4. Youtube.com a forward ile tekrar gidelim
    // 5. Bulundugumuz sayfayı yenileyelim
    // 6. Driveri kapatalım
    // 7. Driveri maximize edelim

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();

    }
}
