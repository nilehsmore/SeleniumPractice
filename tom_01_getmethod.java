package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tom_01_getmethod {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        Thread.sleep(5000L);

        System.setProperty("webdriver.gecko.driver", "E:\\Chromedriver\\geckodriver.exe\\"); //firefox
        WebDriver driver2 = new FirefoxDriver(); // Creating an object of FirefoxDriver (with driver 2)

        driver2.get("https://gmail.com");
        Thread.sleep(5000L);

       /* WebDriver driver3 = new SafariDriver();

        driver3.get("https://www.mtu.edu/mechanical/engineering/");
        Thread.sleep(5000L); */


        driver2.close(); // firefox
        driver.close(); // chrome

    }
}
