package Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_ClearIsDisplayed {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        WebElement signInLinki = driver.findElement(By.id("sign-in"));

        signInLinki.click();

        WebElement emailKutusu=driver.findElement(By.id("session_email"));

        emailKutusu.sendKeys("testtechproed@gmail.com");
        emailKutusu.clear();

        WebElement signInButonu = driver.findElement(By.name("commit"));

        signInButonu.isDisplayed(); // Web elementin görünürlüğünü bulur

        if (signInButonu.isDisplayed()){ // Web elementin görünürlüğünü sorgular
            System.out.println("Evet Görünüyor");
        }else{
            System.out.println("Hayır Görünmüyor");
        }
    }
}
