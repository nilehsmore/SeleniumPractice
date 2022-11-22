package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_13_youtube {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("my mother told me");
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();

        driver.findElement(By.xpath("//*[@id='skip-button:6']/span/button")).click();

    }
}
