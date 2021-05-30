package Day01_Giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDersAlistirma1 {



    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");

        //1. google.com gidin
        // 2. Navigate to methodu ile amazon a gidin
        // 3. Navigate back ile geri gelin
        // 4. forward metodu ile tekrar ileri gidin
        // 5. bulundugunuz sayfayı yenileyin
        // 6.driveri kapatın.


        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();




    }
}
