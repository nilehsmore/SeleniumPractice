package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tom_17_fbsignup {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/signup");
        Thread.sleep(5000L);
        driver.manage().window().maximize();

        Select day = new Select(driver.findElement(By.id("day")));
        Thread.sleep(1000);
        day.selectByVisibleText("31");
        Select month = new Select(driver.findElement(By.id("month")));
        Thread.sleep(1000);
        month.selectByValue("12");
        Select year = new Select(driver.findElement(By.id("year")));
        Thread.sleep(1000);
        year.selectByValue("1950");
        driver.findElement(By.name("websubmit")).click();

    }
}
