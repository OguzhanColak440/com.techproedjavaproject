package Day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse1 {

    /*
    1. Create a class : Day02_IfElseTest
2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının "youtube"
olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda
yazdirin.
3. Sayfa URL'sinin "youtube" içerip içermediğini(contains) doğrulayın, içermiyorsa doğru
URL'yi yazdırın.
4. Daha sonra Navigate to https://www.amazon.com/
5. Navigate back to youtube
6. Refresh the page
7. Navigate forward to amazon
8. Maximize the window
9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa
doğru başlığı(Actual Title) yazdırın.
10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
URL'yi yazdırın
11.Quit the browser
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //8. Maximize the window
        driver.manage().window().maximize();

        //2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının "youtube"
        //olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda
        //yazdirin.

        driver.get("https://youtube.com");
        String titleYoutube = driver.getTitle();

        if (titleYoutube.toLowerCase().contains("youtube")) {
            System.out.println("Baslık youtube kelimesini iceriyor");
        } else {
            System.out.println(titleYoutube);
        }



        //3. Sayfa URL'sinin "youtube" içerip içermediğini(contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.

        String youtubeUrl = driver.getCurrentUrl();

        if (youtubeUrl.toLowerCase().contains("youtube")){
            System.out.println("Url youtube kelimesini iceriyor");
        }else {
            System.out.println(youtubeUrl);
        }



        //4. Daha sonra Navigate to https://www.amazon.com/

        driver.navigate().to("https://amazon.com");


        //5. Navigate back to youtube
        driver.navigate().back();


        //6. Refresh the page
        driver.navigate().refresh();



        //7. Navigate forward to amazon
        driver.navigate().forward();


        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        String amazonTitle = driver.getTitle();

        if (amazonTitle.toLowerCase().contains("amazon")){
            System.out.println("Amazon sitesi title'ı aranan kelimeyi iceriyor");
        } else {
            System.out.println(amazonTitle);
        }



        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın

        String amazonUrl =driver.getCurrentUrl();

        if (amazonUrl.toLowerCase().contains("https://www.amazon.com/")){
            System.out.println("Dogru URL");
        } else {
            System.out.println(amazonUrl);
        }


        //11.Quit the browser
        driver.quit();

    }
}

