package Day01_Giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DersTekrari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();



    }
}
