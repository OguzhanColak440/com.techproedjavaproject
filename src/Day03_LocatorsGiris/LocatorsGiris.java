package Day03_LocatorsGiris;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorsGiris {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
   "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");

      //  Main method oluşturun ve aşağıdaki görevi tamamlayın.
      //  1. http://a.testaddressbook.com/sign_in adresine gidiniz.
      //  2. email textbox,password textbox, and signin button elementlerini locate ediniz..
      //  3. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
      //  4. Username : testtechproed@gmail.com
      //  5. Password : Test1234!
      //  6. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        // <a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>

        // sign in linkini bulur
        WebElement signInLinki = driver.findElement(By.id("sign-in"));

        //signInLinkini tiklar
        signInLinki.click();

        //email kutusunu bulduk
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        // Password kutusuna yazı yolladık
        emailKutusu.sendKeys("testtechproed@gmail.com");

        // Password kutusunu bulduk
        WebElement passwordKutusu = driver.findElement(By.id("session_password"));
        //Password kutusuna sifre yolladık
        passwordKutusu.sendKeys("Test1234!");

        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();


        driver.get("http://a.testaddressbook.com");
        String testSitesi = driver.getCurrentUrl();
        System.out.println(testSitesi);

        if (testSitesi.contains("http://a.testaddressbook.com")){
            System.out.println("Giris Basarılı");
        }else{
            System.out.println("Giris Basarisiz");
        }







    }
}
