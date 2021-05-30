package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_LocatorsxPath02 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // sayfa yüklenene kadar en fazla 5 saniye bekletir. öncesinde yüklenirse beklemez
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

      //  WebElement yazi = driver.findElement(By.tagName("h1"));
      //   System.out.println(yazi.getText());
        WebElement yazi1 = driver.findElement(By.xpath("//h1"));
        System.out.println(yazi1.getText());



    }
}
