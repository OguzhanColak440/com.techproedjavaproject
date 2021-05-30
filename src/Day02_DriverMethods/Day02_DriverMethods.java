package Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.navigate().to("https://amazon.com");

        // --- Amazonun title ' ini alır
        String amazonTitle = driver.getTitle();
        // --- title i yazdırır
        System.out.println("Amazonun Titlesi : " + amazonTitle );

        // Amazonun url'Sini alır
        String amazonUrl = driver.getCurrentUrl();
        //Amazonun url'sini yazdırır
        System.out.println("amazonun Url'si : " + amazonUrl);
    }
}
