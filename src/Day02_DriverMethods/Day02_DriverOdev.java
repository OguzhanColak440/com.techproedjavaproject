package Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {


    public static void main(String[] args) {

    //driverı ekranı kaplıcakşekilde kullanalım
    //1-ilk önce google.com'a gidelim
    //2-sayfanın title'ını alalım ekrana yazdıralım
    //3-daha sonra youtube.com'a gidelim
    //4-sayfanın title'ını ve urlsini alıp ekrana yazdıralım
    //5-google.com'a geri gelelim ve sayfanın url'sini alıp ekrana yazdıralım
    //6-driverımızı kapatalım

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String googletitle = driver.getTitle();
        System.out.println("Google title : " + googletitle);
        driver.navigate().to("https://youtube.com");
        String amazonUrl = driver.getCurrentUrl();
        String amazontitle = driver.getTitle();
        System.out.println("Youtube title :" + amazontitle);
        System.out.println("Youtube url " + amazonUrl);
        String googleUrl= driver.getCurrentUrl();
        System.out.println("Google Url : " + googleUrl);
        driver.navigate().back();

        driver.quit();

    }
}
