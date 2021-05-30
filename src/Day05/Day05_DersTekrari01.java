package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_DersTekrari01 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");



        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("computers");
        WebElement okeyButton = driver.findElement(By.id("nav-search-submit-button"));
        okeyButton.click();
        WebElement yaziElementi = driver.findElement(By.className("sg-col-inner"));
        yaziElementi.getText();
        //System.out.println(yaziElementi.getText());
        if (yaziElementi.isDisplayed()){
            System.out.println("Görüyorum");
        }else{
            System.out.println("Görmüyorum");
        }
    }
}



