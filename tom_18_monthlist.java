package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class tom_18_monthlist {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/signup");
        Thread.sleep(5000L);

        driver.manage().window().maximize();

        WebElement month =driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select s =new Select(month);
        List <WebElement> r = s.getOptions();

        for (WebElement a: r){
            System.out.println(a.getText());
    }
    }
}