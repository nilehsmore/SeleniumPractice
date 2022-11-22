package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_22_webelementmethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.applitools.com/");

        WebElement button = driver.findElement(By.id("log-in"));

     boolean value=   button.isDisplayed();

        System.out.println("display status :"+ value);

    }
}