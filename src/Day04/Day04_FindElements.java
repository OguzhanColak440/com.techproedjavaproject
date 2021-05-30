package Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_FindElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        List<WebElement> tagNameList = driver.findElements(By.tagName("a"));

          for (WebElement w : tagNameList){  //  for(i=1, i<tagname.size; i++)
             System.out.print(w.getText());

           //  for(int i=0; i<elements.size() ; i++ ) {
           //       System.out.println(elements.get(i).getText());

        }

    }










    }

