package Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://youtube.com");
        String Youtube = driver.getTitle();
        System.out.println("Youtube  Title : " + Youtube );


        if (Youtube.toLowerCase().contains("youtube")){
            System.out.println(Youtube + " Title 'da video kelimesi geciyor");

        } else {
            System.out.println(Youtube + " Title 'da  video kelimesi gecmiyor");

        }





    }
}

