package Selenium_Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tom_23_Alert_Sendkeys {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\\E:\\Chromedriver\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("nilesh");
        alert.accept();
        System.out.println("name entered");

    }
}
class  tom_23_Sendkeys02{

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\\E:\\Chromedriver\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        alert.sendKeys("nilesh");
        alert.accept();

        System.out.println("name entered");

    }
}