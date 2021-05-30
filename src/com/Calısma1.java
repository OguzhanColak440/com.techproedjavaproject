package com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Calısma1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
    "C:/Users/hp/Documents/selenium dependencies/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://google.com");
        WebElement searcKutusu= driver.findElement(By.name("q"));
        searcKutusu.sendKeys("Gram Altın");
        searcKutusu.submit();
        WebElement sonuc = driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());
















    }
}
