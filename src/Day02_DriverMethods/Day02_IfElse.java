package Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
    "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        String amazonTitle = driver.getTitle();
        System.out.println(amazonTitle + "Amazon Title");


        if (amazonTitle.toLowerCase().contains("computers")){
            System.out.println(amazonTitle + "Computer kelimesi geciyor");

        } else {
            System.out.println(amazonTitle + "Computer kelimesi gecmiyor");

        }


    }
}
